package com.modigoldbreeze.features.viewAllOrder.interf

import com.modigoldbreeze.app.domain.NewOrderGenderEntity
import com.modigoldbreeze.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}