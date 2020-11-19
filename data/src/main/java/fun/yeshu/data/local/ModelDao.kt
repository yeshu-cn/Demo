package `fun`.yeshu.data.local

import `fun`.yeshu.data.local.bean.ModelDaoBean

interface ModelDao {
    suspend fun queryModel(time: Long): ModelDaoBean?

    suspend fun queryModelList(): List<ModelDaoBean>

    suspend fun insertModel(model : ModelDaoBean)

    suspend fun insertModelList(modelList: List<ModelDaoBean>)
}