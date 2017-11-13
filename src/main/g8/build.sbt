
name := "sbt-idlc"

version := $version$

scalaVersion := $scalaVersion$

sbtPlugin := true

organization := "$organization$"

resolvers += Resolver.mavenLocal


libraryDependencies ++= Seq(
  "com.isuwang" % "hello-api_2.12" % $version$,
  "com.isuwang" % "dapeng-remoting-api" % "1.2.1",
  "com.isuwang" % "dapeng-core" % "1.2.1",
  "com.isuwang" % "dapeng-remoting-netty" % "1.2.1",
  "com.isuwang" % "dapeng-spring" % "1.2.1" exclude("org.springframework", "spring-context"),
  "com.isuwang" % "dapeng-registry-zookeeper" % "1.2.1"
)

lazy val commonSettings = Seq(
  organization := "$organization$",
  version := $version$,
  scalaVersion := $scalaVersion$
)
