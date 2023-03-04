package io.github.hogwartsschoolofmagic.persistence.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

/**
 * Сущность сервера.
 *
 * @param id идентификатор сервера.
 * @param discordId идентификатор сервера (гильдии) в Discord.
 * @param premiumLevel premium уровень.
 * @param isDeleted флаг того, что бот присутствует/не присутствует на сервере.
 */
@Table("bot_servers")
data class ServersEntity(
    @Id val id: Long? = null,
    val discordId: Long,
    val premiumLevel: Long? = 0,
    val isDeleted: Boolean? = false
)