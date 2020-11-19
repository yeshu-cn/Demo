package `fun`.yeshu.data.device

import `fun`.yeshu.data.device.bean.ModelDeviceBean

interface DeviceApi {
    suspend fun getModelData(time: Long) : List<ModelDeviceBean>
}