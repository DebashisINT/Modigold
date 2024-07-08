package com.modigoldbreeze.features.viewAllOrder.interf

import com.modigoldbreeze.app.domain.NewOrderProductEntity
import com.modigoldbreeze.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}