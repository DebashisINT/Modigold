package com.modigoldbreeze.features.document.api

import com.modigoldbreeze.features.dymanicSection.api.DynamicApi
import com.modigoldbreeze.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}