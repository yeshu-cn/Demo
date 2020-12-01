package `fun`.yeshu.domain.data.remote

import `fun`.yeshu.domain.data.remote.bean.ModelApiBean

/**
 * 网络请求实现类
 */
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