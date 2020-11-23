package `fun`.yeshu.data.local

import `fun`.yeshu.data.local.bean.ModelDaoBean

/**
 * 定义获取本地数据库的增删改查接口，负责获取本地的业务数据
 */
interface ModelDao {
    /**
     * 查询数据
     */
    suspend fun queryModel(time: Long): ModelDaoBean?

    /**
     * 查询数据列表
     */
    suspend fun queryModelList(): List<ModelDaoBean>

    /**
     * 保存数据
     */
    suspend fun insertModel(model : ModelDaoBean)

    /**
     * 保存数据列表
     */
    suspend fun insertModelList(modelList: List<ModelDaoBean>)
}