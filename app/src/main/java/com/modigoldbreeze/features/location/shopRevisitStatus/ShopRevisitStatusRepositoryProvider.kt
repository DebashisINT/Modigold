package com.modigoldbreeze.features.location.shopRevisitStatus

import com.modigoldbreeze.features.location.shopdurationapi.ShopDurationApi
import com.modigoldbreeze.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}