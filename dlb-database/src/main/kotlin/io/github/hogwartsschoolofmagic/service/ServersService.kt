package io.github.hogwartsschoolofmagic.service

import io.github.hogwartsschoolofmagic.persistence.repo.ServersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Сервис для работы с сущностью серверов.
 */
@Service
class ServersService {
    @Autowired
    private lateinit var serversRepo: ServersRepository
}