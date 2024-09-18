package com.modigoldbreeze.features.viewAllOrder.orderOptimized

import com.modigoldbreeze.app.domain.ProductOnlineRateTempEntity
import com.modigoldbreeze.base.BaseResponse
import com.modigoldbreeze.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}