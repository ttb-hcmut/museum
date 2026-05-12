plugins {
	`kotlin-dsl`
}

repositories {
	maven("https://mvnrepository.com/artifact")
	gradlePluginPortal()
}

dependencies {
	implementation("org.jetbrains.kotlin.multiplatform:org.jetbrains.kotlin.multiplatform.gradle.plugin:2.2.21")
}
