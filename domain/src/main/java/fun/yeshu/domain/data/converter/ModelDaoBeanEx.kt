package `fun`.yeshu.domain.data.converter

import `fun`.yeshu.domain.data.local.bean.ModelDaoBean
import `fun`.yeshu.domain.entity.model.Model

fun ModelDaoBean.toModel(): Model {
    return Model(time, value)
}