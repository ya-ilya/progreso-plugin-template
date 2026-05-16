rootProject.name = "progreso-plugin-template"

pluginManagement {
    val kotlinVersion: String by settings
    val fabricLoomVersion: String by settings

    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.fabricmc.net/")
    }

    plugins {
        kotlin("jvm") version kotlinVersion
        id("net.fabricmc.fabric-loom") version fabricLoomVersion
    }
}