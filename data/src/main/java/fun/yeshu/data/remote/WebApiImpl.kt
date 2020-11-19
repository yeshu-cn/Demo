package `fun`.yeshu.data.remote

import `fun`.yeshu.data.remote.bean.ModelApiBean

class WebApiImpl: WebApi {
    override suspend fun getModelList(startTime: Long, endTime: Long): List<ModelApiBean> {
        TODO("Not yet implemented")
    }

    override suspend fun uploadModelList(modelList: List<ModelApiBean>) {
        TODO("Not yet implemented")
    }

    override suspend fun getModel(time: Long): ModelApiBean? {
        TODO("Not yet implemented")
    }
}