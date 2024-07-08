package com.modigoldbreeze.features.viewAllOrder.interf

import com.modigoldbreeze.app.domain.NewOrderGenderEntity
import com.modigoldbreeze.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}