package `fun`.yeshu.domain.usecase

import `fun`.yeshu.domain.entity.repository.ModelRepository

/**
 * 同步设备数据
 */
class SyncModelDataFromDeviceUseCase(
    private val modelRepository: ModelRepository
) {
    /**
     * 同步设备数据，成功返回true 和 同步时间
     */
    suspend fun execute(time: Long): Pair<Boolean, Long> {
        // 获取设备数据
        val data = modelRepository.getDataFromDevice(time)
        // 保存数据到本地
        modelRepository.insertDataToLocal(data)
        // 保存数据到云端
        modelRepository.uploadDataToServer(data)
        // 同步成功返回结果
        return Pair(true, System.currentTimeMillis())
    }
}