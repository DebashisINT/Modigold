package com.modigoldbreeze.features.nearbyuserlist.api

import com.modigoldbreeze.app.Pref
import com.modigoldbreeze.features.nearbyuserlist.model.NearbyUserResponseModel
import com.modigoldbreeze.features.newcollection.model.NewCollectionListResponseModel
import com.modigoldbreeze.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}