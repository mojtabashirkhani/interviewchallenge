package com.example.interviewchallenge.data

import com.example.interviewchallenge.data.remote.model.directionModel.DirectionModel
import com.example.interviewchallenge.data.remote.model.matrixModel.MatrixModel
import org.neshan.servicessdk.direction.model.NeshanDirectionResult
import org.neshan.servicessdk.distancematrix.model.NeshanDistanceMatrixResult
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface MapApi {

    @GET("/v2/direction")
    suspend fun getNeshanDirection(
        @Header("Api-Key") mapApiKey: String?,
        @Query("origin") origin: String?,
        @Query("destination") destination: String?,
        @Query("waypoints") waypoints: String?,
        @Query("avoidTrafficZone") avoidTerrificZone: Boolean,
        @Query("avoidOddEvenZone") avoidOddEvenZone: Boolean,
        @Query("alternative") alternative: Boolean
    ): DirectionModel

    @GET("/v2/direction")
    suspend fun getNeshanDirection(
        @Header("Api-Key") mapApiKey: String?,
        @Query("origin") origin: String?,
        @Query("destination") destination: String?,
        @Query("avoidTrafficZone") avoidTerrificZone: Boolean,
        @Query("avoidOddEvenZone") avoidOddEvenZone: Boolean,
        @Query("alternative") alternative: Boolean
    ): DirectionModel


    @GET("/v1/distance-matrix")
    suspend fun getNeshanDistanceMatrix(
        @Header("Api-Key") mapApiKey: String?,
        @Query("origins") origin: String?,
        @Query("destinations") destination: String?
    ): MatrixModel


}