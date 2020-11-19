package `fun`.yeshu.domain.repository

import `fun`.yeshu.domain.model.Model

interface ModelRepository {
    /**
     * 从设备获取数据
     */
    suspend fun getDataFromDevice(): List<Model>

    /**
     * 从服务端拉数据
     */
    suspend fun getDataFromServer(): List<Model>

    /**
     * 查询特定条件的Model数据
     */
    suspend fun queryDataByTime(time: Long): Model?

    /**
     * 查询特定条件的Model数据列表
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