(ns hello-world.two)

(letfn [(letfn-answer [] "2")]
  (defn get-answer-letfn []
    (letfn-answer)))

(let [let-answer (fn [] "2")]
  (defn get-answer-let []
    (let-answer)))

(let [a :a]
  (letfn [(let-letfn-answer [] "2")]
    (defn get-answer-let-letfn []
      (let-letfn-answer))))
