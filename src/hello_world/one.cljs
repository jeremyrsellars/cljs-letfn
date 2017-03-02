(ns hello-world.one)

(letfn [(answer [] "1")]
  (defn get-answer []
    (answer)))
