package `fun`.yeshu.data

import `fun`.yeshu.data.device.DeviceApi
import `fun`.yeshu.data.local.ModelDao
import `fun`.yeshu.data.remote.WebApi
import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.repository.ModelRepository

class ModelRepositoryImpl(
    private val deviceApi: DeviceApi, private val webApi: WebApi, private val modelDao: ModelDao
) : ModelRepository {
    override suspend fun getDataFromDevice(): List<Model> {
        TODO("Not yet implemented")
    }

    override suspend fun getDataFromServer(): List<Model> {
        TODO("Not yet implemented")
    }

    override suspend fun queryDataByXX(): Model? {
        TODO("Not yet implemented")
    }

    override suspend fun queryDataListByXX(): List<Model> {
        TODO("Not yet implemented")
    }

    override suspend fun uploadDataToServer(data: List<Model>): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun insertDataToLocal(data: List<Model>) {
        TODO("Not yet implemented")
    }

}