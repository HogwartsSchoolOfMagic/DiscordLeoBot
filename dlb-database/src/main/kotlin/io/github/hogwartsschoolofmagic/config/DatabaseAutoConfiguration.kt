package io.github.hogwartsschoolofmagic.config

import io.github.hogwartsschoolofmagic.annotation.YamlPropertySource
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

/**
 * Авто-конфигурация библиотеки подключения работы с БД.
 */
@Configuration
@EnableR2dbcRepositories
@YamlPropertySource(value = ["classpath:database.yml"])
class DatabaseAutoConfiguration