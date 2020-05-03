pluginManagement {
    repositories {
        maven { setUrl("https://oss.sonatype.org/content/repositories/snapshots") }

        mavenCentral()

        maven { setUrl("https://plugins.gradle.org/m2/") }
    }
}
rootProject.name = "kotlin-scripting-imports-reproducer"

include("script-api")
include("script-examples")
include("common")
