package com.modigoldbreeze.features.myjobs.api

import android.content.Context
import android.net.Uri
import android.util.Log
import com.modigoldbreeze.app.FileUtils
import com.modigoldbreeze.base.BaseResponse
import com.modigoldbreeze.features.activities.model.ActivityImage
import com.modigoldbreeze.features.activities.model.AddActivityInputModel
import com.modigoldbreeze.features.myjobs.model.WIPSubmit
import com.fasterxml.jackson.databind.ObjectMapper
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

object MyJobRepoProvider {
    fun jobRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.create())
    }

    fun jobMultipartRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.createMultiPart())
    }

}