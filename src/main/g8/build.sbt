organization := "spike"

name := "scalatra-rest"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.9.1"

seq(webSettings :_*)

port in container.Configuration := 8660

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.0.4",
  "org.scalatra" %% "scalatra-scalate" % "2.0.4",
  "net.liftweb" %% "lift-json" % "2.5-M1",
  "net.liftweb" %% "lift-json-ext" % "2.5-M1",
  "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.slf4j" % "slf4j-simple" % "1.6.1",
  "org.scalatra" %% "scalatra-scalatest" % "2.0.4" % "test"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

