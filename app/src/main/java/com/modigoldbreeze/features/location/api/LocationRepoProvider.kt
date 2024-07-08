package com.modigoldbreeze.features.location.api

import com.modigoldbreeze.features.location.shopdurationapi.ShopDurationApi
import com.modigoldbreeze.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}