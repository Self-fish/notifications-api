package org.selffish.framework

import org.selffish.adapters.web.NotificationWebModelMapper
import org.selffish.domain.entities.Notification
import org.selffish.domain.usecases.CreateNotificationUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("notifications")
class NotificationsController(private val notificationWebModelMapper: NotificationWebModelMapper,
                              private val createNotificationUseCase: CreateNotificationUseCase) {

    @RequestMapping(method = [RequestMethod.POST], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun create(@RequestBody notificationWebModel: String): Notification {
        return createNotificationUseCase.create(notificationWebModelMapper.createNotification(notificationWebModel))
    }

}