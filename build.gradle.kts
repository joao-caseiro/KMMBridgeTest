plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.kmmbridge) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.cocoapods) apply false
    alias(libs.plugins.sqlDelight) apply false
    alias(libs.plugins.skie) apply false
    alias(libs.plugins.compose.compiler) apply false
}

// Baseline configuration
//subprojects {
//    plugins.withType<JavaBasePlugin> {
//        configure<JavaPluginExtension> {
//            toolchain {
//                languageVersion.set(of(11))
//            }
//        }
//    }
//    plugins.withType<AndroidBasePlugin> {
//        configure<BaseExtension> {
//            compileSdkVersion(35)
//            defaultConfig {
//                minSdk = 26
//                targetSdk = 35
//            }
//            compileOptions {
//                // https://developer.android.com/studio/write/java8-support
//                isCoreLibraryDesugaringEnabled = true
//            }
//        }
//
//        dependencies {
//            // https://developer.android.com/studio/write/java8-support
//            "coreLibraryDesugaring"(libs.android.desugar)
//        }
//    }
//}
//
//
//subprojects {
//    afterEvaluate {
//        val group = group.toString()
//        plugins.withType<LibraryPlugin> {
//            configure<BaseExtension> {
//                namespace = group
//            }
//        }
//    }
//}

subprojects {
//    apply(from = "${rootDir}/publish.gradle")
//
//    if (projectDir.name != "app" && projectDir.name != "core") {
//        task("cleanLibsModule") {
//            dependsOn("clean")
//        }
//        task("buildLibsModule") {
//            dependsOn("build")
//        }
//        task("publishLibsModule") {
//            dependsOn("publish")
//        }
//    }

    val GROUP: String by project
    val LIBRARY_VERSION: String by project

    group = GROUP
    version = LIBRARY_VERSION

//    apply from: "${rootDir}/publish.gradle"
//
//    if (projectDir.name != "app" && projectDir.name != "core" ) {
//        task cleanLibsModule {
//            dependsOn 'clean'
//        }
//        task buildLibsModule {
//            dependsOn 'build'
//        }
//        task publishLibsModudependsOn 'publish'
//        }
//    }



//    ext {
//        allDependencies = [
//            "di",
//            "digitalaccount",
//            "extensions",
//            "activation"
//        ]
//    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
