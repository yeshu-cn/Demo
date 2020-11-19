package `fun`.yeshu.data.converter

import `fun`.yeshu.data.device.bean.ModelDeviceBean
import `fun`.yeshu.domain.model.Model

fun ModelDeviceBean.toModel(): Model {
    return Model(time, value)
}