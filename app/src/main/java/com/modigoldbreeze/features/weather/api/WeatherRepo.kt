package com.modigoldbreeze.features.weather.api

import com.modigoldbreeze.base.BaseResponse
import com.modigoldbreeze.features.task.api.TaskApi
import com.modigoldbreeze.features.task.model.AddTaskInputModel
import com.modigoldbreeze.features.weather.model.ForeCastAPIResponse
import com.modigoldbreeze.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}