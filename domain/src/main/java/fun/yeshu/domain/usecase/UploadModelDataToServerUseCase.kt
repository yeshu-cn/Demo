package `fun`.yeshu.domain.usecase

import `fun`.yeshu.domain.repository.ModelRepository

/**
 * 上传数据到服务器
 */
class UploadModelDataToServerUseCase(
    private val modelRepository: ModelRepository
) {
    suspend fun execute() {
        // 获取需要上传的数据
        val data = modelRepository.queryDataList()
        // 上传数据到服务器
        modelRepository.uploadDataToServer(data)
    }
}