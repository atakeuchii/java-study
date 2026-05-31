(ns java-study.day1
  (:import [java.time LocalDate]))

(defn -main []
  (let [text "123"]
    (println "text =" text)
    (println "upper =" (.toUpperCase text)))

  (let [n (Integer/parseInt "123")]
    (println "parsed =" n)
    (println "max =" (Math/max (int n) (int 100))))

  (let [today (LocalDate/now)]
    (println "today = " (str today))
    (println "plus 7 days = " (str (.plusDays today 7)))))
