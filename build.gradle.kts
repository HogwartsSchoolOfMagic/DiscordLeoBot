import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin(Plugins.JVM) version Versions.KT apply false
    kotlin(Plugins.SPRING_ALIAS) version Versions.KT apply false
    id(Plugins.SPRING_BOOT) version Versions.SPRING_BOOT apply false
}

allprojects {
    group = Common.PROJECT_GROUP
    version = Common.PROJECT_VERSION

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf(Common.JSR305)
            jvmTarget = Common.JDK_VERSION
        }
    }
}

subprojects {
    repositories {
        mavenCentral()
    }

    apply {
        plugin(Plugins.KT)
        plugin(Plugins.SPRING)
        plugin(Plugins.SPRING_DEPS)
    }
}