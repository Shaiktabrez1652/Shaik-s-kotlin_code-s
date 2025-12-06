package com.adsphere.campaign_task_service.repository

import com.adsphere.campaign_task_service.model.Campaign
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class CampaignRepository {
    private val campaigns = mutableMapOf<String, Campaign>()

    fun save(campaign: Campaign): Campaign {
        campaigns[campaign.id] = campaign
        return campaign
    }

    fun findById(id: String): Campaign? {
        return campaigns[id]
    }

    fun findAll(): List<Campaign> {
        return campaigns.values.toList()
    }

    fun delete(id: String): Boolean {
        return campaigns.remove(id) != null
    }
}
