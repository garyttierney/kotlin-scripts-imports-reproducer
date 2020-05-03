plugins {
    java
    kotlin("jvm") version "1.3.71"
}


repositories {
    maven { setUrl("https://oss.sonatype.org/content/repositories/snapshots") }
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    api(kotlin("scripting-jvm"))
    api(project(":common"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}