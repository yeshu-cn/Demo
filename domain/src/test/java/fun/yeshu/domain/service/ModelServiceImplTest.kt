package `fun`.yeshu.domain.service

import `fun`.yeshu.domain.model.Model
import org.junit.Test
import com.google.common.truth.Truth.assertThat

class ModelServiceImplTest {

    @Test
    fun statisticsModelData() {
        // 伪造数据源
        val data = ArrayList<Model>()
        data.add(Model(System.currentTimeMillis(), 1))
        data.add(Model(System.currentTimeMillis(), 2))
        data.add(Model(System.currentTimeMillis(), 3))
        data.add(Model(System.currentTimeMillis(), 4))
        data.add(Model(System.currentTimeMillis(), 10))

        // 执行测试代码
        val result = ModelServiceImpl().statisticsModelData(data)

        // 验证结果
        assertThat(result.count).isEqualTo(5)
        assertThat(result.minValue).isEqualTo(1)
        assertThat(result.maxValue).isEqualTo(10)
    }
}