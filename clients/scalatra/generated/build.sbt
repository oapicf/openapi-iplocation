organization := "org.openapitools"
name := "org.openapitools-openapi-server"
version := "1.0.0"
scalaVersion := "2.12.4"

mainClass in assembly := Some("JettyMain")

val ScalatraVersion = "2.6.2"

libraryDependencies ++= Seq(
  "org.scalatra"      %% "scalatra"             % ScalatraVersion,
  "org.scalatra"      %% "scalatra-swagger"     % ScalatraVersion,
  "org.scalatra"      %% "scalatra-scalatest"   % ScalatraVersion % Test,
  "org.json4s"        %% "json4s-jackson"       % "3.5.0",
  "org.eclipse.jetty" %  "jetty-server"         % "9.4.8.v20171121",
  "org.eclipse.jetty" %  "jetty-webapp"         % "9.4.8.v20171121",
  "javax.servlet"     %  "javax.servlet-api"    % "3.1.0",
  "ch.qos.logback"    %  "logback-classic"      % "1.2.3" % Provided
)

enablePlugins(JettyPlugin)