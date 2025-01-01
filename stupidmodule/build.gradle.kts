import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    `maven-publish`
}

group = "co.uk.simpletest.product.finder"
//version = "1.0.0"

kotlin {
    androidTarget {
        publishAllLibraryVariants()
    }
//    iOS {
        iosX64()
        iosArm64()
        iosSimulatorArm64()
//    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.touchlab.stately.concurrency)
            }
        }
    }

    @OptIn(ExperimentalKotlinGradlePluginApi::class)
    compilerOptions {
        jvmToolchain(17)
    }
}

android {
    compileSdk = libs.versions.compileSdk.get().toInt()

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
    }
    namespace = "com.anothername.simpletest.moduleOne"
}

// For publishing Android AAR files to GitHub Packages
addGithubPackagesRepository()
