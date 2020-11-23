package `fun`.yeshu.domain.usecase

import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.repository.ModelRepository


/**
 * 获取业务数据列表
 */
class QueryModelListUseCase(
    private val modelRepository: ModelRepository
) {
    suspend fun execute(): List<Model> {
        // 1。 初始化查询条件
        // 2。 根据查询条件调用modelRepository中的方法获取结果并返回
        return modelRepository.queryDataList()
    }
}