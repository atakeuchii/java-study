(ns java-study.day8
  (:import [java_study.day8 FilePractice]
           [java.io IOException]))

(defn -main []
  (let [practice (FilePractice.)]
    (try
      (.writeFile practice
                  "sample.txt"
                  "Hello, Java")
      
      (println "exists =" (.exists practice "sample.txt"))
      
      (println "content =" (.readFile practice "sample.txt"))
      
      (catch IOException e
        (println "caught:" (.getMessage e))))))
