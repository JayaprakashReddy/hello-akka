name := """hello-akka"""

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.4",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.4",
  "org.scalatest" %% "scalatest" % "2.1.6" % "test",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

// set the main class for 'sbt run'
mainClass in (Compile, run) := Some("WorkingWithListsDriver")

name := "SLF4JTest"

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq("org.slf4j" % "slf4j-api" % "1.7.5","org.slf4j" % "slf4j-simple" % "1.7.5")