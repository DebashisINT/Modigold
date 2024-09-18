package com.modigoldbreeze.features.dashboard.presentation.api.dayStartEnd

import com.modigoldbreeze.features.stockCompetetorStock.api.AddCompStockApi
import com.modigoldbreeze.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}