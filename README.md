# Lexical Scoping of `letfn` across namespaces

This repository shows how lexical scoping of `letfn` works across different namespaces.

## About

It seems that there is an unexpected behavior between the ClojureScript compiler (~v1.0.495) and Google Closure that causes incorrect behavior of `letfn` when a letfn is defined in multiple namespaces, but the fn is named the same.

```clojure
(ns hello-world.one)

(letfn [(answer [] "1")]
  (defn get-answer []
    (answer)))

(ns hello-world.two)

(letfn [(answer [] "2")]
  (defn get-answer []
    (answer)))

(ns hello-world.core
  (:require [hello-world.one]
            [hello-world.two]))

(println "one =>" (hello-world.one/get-answer))  ; one => 1
(println "two =>" (hello-world.two/get-answer))  ; two => 1      WHAT?!?
```

