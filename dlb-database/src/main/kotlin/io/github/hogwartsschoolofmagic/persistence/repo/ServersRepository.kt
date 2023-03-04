package io.github.hogwartsschoolofmagic.persistence.repo

import io.github.hogwartsschoolofmagic.persistence.model.ServersEntity
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

/**
 * Репозиторий для работы с сущностями серверов.
 */
@Repository
internal interface ServersRepository : CoroutineCrudRepository<ServersEntity, Long>