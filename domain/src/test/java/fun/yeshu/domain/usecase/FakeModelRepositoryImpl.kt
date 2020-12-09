package `fun`.yeshu.domain.usecase

import `fun`.yeshu.domain.entity.model.Model
import `fun`.yeshu.domain.entity.repository.ModelRepository

class FakeModelRepositoryImpl(
    private val localDataSource: ArrayList<Model>,
    private val remoteDataSource: ArrayList<Model>,
    private val deviceDataSource: ArrayList<Model>
) : ModelRepository {

    override suspend fun getDataFromDevice(time: Long): List<Model> {
        return mutableListOf<Model>().apply { addAll(deviceDataSource) }
    }

    override suspend fun getDataFromServer(): List<Model> {
        return mutableListOf<Model>().apply { addAll(remoteDataSource) }
    }

    override suspend fun queryDataByTime(time: Long): Model? {
        return if (localDataSource.isEmpty()) {
            null
        } else {
            localDataSource.first()
        }
    }

    override suspend fun queryDataList(): List<Model> {
        return mutableListOf<Model>().apply { addAll(localDataSource) }
    }

    override suspend fun uploadDataToServer(data: List<Model>): Boolean {
        remoteDataSource.addAll(data)
        return true
    }

    override suspend fun insertDataToLocal(data: List<Model>) {
        localDataSource.addAll(data)
    }
}