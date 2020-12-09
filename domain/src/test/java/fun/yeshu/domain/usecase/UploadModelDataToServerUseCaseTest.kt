package `fun`.yeshu.domain.usecase

import `fun`.yeshu.domain.entity.model.Model
import `fun`.yeshu.domain.entity.repository.ModelRepository
import com.google.common.truth.Truth
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Before

class UploadModelDataToServerUseCaseTest {
    private lateinit var modelRepository: ModelRepository
    private val localDataSource = ArrayList<Model>()
    private val remoteDataSource = ArrayList<Model>()
    private val deviceDataSource = ArrayList<Model>()

    @Before
    fun setUp() {
        modelRepository =
            FakeModelRepositoryImpl(localDataSource, remoteDataSource, deviceDataSource)
    }

    @Test
    fun execute() = runBlocking {
        // 初始化数据
        localDataSource.clear()
        remoteDataSource.clear()
        deviceDataSource.clear()

        // 模拟本地有数据，需要上传到云端
        localDataSource.add(Model(1))
        localDataSource.add(Model(2))
        localDataSource.add(Model(3))
        localDataSource.add(Model(4))

        // 同步数据
        val useCase = UploadModelDataToServerUseCase(modelRepository)
        useCase.execute()

        // 验证云端数据结果
        Truth.assertThat(remoteDataSource.size).isEqualTo(4)
    }
}