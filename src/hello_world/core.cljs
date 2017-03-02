(ns hello-world.core
  (:require [hello-world.one]
            [hello-world.two]))

(enable-console-print!)

(println "one =>" (hello-world.one/get-answer))
(println "two =>" (hello-world.two/get-answer))

(defn ^:export getAnswers []
 #js [(str "one => " (hello-world.one/get-answer))
      (str "two => " (hello-world.two/get-answer))])
