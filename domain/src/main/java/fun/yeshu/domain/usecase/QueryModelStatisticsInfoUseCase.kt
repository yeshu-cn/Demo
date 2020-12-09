package `fun`.yeshu.domain.usecase

import `fun`.yeshu.domain.entity.model.ModelStatisticsInfo
import `fun`.yeshu.domain.entity.repository.ModelRepository
import `fun`.yeshu.domain.entity.service.ModelService

/**
 * 获取业务数据相关的统计结果
 */
class QueryModelStatisticsInfoUseCase(
    private val modelRepository: ModelRepository,
    private val modelService: ModelService
) {
    suspend fun execute(time: Long): ModelStatisticsInfo {
        // 1. repository负责查询需要统计的数据
        // 2. service负责对数据进行统计，返回统计结果
        val data = modelRepository.queryDataList()
        return modelService.statisticsModelData(data)
    }
}