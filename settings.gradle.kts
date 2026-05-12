rootProject.name = "Museum"
// enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
		includeBuild("build-logic")
		plugins {
			id("org.jetbrains.kotlin.multiplatform.gradle.plugin") version "2.2.21"
		}
    repositories {
				maven("https://repo1.maven.org/maven2")
				maven("https://mvnrepository.com/artifact")
				maven("https://central.sonatype.com/artifact")
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    // repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
				maven("https://repo1.maven.org/maven2")
				maven("https://mvnrepository.com/artifact")
				maven("https://central.sonatype.com/artifact")
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

include(":appTouristAndroid")
include(":appGuideAndroid")
include(":appCreatorWeb")
include(":service")
include(":buildLogic")
