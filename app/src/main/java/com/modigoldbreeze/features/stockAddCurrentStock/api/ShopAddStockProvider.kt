package com.modigoldbreeze.features.stockAddCurrentStock.api

import com.modigoldbreeze.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.modigoldbreeze.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}