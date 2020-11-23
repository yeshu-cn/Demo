package `fun`.yeshu.domain.data.local

import `fun`.yeshu.data.local.bean.ModelDaoBean

class ModelDaoImpl: ModelDao {
    override suspend fun queryModel(time: Long): ModelDaoBean? {
        TODO("Not yet implemented")
    }

    override suspend fun queryModelList(): List<ModelDaoBean> {
        TODO("Not yet implemented")
    }

    override suspend fun insertModel(model: ModelDaoBean) {
        TODO("Not yet implemented")
    }

    override suspend fun insertModelList(modelList: List<ModelDaoBean>) {
        TODO("Not yet implemented")
    }
}