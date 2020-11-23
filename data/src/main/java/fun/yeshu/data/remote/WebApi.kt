package `fun`.yeshu.data.remote

import `fun`.yeshu.data.remote.bean.ModelApiBean

/**
 * 定义获取服务端数据的接口，负责获取服务器上的业务数据
 */
interface WebApi {
    /**
     * 获取服务端的数据列表
     */
    suspend fun getModelList(startTime: Long, endTime: Long): List<ModelApiBean>

    /**
     * 上传数据列表到服务端
     */
    suspend fun uploadModelList(modelList: List<ModelApiBean>)

    /**
     * 查询特定的业务数据
     */
    suspend fun getModel(time: Long): ModelApiBean?
}