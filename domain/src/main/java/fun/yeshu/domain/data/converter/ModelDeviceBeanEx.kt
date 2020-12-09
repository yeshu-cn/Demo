package `fun`.yeshu.domain.data.converter

import `fun`.yeshu.domain.data.device.bean.ModelDeviceBean
import `fun`.yeshu.domain.entity.model.Model

fun ModelDeviceBean.toModel(): Model {
    return Model(time, value)
}