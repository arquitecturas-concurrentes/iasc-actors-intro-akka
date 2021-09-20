name := "simpleActorExample"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.6.8",
  "com.typesafe.akka" %% "akka-testkit" % "2.6.8" % Test
)
