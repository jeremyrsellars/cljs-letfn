(ns hello-world.one)

(letfn [(letfn-answer [] "1")]
  (defn get-answer-letfn []
    (letfn-answer)))

(let [let-answer (fn [] "1")]
  (defn get-answer-let []
    (let-answer)))

(let [a :a]
  (letfn [(let-letfn-answer [] "1")]
    (defn get-answer-let-letfn []
      (let-letfn-answer))))
