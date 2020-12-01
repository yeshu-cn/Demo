package `fun`.yeshu.demo.fake

import `fun`.yeshu.domain.data.local.ModelDao
import `fun`.yeshu.domain.data.local.bean.ModelDaoBean

class FakeModelDaoImpl : ModelDao {
    private val cache = ArrayList<ModelDaoBean>()

    override suspend fun queryModel(time: Long): ModelDaoBean? {
        return cache.find {
            it.time == time
        }
    }

    override suspend fun queryModelList(): List<ModelDaoBean> {
        return mutableListOf<ModelDaoBean>().apply { addAll(cache) }
    }

    override suspend fun insertModel(model: ModelDaoBean) {
        cache.add(model)
    }

    override suspend fun insertModelList(modelList: List<ModelDaoBean>) {
        cache.addAll(modelList)
    }

}