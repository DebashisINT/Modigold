package com.modigoldbreeze.features.survey.api

import com.modigoldbreeze.features.photoReg.api.GetUserListPhotoRegApi
import com.modigoldbreeze.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}