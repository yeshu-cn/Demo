package `fun`.yeshu.demo.fake

import `fun`.yeshu.data.remote.WebApi
import `fun`.yeshu.data.remote.bean.ModelApiBean
import kotlinx.coroutines.delay

class FakeWebApiImpl : WebApi {
    private val cache = ArrayList<ModelApiBean>()

    init {
        cache.addAll(MockDataUtils.obtainServerData(20))
    }

    override suspend fun getModelList(startTime: Long, endTime: Long): List<ModelApiBean> {
        // 模拟耗时1秒
        delay(1500)
        return cache.filter {
            it.time in startTime..endTime
        }
    }

    override suspend fun uploadModelList(modelList: List<ModelApiBean>) {
        // 模拟耗时1秒
        cache.addAll(modelList)
    }

    override suspend fun getModel(time: Long): ModelApiBean? {
        // 模拟耗时1秒
        return cache.find {
            it.time == time
        }
    }
}