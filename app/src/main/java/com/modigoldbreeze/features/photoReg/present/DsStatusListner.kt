package com.modigoldbreeze.features.photoReg.present

import com.modigoldbreeze.app.domain.ProspectEntity
import com.modigoldbreeze.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}