/**
 * Константы с названиями групп библиотек.
 */
object Groups {
    /* Spring */
    const val SPRING_BOOT = "org.springframework.boot"

    /* Базы данных */
    const val POSTGRES = "org.postgresql"
    const val LIQUIBASE = "org.liquibase"
    const val R2DBC = "io.r2dbc"

    /* Reactor */
    const val NETTY = "io.netty"

    /* Discord */
    const val KORD = "dev.kord"

    /* Сериализация */
    const val JACKSON = "com.fasterxml.jackson.module"

    /* Kotlin */
    const val KTX = "org.jetbrains.kotlinx"
    const val REACTOR_KT = "io.projectreactor.kotlin"
    const val KT = "org.jetbrains.kotlin"
}

/**
 * Константы с названиями артефактов библиотек.
 */
object Artifacts {
    /* Spring */
    const val SPRING_BOOT = "spring-boot"
    const val SPRING_BOOT_STARTER = "${SPRING_BOOT}-starter"
    const val SPRING_BOOT_DATA_R2DBC = "${SPRING_BOOT}-starter-data-r2dbc"
    const val SPRING_BOOT_DATA_WEBFLUX = "${SPRING_BOOT}-starter-webflux"

    /* Базы данных */
    const val POSTGRES = "postgresql"
    const val LIQUIBASE = "liquibase-core"
    const val PG_R2DBC = "r2dbc-postgresql"

    /* Reactor */
    const val NETTY_CODEC = "netty-codec-http"

    /* Discord */
    const val KORD_CORE = "kord-core"

    /* Kotlin */
    const val KTX_REACTOR = "kotlinx-coroutines-reactor"
    const val JACKSON_KT = "jackson-module-kotlin"
    const val REACTOR_KT_EXT = "reactor-kotlin-extensions"
    const val KT_REFLECT = "kotlin-reflect"
}

/**
 * Константы с версиями библиотек.
 */
object Versions {
    /* Spring */
    const val SPRING_BOOT = "3.0.4"

    /* Базы данных */
    const val PG_R2DBC = "0.8.13.RELEASE"

    /* Reactor */
    const val NETTY_CODEC = "4.1.89.Final"

    /* Discord */
    const val KORD_CORE = "0.8.0-M17"

    /* Kotlin */
    const val KT = "1.8.10"
}

/**
 * Константы с полным именем подключаемой библиотеки.
 */
object Libs {
    /* Spring */
    const val SPRING_BOOT = "${Groups.SPRING_BOOT}:${Artifacts.SPRING_BOOT}"
    const val SPRING_BOOT_STARTER = "${Groups.SPRING_BOOT}:${Artifacts.SPRING_BOOT_STARTER}"
    const val SPRING_BOOT_DATA_R2DBC = "${Groups.SPRING_BOOT}:${Artifacts.SPRING_BOOT_DATA_R2DBC}"
    const val SPRING_BOOT_DATA_WEBFLUX = "${Groups.SPRING_BOOT}:${Artifacts.SPRING_BOOT_DATA_WEBFLUX}"

    /* Базы данных */
    const val PG_R2DBC = "${Groups.R2DBC}:${Artifacts.PG_R2DBC}:${Versions.PG_R2DBC}"
    const val POSTGRES = "${Groups.POSTGRES}:${Artifacts.POSTGRES}"
    const val LIQUIBASE = "${Groups.LIQUIBASE}:${Artifacts.LIQUIBASE}"

    /* Discord */
    const val KORD_CORE = "${Groups.KORD}:${Artifacts.KORD_CORE}:${Versions.KORD_CORE}"

    /* Reactor */
    const val NETTY_CODEC = "${Groups.NETTY}:${Artifacts.NETTY_CODEC}:${Versions.NETTY_CODEC}"

    /* Kotlin */
    const val KOTLINX_REACTOR = "${Groups.KTX}:${Artifacts.KTX_REACTOR}"
    const val JACKSON_KT = "${Groups.JACKSON}:${Artifacts.JACKSON_KT}"
    const val REACTOR_KT_EXT = "${Groups.REACTOR_KT}:${Artifacts.REACTOR_KT_EXT}"
    const val KT_REFLECT = "${Groups.KT}:${Artifacts.KT_REFLECT}"
}

/**
 * Константы с названиями плагинов.
 */
object Plugins {
    /* Spring */
    const val SPRING_ALIAS = "plugin.spring"
    const val SPRING = "${Groups.KT}.${SPRING_ALIAS}"
    const val SPRING_BOOT = Groups.SPRING_BOOT
    const val SPRING_DEPS = "io.spring.dependency-management"

    /* Kotlin */
    const val JVM = "jvm"
    const val KT = "kotlin"
}

/**
 * Остальные полезные константы.
 */
object Common {
    const val PROJECT_GROUP = "io.github.hogwartsschoolofmagic"
    const val PROJECT_VERSION = "2023.1"
    const val JDK_VERSION = "17"
    const val JSR305 = "-Xjsr305=strict"
}