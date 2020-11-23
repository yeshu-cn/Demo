package `fun`.yeshu.domain.service

import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.model.ModelStatisticsInfo

class ModelServiceImpl : ModelService {

    override fun statisticsModelData(data: List<Model>): ModelStatisticsInfo {
        // 此处仅仅模拟数据统计结果
        val count = data.size
        val max = data.maxBy {
            it.value
        }?.value ?: 0
        val min = data.minBy {
            it.value
        }?.value ?: 0
        return ModelStatisticsInfo(count, max, min)
    }
}