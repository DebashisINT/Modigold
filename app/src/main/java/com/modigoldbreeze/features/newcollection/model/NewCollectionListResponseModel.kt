package com.modigoldbreeze.features.newcollection.model

import com.modigoldbreeze.app.domain.CollectionDetailsEntity
import com.modigoldbreeze.base.BaseResponse
import com.modigoldbreeze.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}