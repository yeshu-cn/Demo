package `fun`.yeshu.domain.data.converter

import `fun`.yeshu.domain.data.remote.bean.ModelApiBean
import `fun`.yeshu.domain.model.Model

fun ModelApiBean.toModel(): Model {
    return Model(time, value)
}