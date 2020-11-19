package `fun`.yeshu.demo.fake

import `fun`.yeshu.data.device.DeviceApi
import `fun`.yeshu.data.device.bean.ModelDeviceBean

class FakeDeviceApiImpl : DeviceApi {
    override suspend fun getModelData(time: Long): List<ModelDeviceBean> {
        TODO("Not yet implemented")
    }
}