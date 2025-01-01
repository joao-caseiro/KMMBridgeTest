plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kmmbridge)
    alias(libs.plugins.skie)
    alias(libs.plugins.cocoapods)
    `maven-publish`
}

kotlin {
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "KMMBridgeSKIETemplate"
        homepage = "https://www.touchlab.co"
        ios.deploymentTarget = "13.5"
        extraSpecAttributes["libraries"] = "'c++', 'sqlite3'"
        license = "BSD"
        extraSpecAttributes.put("swift_version", "\"5.0\"") // <- SKIE Needs this!
        framework {
            export(project(":moduleOne"))
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":moduleTwo"))
            api(project(":moduleOne"))
        }
    }
}

kmmbridge {
    mavenPublishArtifacts()
    spm()
    cocoapods("git@github.com:touchlab/KotlinPodspecs.git")
}
