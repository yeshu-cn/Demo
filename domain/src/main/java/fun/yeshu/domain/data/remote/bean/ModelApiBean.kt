package `fun`.yeshu.domain.data.remote.bean

/**
 * 解析服务端api返回数据时用到的bean
 */
data class ModelApiBean(
    val time: Long, val value: Int = 0
)