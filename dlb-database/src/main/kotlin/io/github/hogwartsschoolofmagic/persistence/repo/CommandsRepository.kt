package io.github.hogwartsschoolofmagic.persistence.repo

import io.github.hogwartsschoolofmagic.persistence.model.CommandsEntity
import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

/**
 * Репозиторий для работы с сущностями команд.
 */
@Repository
internal interface CommandsRepository : CoroutineCrudRepository<CommandsEntity, Long> {
    /**
     * Поиск команды сервера.
     *
     * @param commandDiscordId идентификатор команды в Discord.
     * @param serverDiscordId идентификатор сервера в Discord.
     * @return информация о найденной команде сервера.
     */
    fun findByDiscordIdAndServerDiscordId(commandDiscordId: Long, serverDiscordId: Long): Flow<CommandsEntity>
}