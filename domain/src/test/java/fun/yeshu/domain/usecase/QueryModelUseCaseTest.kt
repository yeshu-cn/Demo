package `fun`.yeshu.domain.usecase

import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.repository.ModelRepository
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import com.google.common.truth.Truth.assertThat

class QueryModelUseCaseTest {
    private lateinit var modelRepository: ModelRepository
    private val localDataSource = ArrayList<Model>()
    private val remoteDataSource = ArrayList<Model>()
    private val deviceDataSource = ArrayList<Model>()


    @Before
    fun setUp() {
        modelRepository = FakeModelRepositoryImpl(localDataSource, remoteDataSource, deviceDataSource)
    }

    @Test
    fun testHasData() = runBlocking {
        localDataSource.add(Model(1, 1))
        val useCase = QueryModelUseCase(modelRepository)
        val data = useCase.execute(1)
        assertThat(data).isNotNull()
    }

    @Test
    fun testNoData() = runBlocking {
        localDataSource.clear()
        val useCase = QueryModelUseCase(modelRepository)
        val data = useCase.execute(1)
        assertThat(data).isNull()
    }
}