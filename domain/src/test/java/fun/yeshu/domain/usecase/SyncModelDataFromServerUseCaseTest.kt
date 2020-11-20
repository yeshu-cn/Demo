package `fun`.yeshu.domain.usecase

import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.repository.ModelRepository
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import com.google.common.truth.Truth.assertThat

class SyncModelDataFromServerUseCaseTest {
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
    fun execute_NoData() = runBlocking {
        localDataSource.clear()
        remoteDataSource.clear()
        deviceDataSource.clear()

        val useCase = SyncModelDataFromDeviceUseCase(modelRepository)
        val result = useCase.execute(System.currentTimeMillis())
        assertThat(result.first).isTrue()

        assertThat(localDataSource).isEmpty()
        assertThat(remoteDataSource).isEmpty()
    }

    @Test
    fun execute() = runBlocking {
        // 初始化数据
        localDataSource.clear()
        remoteDataSource.clear()
        deviceDataSource.clear()

        // 模拟设备上存在4个数据
        deviceDataSource.add(Model(1))
        deviceDataSource.add(Model(2))
        deviceDataSource.add(Model(3))
        deviceDataSource.add(Model(4))

        // 同步数据
        val useCase = SyncModelDataFromDeviceUseCase(modelRepository)
        val result = useCase.execute(System.currentTimeMillis())

        // 验证结果
        assertThat(result.first).isTrue()
        assertThat(localDataSource.size).isEqualTo(4)
        assertThat(remoteDataSource.size).isEqualTo(4)
    }
}