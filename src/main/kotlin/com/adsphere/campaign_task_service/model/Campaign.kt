package com.adsphere.campaign_task_service.model

data class Campaign(
    val id: String,
    val name: String,
    val description: String,
    val budget: Double,
    val status: String = "ACTIVE"
)
