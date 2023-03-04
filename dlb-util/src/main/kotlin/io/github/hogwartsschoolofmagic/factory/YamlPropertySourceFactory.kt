package io.github.hogwartsschoolofmagic.factory

import org.springframework.boot.env.YamlPropertySourceLoader
import org.springframework.core.env.PropertySource
import org.springframework.core.io.support.EncodedResource
import org.springframework.core.io.support.PropertySourceFactory

/**
 * Фабрика для загрузки файлов конфигурации формата yml/yaml.
 */
internal class YamlPropertySourceFactory : PropertySourceFactory {
    override fun createPropertySource(name: String?, resource: EncodedResource): PropertySource<*> =
        YamlPropertySourceLoader().load(name ?: resource.resource.description, resource.resource).first()
}