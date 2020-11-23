package `fun`.yeshu.data

import `fun`.yeshu.domain.data.converter.toModel
import `fun`.yeshu.domain.data.converter.toModelApiBean
import `fun`.yeshu.domain.data.converter.toModelDaoBean
import `fun`.yeshu.domain.data.device.DeviceApi
import `fun`.yeshu.domain.data.local.ModelDao
import `fun`.yeshu.domain.data.remote.WebApi
import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.repository.ModelRepository

/**
 * 业务数据资源库的实现类
 */
class ModelRepositoryImpl(
    private val deviceApi: DeviceApi, private val webApi: WebApi, private val modelDao: ModelDao
) : ModelRepository {
    override suspend fun getDataFromDevice(time: Long): List<Model> {
        val deviceData = deviceApi.getModelData(time)
        return deviceData.map {
            it.toModel()
        }
    }

    override suspend fun getDataFromServer(): List<Model> {
        val remoteData = webApi.getModelList(0, System.currentTimeMillis())
        return remoteData.map {
            it.toModel()
        }
    }

    override suspend fun queryDataByTime(time: Long): Model? {
        return modelDao.queryModel(time)?.toModel()
    }

    override suspend fun queryDataList(): List<Model> {
        return modelDao.queryModelList().map { it.toModel() }
    }

    override suspend fun uploadDataToServer(data: List<Model>): Boolean {
        webApi.uploadModelList(data.map { it.toModelApiBean() })
        return true
    }

    override suspend fun insertDataToLocal(data: List<Model>) {
        modelDao.insertModelList(data.map { it.toModelDaoBean() })
    }


}