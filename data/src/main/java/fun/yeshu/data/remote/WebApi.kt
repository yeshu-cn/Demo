package `fun`.yeshu.data.remote

import `fun`.yeshu.data.remote.bean.ModelApiBean

interface WebApi {
    suspend fun getModelList(startTime: Long, endTime: Long): List<ModelApiBean>

    suspend fun uploadModelList(modelList: List<ModelApiBean>)

    suspend fun getModel(time: Long): ModelApiBean
}