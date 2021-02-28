package org.selffish.adapters.web

import org.selffish.domain.entities.Notification
import org.springframework.stereotype.Service

@Service
class NotificationWebModelMapper {

    fun createNotification(notificationText: String) =
        Notification(null, System.currentTimeMillis(), notificationText)

}