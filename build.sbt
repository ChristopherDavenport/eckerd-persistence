name := "eckerd-persistence"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.8"

// Change this to another test framework if you prefer
libraryDependencies ++= List(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "com.typesafe.slick" %% "slick" % "3.1.0",
  "com.typesafe.slick" %% "slick-extensions" % "3.1.0",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.1.0"
)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

