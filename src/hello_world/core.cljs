(ns hello-world.core
  (:require [hello-world.one]
            [hello-world.two]))

(enable-console-print!)

(println "letfn     one =>" (hello-world.one/get-answer-letfn))
(println "letfn     two =>" (hello-world.two/get-answer-letfn))
(println "let       one =>" (hello-world.one/get-answer-let))
(println "let       two =>" (hello-world.two/get-answer-let))
(println "let-letfn one =>" (hello-world.one/get-answer-let-letfn))
(println "let-letfn two =>" (hello-world.two/get-answer-let-letfn))


(defn ^:export getAnswers []
 #js [(str "letfn one => " (hello-world.one/get-answer-letfn))
      (str "letfn two => " (hello-world.two/get-answer-letfn))
      (str "let   one => " (hello-world.one/get-answer-let))
      (str "let   two => " (hello-world.two/get-answer-let))
      (str "let-letfn one => " (hello-world.one/get-answer-let-letfn))
      (str "let-letfn two => " (hello-world.two/get-answer-let-letfn))])
