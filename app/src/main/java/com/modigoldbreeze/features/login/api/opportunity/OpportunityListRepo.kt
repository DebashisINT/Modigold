package com.modigoldbreeze.features.login.api.opportunity

import com.modigoldbreeze.app.Pref
import com.modigoldbreeze.app.utils.AppUtils
import com.modigoldbreeze.base.BaseResponse
import com.modigoldbreeze.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.modigoldbreeze.features.login.model.productlistmodel.ProductListResponseModel
import com.modigoldbreeze.features.orderITC.SyncDeleteOppt
import com.modigoldbreeze.features.orderITC.SyncEditOppt
import com.modigoldbreeze.features.orderITC.SyncOppt
import com.modigoldbreeze.features.orderList.model.OpportunityListResponseModel
import io.reactivex.Observable
import timber.log.Timber

/**
 * Created by Saikat on 20-11-2018.
 */
class OpportunityListRepo(val apiService: OpportunityListApi) {
    fun getOpportunityStatus(session_token: String): Observable<OpportunityStatusListResponseModel> {
        return apiService.getOpportunityStatusList(session_token)
    }

    fun saveOpportunity(syncOppt: SyncOppt): Observable<BaseResponse> {
        return apiService.saveOpportunity(syncOppt)
    }

    fun editOpportunity(syncEditOppt: SyncEditOppt): Observable<BaseResponse> {
        return apiService.editOpportunity(syncEditOppt)
    }
    fun deleteOpportunity(syncDeleteOppt: SyncDeleteOppt): Observable<BaseResponse> {
        return apiService.deleteOpportunity(syncDeleteOppt)
    }
    fun getOpportunityL(user_id: String): Observable<OpportunityListResponseModel> {
        return apiService.getOpportunityL(user_id)
    }
}