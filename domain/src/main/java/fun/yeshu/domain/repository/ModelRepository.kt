package `fun`.yeshu.domain.repository

import `fun`.yeshu.domain.model.Model

/**
 * 业务Model的资源库，作为数据源，定义Model的增删改查接口
 */
interface ModelRepository {
    /**
     * 从设备获取数据
     */
    suspend fun getDataFromDevice(time: Long): List<Model>

    /**
     * 从服务端拉数据
     */
    suspend fun getDataFromServer(): List<Model>

    /**
     * 查询特定条件的Model数据(可能是本地，也可能直接从服务端查询)
     */
    suspend fun queryDataByTime(time: Long): Model?

    /**
     * 查询特定条件的Model数据列表(可能是本地，也可能直接从服务端查询)
     */
    suspend fun queryDataList(): List<Model>

    /**
     * 上传数据到服务器
     */
    suspend fun uploadDataToServer(data: List<Model>): Boolean

    /**
     * 保存数据到本地
     */
    suspend fun insertDataToLocal(data: List<Model>)
}