(ns java-study.day7
  (:import [java_study.day7 DatePractice]))

(defn -main []
  (let [practice (DatePractice.)]
    (println "today =" (str (.today practice)))
    
    (println "parsed ="
             (str (.parseDate practice "2026-06-01")))
    
    (println "formatted ="
             (.formatDate practice (.parseDate practice "2026-06-01")))
    
    (println "datetime =" (str (.now practice)))
    
    (println "timestamp =" (str (.nowTimestamp practice)))))
