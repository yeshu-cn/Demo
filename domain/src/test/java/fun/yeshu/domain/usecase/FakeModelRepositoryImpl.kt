package `fun`.yeshu.domain.usecase

import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.repository.ModelRepository

class FakeModelRepositoryImpl(
    private val localDataSource: ArrayList<Model>,
    private val remoteDataSource: ArrayList<Model>,
    private val deviceDataSource: ArrayList<Model>
) : ModelRepository {

    override suspend fun getDataFromDevice(): List<Model> {
        return deviceDataSource
    }

    override suspend fun getDataFromServer(): List<Model> {
        return remoteDataSource
    }

    override suspend fun queryDataByTime(): Model? {
        return if (localDataSource.isEmpty()) {
            null
        } else {
            localDataSource.first()
        }
    }

    override suspend fun queryDataList(): List<Model> {
        return emptyList()
    }

    override suspend fun uploadDataToServer(data: List<Model>): Boolean {
        remoteDataSource.addAll(data)
        return true
    }

    override suspend fun insertDataToLocal(data: List<Model>) {
        localDataSource.addAll(data)
    }
}