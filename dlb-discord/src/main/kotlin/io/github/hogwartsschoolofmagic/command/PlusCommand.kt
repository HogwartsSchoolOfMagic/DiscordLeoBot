package io.github.hogwartsschoolofmagic.command

import dev.kord.core.Kord
import dev.kord.core.behavior.interaction.response.respond
import dev.kord.core.event.interaction.GuildChatInputCommandInteractionCreateEvent
import dev.kord.core.on
import dev.kord.rest.builder.interaction.int
import org.springframework.stereotype.Component

/**
 * Команда для сложения двух чисел.
 */
@Component
class PlusCommand : Command() {
    override fun getName() = "plus"

    override fun getDescription() = "Слэш команда для получения суммы двух чисел"

    override suspend fun create(kord: Kord) {
        kord.createGlobalChatInputCommand(getName(), getDescription()) {
            int(ARG1_NAME, ARG1_DESC) {
                required = true
            }
            int(ARG2_NAME, ARG2_DESC) {
                required = true
            }
        }
    }

    override fun onEvent(kord: Kord) {
        kord.on<GuildChatInputCommandInteractionCreateEvent> {
            val command = interaction.command
            val commandDiscordId = command.data.id.value!!.value.toLong()
            val serverDiscordId = interaction.guildId.value.toLong()
            val response = interaction.deferPublicResponse()
            commandsService.isActiveCommand(commandDiscordId, serverDiscordId)
                .collect {
                    if (it) {
                        val first = command.integers[ARG1_NAME]!!
                        val second = command.integers[ARG2_NAME]!!
                        response.respond { content = "$first + $second = ${first + second}" }
                    } else {
                        response.respond { content = "Команда: ${command.data.name} выключена для этого сервера!" }
                    }
                }
        }
    }

    private companion object {
        private const val ARG1_NAME = "first_number"
        private const val ARG1_DESC = "Первый операнд"

        private const val ARG2_NAME = "second_number"
        private const val ARG2_DESC = "Второй операнд"
    }
}