package `fun`.yeshu.domain.usecase

import `fun`.yeshu.domain.repository.ModelRepository
import kotlin.coroutines.coroutineContext

/**
 * 同步服务端数据
 */
class SyncModelDataFromServerUseCase(
    private val modelRepository: ModelRepository
) {
    suspend fun execute() {
        // 从服务端获取数据
        val data = modelRepository.getDataFromServer()
        // 处理数据，并保存在本地
        modelRepository.insertDataToLocal(data);
    }
}