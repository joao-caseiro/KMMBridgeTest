pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        google()
        mavenCentral()
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
    }
}

include(
    "stupidmodule",
//    "moduleTwo",
//    "breeds",
//    "domain",
//    "analytics",
    "allshared",
//    "core",
    ":testapps:android"

)
