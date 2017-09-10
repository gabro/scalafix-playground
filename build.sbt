scalaVersion := "2.12.3"
name := "scalafix-playground"

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.6"
libraryDependencies += "org.typelevel" %% "cats" % "0.9.0"

// Needed by RemoveUnusedImport
scalacOptions += "-Ywarn-unused-import"

// Needed by NoAutoTupling
scalacOptions += "-Ywarn-adapted-args"
