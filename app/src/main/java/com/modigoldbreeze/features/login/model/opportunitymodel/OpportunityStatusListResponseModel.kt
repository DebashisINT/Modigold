package com.modigoldbreeze.features.login.model.opportunitymodel

import com.modigoldbreeze.app.domain.OpportunityStatusEntity
import com.modigoldbreeze.app.domain.ProductListEntity
import com.modigoldbreeze.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}