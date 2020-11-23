package `fun`.yeshu.data.converter

import `fun`.yeshu.data.remote.bean.ModelApiBean
import `fun`.yeshu.domain.model.Model

fun ModelApiBean.toModel(): Model {
    return Model(time, value)
}