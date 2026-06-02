(ns java-study.day3
  (:import [java_study.day3 StringPractice]))

(defn -main []
  (println (StringPractice/containsKeyword "stone event in Tokyo" "event"))
  (println (StringPractice/beforeColon "title: mineral show"))
  (println (seq (StringPractice/splitByComma "apple,banana,grape")))
  (println (StringPractice/replaceSpace "mineral show in Tokyo"))
  (println (StringPractice/buildMessage "Taro" "joined"))
  (println (StringPractice/firstNumber "event id is 12345")))
