name := "Lift-Bug-Sample"

version := "0.0.1"

organization := "com.ontheserverside"

scalaVersion := "2.11.7"

resolvers ++= Seq("snapshots"     at "https://oss.sonatype.org/content/repositories/snapshots",
                  "releases"        at "https://oss.sonatype.org/content/repositories/releases"
                 )

libraryDependencies ++= {

  Seq(
    "net.liftweb"       %% "lift-webkit"        % "2.6"        % "compile",
    //"net.liftweb"       %% "lift-webkit"        % "3.0-RC1"        % "compile",
    "net.liftmodules"   %% "lift-jquery-module_2.6" % "2.9",
    //"net.liftmodules"   %% "lift-jquery-module_3.0" % "2.9",
    "javax.servlet"     % "javax.servlet-api"   % "3.0.1"            % "provided",
    "org.eclipse.jetty" % "jetty-webapp"        % "9.3.7.v20160115"  % "container",
    "ch.qos.logback"    % "logback-classic"     % "1.1.5"
  )
}

enablePlugins(JettyPlugin)
