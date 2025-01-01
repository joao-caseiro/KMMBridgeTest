import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    `maven-publish`
}

group = "com.yetanothername.simpletest.moduleTwo"
//version = "1.0.0"

kotlin {
    androidTarget {
        publishAllLibraryVariants()
    }
    jvm("desktop")
//    iOS {
        iosX64()
        iosArm64()
        iosSimulatorArm64()
//    }

    sourceSets {
        commonMain {
            dependencies {

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
    namespace = "com.yetanothername.simpletest.moduleTwo"
}

// For publishing Android AAR files to GitHub Packages
addGithubPackagesRepository()
