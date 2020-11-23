package `fun`.yeshu.domain.data.converter

import `fun`.yeshu.data.local.bean.ModelDaoBean
import `fun`.yeshu.domain.data.remote.bean.ModelApiBean
import `fun`.yeshu.domain.model.Model

fun Model.toModelApiBean(): ModelApiBean {
    return ModelApiBean(time, value)
}

fun Model.toModelDaoBean(): ModelDaoBean {
    return ModelDaoBean(time, value)
}