package com.adsphere.campaign_task_service.service

import com.adsphere.campaign_task_service.model.Campaign
import com.adsphere.campaign_task_service.repository.CampaignRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class CampaignService(private val campaignRepository: CampaignRepository) {

    fun createCampaign(name: String, description: String, budget: Double): Campaign {
        val campaign = Campaign(
            id = UUID.randomUUID().toString(),
            name = name,
            description = description,
            budget = budget
        )
        return campaignRepository.save(campaign)
    }

    fun getCampaignById(id: String): Campaign? {
        return campaignRepository.findById(id)
    }

    fun getAllCampaigns(): List<Campaign> {
        return campaignRepository.findAll()
    }

    fun deleteCampaign(id: String): Boolean {
        return campaignRepository.delete(id)
    }
}
