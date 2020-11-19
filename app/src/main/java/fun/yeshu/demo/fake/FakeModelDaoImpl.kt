package `fun`.yeshu.demo.fake

import `fun`.yeshu.data.local.ModelDao
import `fun`.yeshu.data.local.bean.ModelDaoBean

class FakeModelDaoImpl : ModelDao {
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

    override suspend fun updateModel(model: ModelDaoBean) {
        TODO("Not yet implemented")
    }

}