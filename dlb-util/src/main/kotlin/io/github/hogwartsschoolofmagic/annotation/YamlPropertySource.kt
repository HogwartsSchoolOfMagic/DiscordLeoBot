package io.github.hogwartsschoolofmagic.annotation

import io.github.hogwartsschoolofmagic.factory.YamlPropertySourceFactory
import org.springframework.context.annotation.PropertySource
import org.springframework.core.annotation.AliasFor
import org.springframework.core.io.support.PropertySourceFactory
import kotlin.reflect.KClass

/**
 * Аннотация, позволяющая подключить файл конфигурации формата yml/yaml.
 */
@PropertySource
annotation class YamlPropertySource(
    @get: AliasFor(annotation = PropertySource::class)
    val name: String = "",

    @get: AliasFor(annotation = PropertySource::class)
    val value: Array<String> = [],

    @get: AliasFor(annotation = PropertySource::class)
    val ignoreResourceNotFound: Boolean = false,

    @get: AliasFor(annotation = PropertySource::class)
    val encoding: String = "",

    @get: AliasFor(annotation = PropertySource::class)
    val factory: KClass<out PropertySourceFactory> = YamlPropertySourceFactory::class
)