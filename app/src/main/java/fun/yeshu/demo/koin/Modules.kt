package `fun`.yeshu.demo.koin

import `fun`.yeshu.domain.data.ModelRepositoryImpl
import `fun`.yeshu.domain.data.device.DeviceApi
import `fun`.yeshu.domain.data.local.ModelDao
import `fun`.yeshu.domain.data.remote.WebApi
import `fun`.yeshu.demo.fake.FakeDeviceApiImpl
import `fun`.yeshu.demo.fake.FakeModelDaoImpl
import `fun`.yeshu.demo.fake.FakeWebApiImpl
import `fun`.yeshu.domain.repository.ModelRepository
import `fun`.yeshu.ui.koin.ModelScopeNames
import org.koin.core.qualifier.named
import org.koin.dsl.module

val appModules = module {

    factory<DeviceApi> {
        FakeDeviceApiImpl()
    }

    factory<WebApi> {
        FakeWebApiImpl()
    }

    factory<ModelDao> {
        FakeModelDaoImpl()
    }

    scope(named(ModelScopeNames.NAME)) {
        scoped<ModelRepository> {
            ModelRepositoryImpl(get(), get(), get())
        }
    }
}