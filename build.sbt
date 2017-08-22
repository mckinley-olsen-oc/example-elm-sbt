name := "sample-project"

version := "1.0"

val playVersion = "2.5.4"

libraryDependencies ++= Seq(
  jdbc
)

scalaVersion := "2.11.8"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)

disablePlugins(PlayLayoutPlugin)
PlayKeys.playMonitoredFiles ++= (sourceDirectories in (Compile, TwirlKeys.compileTemplates)).value
