(ns hello-world.two)

(letfn [(answer [] "2")]
  (defn get-answer []
    (answer)))
