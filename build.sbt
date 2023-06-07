ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "weatherApp"
  )

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.32"
libraryDependencies += "com.typesafe.slick" %% "slick" % "3.5.0-M3"



