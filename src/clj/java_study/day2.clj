(ns java-study.day2
  (:import [java_study.day2 Greeting]))

(defn -main []
  (println "static =" (Greeting/staticMessage "Clojure"))

  (let [greeting (Greeting. "Java")]
    (println "instance =" (.message greeting))))
