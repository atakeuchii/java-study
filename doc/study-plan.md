# Java interop 学習メモ

## 目的

このプロジェクトでは、ClojureからJava/JVM上のクラスやライブラリを利用するために、Javaの基本APIとinteropの考え方を学ぶ。目的はJavaアプリを作り込むことではなく、実務のClojureコードに出てくる `:import`、Javaメソッド呼び出し、例外、日付、DB、I/O、外部ライブラリ利用を読める・書ける状態にすることである。

対象は `java.lang`、`java.time`、`java.sql`、`java.util`、`java.io`、`java.nio`、`java.net`、`org.postgresql.util`、`com.zaxxer.hikari`、`io.minio` など。

## 方針

基本的に書くコードはJavaを中心にする。Clojure側では、作成したJava classやJava標準APIを `:import` し、Clojureから呼び出せることを確認する。

## ソース配置と実行

学習用に専用プロジェクトを1つ作る。

```text
java-interop-study/
  project.clj
  src/
    clj/java_study/day01.clj
    clj/java_study/day02.clj
    ...
    java/javastudy/day02/Greeter.java
    java/javastudy/day03/StringPractice.java
    ...
```

Clojure namespaceは `java-study.day01`、ファイルパスは `java_study/day01.clj` とする。

```clojure
(defproject java-interop-study "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.11.3"]]
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]
  :target-path "target/%s")
```

Java classを作る日は、先にコンパイルする。

```bash
lein javac
lein run -m java-study.day02
```

## 学習計画

| Day | テーマ                                    | 重点ポイント                                                                              | 成果物                       |
| --: | -------------------------------------- | ----------------------------------------------------------------------------------- | ------------------------- |
|   1 | JVM / classpath / `require` と `import` | JVM、`.class`、`.jar`、classpath、ClojureからJava classを呼ぶ仕組み、`java.lang`                 | interop確認用の小さなClojureコード  |
|   2 | Java classを作ってClojureから呼ぶ              | Javaのpackage、class、constructor、instance method、static method、`:import`              | `Greeter.java` と呼び出し確認コード |
|   3 | `String` / `StringBuilder` / 正規表現      | `contains`、`substring`、`split`、`replace`、`StringBuilder`、regex                      | 文字列加工用Java class          |
|   4 | `java.util` Collections                | `List`、`ArrayList`、`Map`、`HashMap`、`Set`、`Iterator`、破壊的変更                           | Collection操作のJava class   |
|   5 | `Optional` / UUID / 配列 / generics      | `Optional`、`UUID`、配列、`List<String>`、APIドキュメントの型表記                                   | 型・Optional確認用Java class   |
|   6 | null / 例外 / checked exception          | `null`、`NullPointerException`、`try-catch-finally`、checked exception、`throw`         | 例外を投げる/捕捉するJava class     |
|   7 | `java.time` / `java.sql`               | `LocalDate`、`LocalDateTime`、`Instant`、`Timestamp`、DB向け日付型                           | 日付変換用Java class           |
|   8 | `java.io` / `java.nio`                 | `File`、`InputStream`、`Reader`、`Path`、`Files`、stream close                           | ファイル読み書きJava class        |
|   9 | `java.net`                             | `URI`、`URL`、`URLEncoder`、URL文字列とURIの違い                                              | URL/URI操作用Java class      |
|  10 | JDBC / PostgreSQL / `PGobject`         | `Connection`、`PreparedStatement`、`ResultSet`、`PGobject`、JSONB                       | DB型・PGobject確認コード         |
|  11 | HikariCP / MinIO / 総合演習                | `HikariConfig`、`HikariDataSource`、builder pattern、`MinioClient`、stream、実務importの総復習 | HikariCP/MinIOの最小利用コード    |

## 毎日の出力形式

1. 今日のテーマ
2. 今日のゴール
3. Javaのサンプルコード
4. 実行手順
5. 動作確認方法
6. よくある詰まりどころ
7. 小さな改造課題

## 学習時の注意

- 1回の内容は長くしすぎず、その日の最小実装に絞る
- コードはコピペ可能な形で出す
- 詳細説明は質問されたときに深掘りする
