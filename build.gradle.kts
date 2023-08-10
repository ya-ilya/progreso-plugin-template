val pluginGroup: String by project
val pluginVersion: String by project
val progresoVersion: String by project
val minecraftVersion: String by project
val yarnMappings: String by project
val loaderVersion: String by project
val fabricVersion: String by project
val fabricKotlinVersion: String by project

plugins {
    kotlin("jvm")
    id("fabric-loom")
}

group = pluginGroup
version = pluginVersion

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    "minecraft"("com.mojang:minecraft:$minecraftVersion")
    "mappings"("net.fabricmc:yarn:$yarnMappings:v2")

    modImplementation("net.fabricmc:fabric-loader:$loaderVersion")
    modImplementation("net.fabricmc.fabric-api:fabric-api:$fabricVersion")
    modImplementation("net.fabricmc:fabric-language-kotlin:$fabricKotlinVersion")

    implementation("com.github.ya-ilya:progreso:$progresoVersion")
}

tasks.processResources {
    inputs.property("version", version)

    filesMatching("fabric.mod.json") {
        expand(
            mapOf(
                "version" to version
            )
        )
    }
}