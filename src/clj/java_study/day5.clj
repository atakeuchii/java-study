(ns java-study.day5
  (:import [java_study.day5 TypePractice]
           [java.util ArrayList]))

(defn -main []
  (let [practice (TypePractice.)]
    
    (println "exists =" (.findName practice true))
    (println "missing =" (.findName practice false))
    
    (println "uuid =" (.createUUID practice))
    (println "array =" (vec (.createArray practice)))
    
    (let [items (ArrayList.)]
      (.add items "apple")
      (.add items "banana")
      (println "first item =" (.firstItem practice items)))))
