package org.selffish.domain.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Notification(@Id val id: String?, val creationDate: Long, val notificationText: String)