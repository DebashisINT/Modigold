package com.modigoldbreeze.features.viewAllOrder.interf

import com.modigoldbreeze.app.domain.NewOrderGenderEntity
import com.modigoldbreeze.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}