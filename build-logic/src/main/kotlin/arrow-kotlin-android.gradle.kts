plugins {
	id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
	sourceSets {
		androidMain.dependencies {
			implementation("io.arrow-kt:arrow-core:1.2.4")
			implementation("io.arrow-kt:arrow-optics:1.2.4")
			implementation("io.arrow-kt:arrow-fx-coroutines:1.2.4") }
	}
}
