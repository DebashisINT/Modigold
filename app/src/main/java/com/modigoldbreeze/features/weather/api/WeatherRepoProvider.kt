package com.modigoldbreeze.features.weather.api

import com.modigoldbreeze.features.task.api.TaskApi
import com.modigoldbreeze.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}