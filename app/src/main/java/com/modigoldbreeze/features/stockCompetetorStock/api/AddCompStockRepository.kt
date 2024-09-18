package com.modigoldbreeze.features.stockCompetetorStock.api

import com.modigoldbreeze.base.BaseResponse
import com.modigoldbreeze.features.orderList.model.NewOrderListResponseModel
import com.modigoldbreeze.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.modigoldbreeze.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}