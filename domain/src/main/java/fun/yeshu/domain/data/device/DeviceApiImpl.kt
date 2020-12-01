package `fun`.yeshu.domain.data.device

import `fun`.yeshu.domain.data.device.bean.ModelDeviceBean

/**
 * 调用蓝牙接口，获取并解析数据。一般放在宿主app实现
 */
class DeviceApiImpl : DeviceApi {
    override suspend fun getModelData(time: Long): List<ModelDeviceBean> {
        TODO("Not yet implemented")
    }
}