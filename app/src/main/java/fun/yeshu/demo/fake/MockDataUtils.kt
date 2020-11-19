package `fun`.yeshu.demo.fake

import `fun`.yeshu.data.converter.toModelApiBean
import `fun`.yeshu.data.device.bean.ModelDeviceBean
import `fun`.yeshu.data.remote.bean.ModelApiBean
import `fun`.yeshu.domain.model.Model
import java.util.*
import kotlin.collections.ArrayList

object MockDataUtils {
    fun obtainModel(count: Int): List<Model> {
        val data = ArrayList<Model>()
        val time = System.currentTimeMillis()
        val oneDayMills = 24 * 60 * 60 * 1000
        for (i in 0 until  count) {
            data.add(Model(time - i * oneDayMills , Random().nextInt(100)))
        }
        return data;
    }

    fun obtainDeviceData(count: Int): List<ModelDeviceBean> {
        val data = obtainModel(count)
        return data.map { ModelDeviceBean(it.time, it.value) }
    }

    fun obtainServerData(count: Int): List<ModelApiBean> {
        val data = obtainModel(count)
        return data.map { it.toModelApiBean() }
    }
}