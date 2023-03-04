package io.github.hogwartsschoolofmagic.service

import io.github.hogwartsschoolofmagic.persistence.repo.CommandsRepository
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEmpty
import kotlinx.coroutines.flow.take
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Сервис для работы с сущностью команд.
 */
@Service
class CommandsService {
    @Autowired
    private lateinit var commandsRepo: CommandsRepository

    /**
     * Проверка команды на то, что она является или нет активной.
     *
     * @param commandDiscordId идентификатор команды в Discord.
     * @param serverDiscordId идентификатор сервера в Discord.
     * @return TRUE, если команда не найдена или активна, иначе FALSE.
     */
    fun isActiveCommand(commandDiscordId: Long, serverDiscordId: Long) =
        commandsRepo.findByDiscordIdAndServerDiscordId(commandDiscordId, serverDiscordId)
            .take(1)
            .map { it.isActive == true }
            .onEmpty { emit(true) }
}