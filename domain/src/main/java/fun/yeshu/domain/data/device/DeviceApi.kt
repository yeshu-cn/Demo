package `fun`.yeshu.domain.data.device

import `fun`.yeshu.domain.data.device.bean.ModelDeviceBean

/**
 * 定义获取设备数据的接口，负责获取设备上的业务数据
 */
interface DeviceApi {
    /**
     * 从设备获取数据
     */
    suspend fun getModelData(time: Long) : List<ModelDeviceBean>
}