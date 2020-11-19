package `fun`.yeshu.domain.usecase

import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.repository.ModelRepository


/**
 * 获取保存在本地的业务数据
 */
class QueryModelUseCase(
    private val modelRepository: ModelRepository
) {
    suspend fun execute(time: Long): Model? {
        return modelRepository.queryDataByTime(time)
    }
}