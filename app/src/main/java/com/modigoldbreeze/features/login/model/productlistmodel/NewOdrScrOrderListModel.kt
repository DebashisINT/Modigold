package com.modigoldbreeze.features.login.model.productlistmodel

import com.modigoldbreeze.app.domain.NewOrderScrOrderEntity
import com.modigoldbreeze.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}