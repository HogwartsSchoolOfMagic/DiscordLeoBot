plugins {
    id(Plugins.SPRING_BOOT)
}

tasks.findByName("bootJar")?.apply {
    enabled = false
}

dependencies {
    /* Spring */
    compileOnly(Libs.SPRING_BOOT)
}