package com.modigoldbreeze.features.login.model.productlistmodel

import com.modigoldbreeze.app.domain.ModelEntity
import com.modigoldbreeze.app.domain.ProductListEntity
import com.modigoldbreeze.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}