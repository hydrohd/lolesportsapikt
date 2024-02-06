plugins {
    kotlin("jvm") version "1.9.21"
    kotlin("plugin.serialization") version "1.9.21"
    `java-library`
    `maven-publish`
}

group = "com.github.hydrohd"
version = "1.0-SNAPSHOT"

publishing {
    publications{
        create<MavenPublication>("lolesportsapikt"){
            groupId = project.group.toString()
            artifactId = project.name
            from(components["java"])
        }
    }
}
repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

val ktor_version: String by project
val logback_version: String by project
dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("io.ktor:ktor-client-core:$ktor_version")
    implementation("io.ktor:ktor-client-cio:$ktor_version")
    implementation("io.ktor:ktor-client-content-negotiation:$ktor_version")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.2")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")
    implementation("io.ktor:ktor-client-auth:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("io.ktor:ktor-client-logging:$ktor_version")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}