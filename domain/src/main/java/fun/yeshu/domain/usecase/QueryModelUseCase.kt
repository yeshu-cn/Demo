package `fun`.yeshu.domain.usecase

import `fun`.yeshu.domain.entity.model.Model
import `fun`.yeshu.domain.entity.repository.ModelRepository


/**
 * 获取业务数据
 */
class QueryModelUseCase(
    private val modelRepository: ModelRepository
) {
    suspend fun execute(time: Long): Model? {
        // 1。 初始化查询条件
        // 2。 根据查询条件调用modelRepository中的方法获取结果并返回
        return modelRepository.queryDataByTime(time)
    }
}