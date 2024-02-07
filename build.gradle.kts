plugins {
    java
    kotlin("jvm") version "1.9.21"
    kotlin("plugin.serialization") version "1.9.21"
    `maven-publish`
}

group = "com.github.hydrohd"
version = "1.0.2"

publishing {
    publications{
        create<MavenPublication>("maven"){
            groupId = "com.github.hydrohd"
            artifactId = project.name

            from(components["java"])
        }
    }
}
repositories {
    mavenCentral()

}

val ktorVersion: String by project
val logbackVersion: String by project
dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("io.ktor:ktor-client-core:$ktorVersion")
    implementation("io.ktor:ktor-client-cio:$ktorVersion")
    implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.2")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
    implementation("io.ktor:ktor-client-auth:$ktorVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
    implementation("io.ktor:ktor-client-logging:$ktorVersion")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

