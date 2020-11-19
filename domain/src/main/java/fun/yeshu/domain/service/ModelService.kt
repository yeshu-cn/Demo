package `fun`.yeshu.domain.service

import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.model.ModelStatisticsInfo

/**
 * 和存储无关的业务逻辑和业务数据处理逻辑
 */
interface ModelService {
    fun statisticsModelData(data : List<Model>) : ModelStatisticsInfo
}