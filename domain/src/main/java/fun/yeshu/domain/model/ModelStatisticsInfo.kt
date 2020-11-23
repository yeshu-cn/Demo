package `fun`.yeshu.domain.model

/**
 * 业务数据统计模型(常见的日，周，月年等数据统计)
 */
data class ModelStatisticsInfo(
    val count: Int,
    val maxValue: Int,
    val minValue: Int
)