package com.modigoldbreeze.features.newcollectionreport

import com.modigoldbreeze.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}