package org.selffish.domain.usecases

import org.selffish.domain.entities.Notification
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class CreateNotificationUseCase {

    private val logger: Logger = LoggerFactory.getLogger(CreateNotificationUseCase::class.java)

    fun create(notification: Notification): Notification {
        logger.info(notification.notificationText)
        return notification
    }

}