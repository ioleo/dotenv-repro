lazy val root = (project in file(".")).settings(
  name                      := "dotenv",
  ThisBuild / version       := "1.0.0-SNAPSHOT",
  Compile / run / mainClass := Some("dotenv.example"),
  scalaVersion              := "3.2.0",
  scalacOptions ++= Seq(
    "-deprecation",     // emit warning and location for usages of deprecated APIs
    "-feature",         // emit warning and location for usages of features that should be imported explicitly
    "-unchecked",       // enable additional warnings where generated code depends on assumptions
    "-Xfatal-warnings", // fail the compilation if there are any warnings
    /**
     * Scala 3
     */
    "-explain",         // explain errors in more detail
    "-explain-types",   // explain type errors in more detail
    "-indent",          // allow significant indentation
    "-new-syntax",      // require `then` and `do` in control expressions
    "-print-lines",     // show source code line numbers
    "-Ykind-projector", // allow `*` as wildcard to be compatible with kind projector
    "-Xmigration"       // warn about constructs whose behavior may have changed since version
  )
)
