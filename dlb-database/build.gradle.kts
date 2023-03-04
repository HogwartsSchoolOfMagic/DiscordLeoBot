plugins {
    id(Plugins.SPRING_BOOT)
}

tasks.findByName("bootJar")?.apply {
    enabled = false
}

dependencies {
    /* Spring */
    runtimeOnly(Libs.SPRING_BOOT_STARTER)

    /* База данных */
    implementation(Libs.SPRING_BOOT_DATA_R2DBC)
    runtimeOnly(Libs.POSTGRES)
    runtimeOnly(Libs.LIQUIBASE)
    runtimeOnly(Libs.PG_R2DBC) {
        exclude(group = Groups.NETTY, module = Artifacts.NETTY_CODEC)
    }
    runtimeOnly(Libs.NETTY_CODEC)

    /* Kotlin */
    implementation(Libs.KOTLINX_REACTOR)

    /* Проектные модули */
    implementation(project(":dlb-util"))
}