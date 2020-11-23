package `fun`.yeshu.data.converter

import `fun`.yeshu.data.local.bean.ModelDaoBean
import `fun`.yeshu.domain.model.Model

fun ModelDaoBean.toModel(): Model {
    return Model(time, value)
}