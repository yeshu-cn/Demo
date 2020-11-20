package `fun`.yeshu.demo.fake

import `fun`.yeshu.data.device.DeviceApi
import `fun`.yeshu.data.device.bean.ModelDeviceBean

class FakeDeviceApiImpl : DeviceApi {
    private val cache = ArrayList<ModelDeviceBean>()


    init {
        cache.addAll(MockDataUtils.obtainDeviceData(20))
    }

    override suspend fun getModelData(time: Long): List<ModelDeviceBean> {
        // 模拟耗时1秒
        return mutableListOf<ModelDeviceBean>().apply { addAll(cache) }
    }
}