
scalaVersion := "2.12.3" // <- if this is 2.11.11, it works fine
version := "0.1.0-SNAPSHOT"
ScriptedPlugin.scriptedSettings :+ (
  resolvers += Resolver.typesafeIvyRepo("releases")
)
