package `fun`.yeshu.domain.data.converter

import `fun`.yeshu.domain.data.remote.bean.ModelApiBean
import `fun`.yeshu.domain.entity.model.Model

fun ModelApiBean.toModel(): Model {
    return Model(time, value)
}