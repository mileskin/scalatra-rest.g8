resolvers += Classpaths.typesafeResolver

libraryDependencies <+= sbtVersion(v => v match {
  case x if (x.startsWith("0.12")) => "com.github.siasia" %% "xsbt-web-plugin" % "0.12.0-0.2.11.1"
})

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.1.0")

