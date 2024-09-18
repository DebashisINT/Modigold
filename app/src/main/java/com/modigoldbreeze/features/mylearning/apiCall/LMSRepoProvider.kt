package com.modigoldbreeze.features.mylearning.apiCall

import com.modigoldbreeze.features.login.api.opportunity.OpportunityListApi
import com.modigoldbreeze.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}