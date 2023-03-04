plugins {
    id(Plugins.SPRING_BOOT)
}

dependencies {
    /* Основная библиотека для работы с Discord API */
    implementation(Libs.KORD_CORE)

    /* Spring */
    implementation(Libs.SPRING_BOOT_DATA_WEBFLUX)

    /* Kotlin */
    implementation(Libs.JACKSON_KT)
    implementation(Libs.REACTOR_KT_EXT)
    implementation(Libs.KT_REFLECT)
    implementation(Libs.KOTLINX_REACTOR)

    /* Проектные модули */
    implementation(project(":dlb-database"))
}