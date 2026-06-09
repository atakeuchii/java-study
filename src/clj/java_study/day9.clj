(ns java-study.day9
  (:import [java_study.day9 UrlPractice]))

(defn -main []
  (let [practice (UrlPractice.)
        url "https://example.com/user?id=123"]
    (println "uri =" (.createUri practice url))
    (println "host =" (.getHost practice url))
    (println "path =" (.getPath practice url))
    
    (println "encoded =" (.encode practice "hello world"))))
