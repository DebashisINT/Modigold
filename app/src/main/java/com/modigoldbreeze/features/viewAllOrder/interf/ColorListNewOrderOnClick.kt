package com.modigoldbreeze.features.viewAllOrder.interf

import com.modigoldbreeze.app.domain.NewOrderColorEntity
import com.modigoldbreeze.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}