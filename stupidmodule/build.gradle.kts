import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import java.util.Properties

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    `maven-publish`
}

group = "co.uk.simpletest.product.finder"
//version = "0.5.0"

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
    namespace = "co.uk.simpletest.product.finder.stupidmodule"
}

// For publishing Android AAR files to GitHub Packages
addGithubPackagesRepository()

//
//val properties = Properties()
//properties.load(project.rootProject.file("local.properties").inputStream())
//publishing {
//    repositories {
//        maven {
//            name = "GitHubPackages"
//            url = uri("https://maven.pkg.github.com/joao-caseiro/KMMBridgeTest")
//            credentials {
//                username = properties.getProperty("github.user")
//                password = properties.getProperty("github.token")
//            }
//        }
//    }
//}
