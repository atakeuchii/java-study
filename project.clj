(defproject java-study "0.1.0-SNAPSHOT"
  :description "ClojureからJava/JVM APIを呼び出すためのJava interop学習プロジェクト"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.5"]
                 [org.postgresql/postgresql "42.7.11"]
                 [com.zaxxer/HikariCP "7.0.2"]
                 [io.minio/minio "9.0.1"]
                 [org.slf4j/slf4j-simple "2.0.17"]]
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]
  :resource-paths ["resources"]
  :test-paths ["test"]
  :javac-options ["--release" "11" "-Xlint:all"]
  :aliases {"day1" ["run" "-m" "java-study.day1"]}
  :target-path "target/%s"
  :repl-options {:init-ns java-study.core})
