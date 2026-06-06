(ns java-study.day6
  (:import [java_study.day6 ExceptionPractice]
           [java.io IOException]))

(defn -main[]
  (let [practice (ExceptionPractice.)]
    (println "name =" (.getName practice false))
    
    (try
      (println (.nameLength practice false))
      (catch Exception e
        (println "caught class =" (class e))
        (println "caught message =" (.getMessage e))))
    
    (try
      (.validateAge practice -1)
      (catch IllegalArgumentException e
        (println "caught:" (.getMessage e))))
    
    (try
      (println (.readData practice true))
      (catch IOException e
        (println "caught:" (.getMessage e))))))
