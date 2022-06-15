plugins {
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.serialization") version "1.6.21"
}

repositories {
    mavenCentral()
}

dependencies {
    fun kotlinx(name: String, version: String) = "org.jetbrains.kotlinx:kotlinx-$name:$version"
    fun ktor(name: String, version: String) = "io.ktor:ktor-$name:$version"
    fun aws(name: String) = "software.amazon.awssdk:$name"

    implementation(kotlin("stdlib-jdk8"))

    implementation(kotlinx("serialization-json", "1.3.3"))
    implementation(kotlinx("coroutines-core", "1.6.2"))
    implementation(kotlinx("coroutines-jdk8", "1.6.2"))

    implementation(ktor("client-core", "2.0.2"))
    implementation(ktor("client-cio", "2.0.2"))

    implementation(platform("software.amazon.awssdk:bom:2.17.211"))
    implementation(aws("ecs"))
}