package `fun`.yeshu.domain.usecase

import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.repository.ModelRepository


/**
 * 获取业务数据
 */
class QueryModelUseCase(
    private val modelRepository: ModelRepository
) {
    suspend fun execute(time: Long): Model? {
        // 初始化查询条件
        // 根据条件进行查询
        return modelRepository.queryDataByTime(time)
    }
}