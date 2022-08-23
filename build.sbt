// SparkSQL can work with a Spark built with Scala 2.11 too.

scalaVersion := "2.12.10"

version := "1.0.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.2.1" % "provided",
  "org.apache.spark" %% "spark-sql" % "3.2.1" % "provided",
  "org.scalatest" %% "scalatest" % "3.2.12"
)

