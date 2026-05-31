# java-study

`java-study` は、Clojure から Java/JVM のクラスやライブラリを扱うための学習プロジェクトです。

目的は Java アプリケーションを作り込むことではなく、実務の Clojure コードに出てくる `:import`、Java メソッド呼び出し、例外、日付、DB、I/O、外部ライブラリ利用を読める・書ける状態にすることです。

詳細な学習計画は [doc/study-plan.md](doc/study-plan.md) を参照してください。

## 対象

- Java 標準 API: `java.lang`, `java.time`, `java.sql`, `java.util`, `java.io`, `java.nio`, `java.net`
- PostgreSQL JDBC: `org.postgresql.Driver`, `org.postgresql.util.PGobject`
- HikariCP: `com.zaxxer.hikari.HikariConfig`, `com.zaxxer.hikari.HikariDataSource`
- MinIO Java SDK: `io.minio.MinioClient`

## 必要なもの

- JDK 11 以上
- Leiningen

このプロジェクトでは Java ソースを `--release 11` でコンパイルします。HikariCP 7 系も Java 11 を前提にしているため、JDK 8 ではなく JDK 11 以上で実行してください。

## ソース構成

```text
src/
  clj/java_study/
    core.clj
    day1.clj
  java/
    javastudy/
      ...
resources/
test/
doc/
  study-plan.md
```

Clojure の namespace は `java-study.day1`、ファイルパスは `src/clj/java_study/day1.clj` のように配置します。

Java class を追加する場合は `src/java` 以下に package 構成どおりに置き、Clojure 側で `:import` して呼び出します。

## Usage

依存関係の取得と基本確認:

```bash
lein deps
lein test
```

Day 1 の実行:

```bash
lein day1
```

または直接 namespace を指定します。

```bash
lein run -m java-study.day1
```

Java class を追加した日は、先に Java をコンパイルしてから Clojure から呼び出します。

```bash
lein javac
lein run -m java-study.day2
```

REPL を起動する場合:

```bash
lein repl
```

## 依存関係

`project.clj` には、学習計画の後半で使う外部 Java ライブラリをあらかじめ追加しています。

- `org.postgresql/postgresql`: JDBC と `PGobject` の確認用
- `com.zaxxer/HikariCP`: JDBC connection pool と JavaBean 形式の設定確認用
- `io.minio/minio`: builder pattern、stream、外部 SDK 呼び出し確認用
- `org.slf4j/slf4j-simple`: HikariCP などの SLF4J ログ出力用

標準 API の学習には追加依存は不要です。

## 学習時のメモ

- Clojure から Java を呼ぶ箇所では `:import` と型ヒントを意識する
- 反射の確認をしたい日は namespace や REPL で `(set! *warn-on-reflection* true)` を有効にする
- Java 側の package 名とファイルパスがずれると `lein javac` や `:import` で失敗する
- DB や MinIO は、接続先を用意する前でも class の import、constructor、builder、設定 object の扱いから確認する
