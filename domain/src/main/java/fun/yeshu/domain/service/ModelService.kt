package `fun`.yeshu.domain.service

import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.model.ModelStatisticsInfo

/**
 * 描述：Model相关的业务服务
 * 职责：负责处理和持久化无关的业务逻辑，通常是一些业务数据的处理，例如数据统计
 */
interface ModelService {
    /**
     * 统计数据，返回统计结果
     */
    fun statisticsModelData(data : List<Model>) : ModelStatisticsInfo
}