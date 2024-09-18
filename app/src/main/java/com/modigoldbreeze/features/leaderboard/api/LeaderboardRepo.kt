package com.modigoldbreeze.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.modigoldbreeze.app.FileUtils
import com.modigoldbreeze.app.Pref
import com.modigoldbreeze.base.BaseResponse
import com.modigoldbreeze.features.addshop.model.AddLogReqData
import com.modigoldbreeze.features.addshop.model.AddShopRequestData
import com.modigoldbreeze.features.addshop.model.AddShopResponse
import com.modigoldbreeze.features.addshop.model.LogFileResponse
import com.modigoldbreeze.features.addshop.model.UpdateAddrReq
import com.modigoldbreeze.features.contacts.CallHisDtls
import com.modigoldbreeze.features.contacts.CompanyReqData
import com.modigoldbreeze.features.contacts.ContactMasterRes
import com.modigoldbreeze.features.contacts.SourceMasterRes
import com.modigoldbreeze.features.contacts.StageMasterRes
import com.modigoldbreeze.features.contacts.StatusMasterRes
import com.modigoldbreeze.features.contacts.TypeMasterRes
import com.modigoldbreeze.features.dashboard.presentation.DashboardActivity
import com.modigoldbreeze.features.login.model.WhatsappApiData
import com.modigoldbreeze.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}