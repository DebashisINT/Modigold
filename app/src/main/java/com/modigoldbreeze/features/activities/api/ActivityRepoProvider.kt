package com.modigoldbreeze.features.activities.api

import com.modigoldbreeze.features.member.api.TeamApi
import com.modigoldbreeze.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}