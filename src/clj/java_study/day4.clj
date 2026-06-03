(ns java-study.day4
  (:import [java_study.day4 CollectionPractice]))

(defn -main []
  (let [practice (CollectionPractice.)
        names (.createNames practice)
        scores (.createScores practice)
        unique-names (.createUniqueNames practice)]
    (doseq [name names]
      (println "name =" name))
    (doseq [[name score] scores]
      (println name ": " score))
    
    (println "names =" (str names))
    (println "scores =" (str scores))
    (println "unique names =" unique-names)
    (println "joined =" (.joinByIterator practice names))
    
    (println "before add =" names)
    (println "count names =" (count names))
    (.addName practice names "Carol")
    (println "after add =" names)
    (println "count names =" (count names))
    (println "joined =" (.joinByIterator practice names))))
