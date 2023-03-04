package io.github.hogwartsschoolofmagic.command

import dev.kord.core.Kord
import io.github.hogwartsschoolofmagic.service.CommandsService
import org.springframework.beans.factory.annotation.Autowired

/**
 * Шаблон слэш команды.
 */
abstract class Command {
    @Autowired
    protected lateinit var commandsService: CommandsService

    /**
     * Выполнение логики команды.
     *
     * @param kord запущенный бот для дальнейшей конфигурации.
     */
    suspend fun start(kord: Kord) {
        create(kord)
        onEvent(kord)
    }

    /**
     * Имя команды, по которому она будет вызываться.
     */
    abstract fun getName(): String

    /**
     * Описание команды, по которой можно узнать, что она делает.
     */
    abstract fun getDescription(): String

    /**
     * Создание команды на сервере.
     *
     * @param kord запущенный бот для дальнейшей конфигурации.
     */
    abstract suspend fun create(kord: Kord)

    /**
     * Подписка на команду.
     *
     * @param kord запущенный бот для дальнейшей конфигурации.
     */
    abstract fun onEvent(kord: Kord)
}