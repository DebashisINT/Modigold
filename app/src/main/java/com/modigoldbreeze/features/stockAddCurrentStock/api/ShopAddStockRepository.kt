package com.modigoldbreeze.features.stockAddCurrentStock.api

import com.modigoldbreeze.base.BaseResponse
import com.modigoldbreeze.features.location.model.ShopRevisitStatusRequest
import com.modigoldbreeze.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.modigoldbreeze.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.modigoldbreeze.features.stockAddCurrentStock.model.CurrentStockGetData
import com.modigoldbreeze.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}