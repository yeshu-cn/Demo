package `fun`.yeshu.demo.fake

import `fun`.yeshu.data.remote.WebApi
import `fun`.yeshu.data.remote.bean.ModelApiBean

class FakeWebApiImpl : WebApi {
    private val cache = ArrayList<ModelApiBean>()

    override suspend fun getModelList(startTime: Long, endTime: Long): List<ModelApiBean> {
        return cache.filter {
            it.time in startTime..endTime
        }
    }

    override suspend fun uploadModelList(modelList: List<ModelApiBean>) {
        cache.addAll(modelList)
    }

    override suspend fun getModel(time: Long): ModelApiBean? {
        return cache.find {
            it.time == time
        }
    }
}