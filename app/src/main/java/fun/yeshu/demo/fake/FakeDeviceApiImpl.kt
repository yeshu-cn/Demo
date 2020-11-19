package `fun`.yeshu.demo.fake

import `fun`.yeshu.data.device.DeviceApi
import `fun`.yeshu.data.device.bean.ModelDeviceBean

class FakeDeviceApiImpl : DeviceApi {
    private val cache = ArrayList<ModelDeviceBean>()


    init {

    }

    override suspend fun getModelData(time: Long): List<ModelDeviceBean> {
        return mutableListOf<ModelDeviceBean>().apply { addAll(cache) }
    }
}