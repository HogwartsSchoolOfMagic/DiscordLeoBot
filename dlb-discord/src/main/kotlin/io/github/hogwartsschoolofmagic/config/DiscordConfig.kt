package io.github.hogwartsschoolofmagic.config

import dev.kord.core.Kord
import dev.kord.gateway.Intent
import dev.kord.gateway.PrivilegedIntent
import io.github.hogwartsschoolofmagic.command.Command
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.runBlocking
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Основная конфигурация бота в Discord. Здесь происходит:
 * 1. Запуск бота;
 * 2. Создание команд;
 * 3. Подписка на команды;
 * 4. Другие настройки.
 */
@Configuration
class DiscordConfig {
    /**
     * Бин для запуска конфигурации и взаимодействия бота с Discord.
     *
     * @param botCommands команды бота для конфигурации/создания/подписания на события.
     * @return сконфигурированный экземпляр [Kord].
     */
    @Bean
    fun kord(botCommands: List<Command>) =
        runBlocking {
            Kord(System.getenv("BOT_TOKEN")).apply {
                botCommands.asFlow().collect { it.start(this) }

                login {
                    @OptIn(PrivilegedIntent::class)
                    intents += Intent.MessageContent
                }
            }
        }
}