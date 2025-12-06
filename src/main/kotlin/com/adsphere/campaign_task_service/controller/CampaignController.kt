package com.adsphere.campaign_task_service.controller

import com.adsphere.campaign_task_service.model.Campaign
import com.adsphere.campaign_task_service.service.CampaignService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/campaigns")
class CampaignController(private val campaignService: CampaignService) {

    @PostMapping
    fun createCampaign(@RequestBody request: CreateCampaignRequest): ResponseEntity<Campaign> {
        val campaign = campaignService.createCampaign(
            name = request.name,
            description = request.description,
            budget = request.budget
        )
        return ResponseEntity(campaign, HttpStatus.CREATED)
    }

    @GetMapping("/{id}")
    fun getCampaignById(@PathVariable id: String): ResponseEntity<Campaign> {
        val campaign = campaignService.getCampaignById(id)
        return if (campaign != null) {
            ResponseEntity(campaign, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @GetMapping
    fun getAllCampaigns(): ResponseEntity<List<Campaign>> {
        val campaigns = campaignService.getAllCampaigns()
        return ResponseEntity(campaigns, HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun deleteCampaign(@PathVariable id: String): ResponseEntity<Void> {
        val deleted = campaignService.deleteCampaign(id)
        return if (deleted) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }
}

data class CreateCampaignRequest(
    val name: String,
    val description: String,
    val budget: Double
)
