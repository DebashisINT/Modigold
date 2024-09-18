package com.modigoldbreeze.features.lead.api

import com.modigoldbreeze.features.NewQuotation.api.GetQuotListRegRepository
import com.modigoldbreeze.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}