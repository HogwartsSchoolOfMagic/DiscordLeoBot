package io.github.hogwartsschoolofmagic.persistence.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

/**
 * Сущность команды.
 *
 * @param id идентификатор команды.
 * @param discordId идентификатор команды в Discord.
 * @param serverDiscordId идентификатор сервера [ServersEntity.id].
 * @param name название команды.
 * @param description описание команды.
 * @param isActive флаг того, что команда активна или нет для сервера.
 */
@Table("bot_commands")
data class CommandsEntity(
    @Id val id: Long? = null,
    val discordId: Long,
    val serverDiscordId: Long,
    val name: String,
    val description: String?,
    val isActive: Boolean? = true
)