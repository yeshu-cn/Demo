package `fun`.yeshu.ui.koin

import `fun`.yeshu.domain.usecase.QueryModelListUseCase
import `fun`.yeshu.domain.usecase.QueryModelUseCase
import `fun`.yeshu.domain.usecase.SyncModelDataFromDeviceUseCase
import `fun`.yeshu.domain.usecase.SyncModelDataFromServerUseCase
import `fun`.yeshu.domain.usecase.UploadModelDataToServerUseCase
import `fun`.yeshu.ui.ModelDetailViewModel
import `fun`.yeshu.ui.ModelListViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.Koin
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope
import org.koin.dsl.module

object ModelScopeNames {
    const val NAME = "modelScopeName"
}

fun Koin.modelScope(): Scope {
    return getOrCreateScope(ModelScopeNames.NAME, named(ModelScopeNames.NAME))
}

val modelModule = module {
    // new instance of usecase

    factory {
        QueryModelUseCase(getKoin().modelScope().get())
    }

    factory {
        SyncModelDataFromDeviceUseCase(getKoin().modelScope().get())
    }

    factory {
        SyncModelDataFromServerUseCase(getKoin().modelScope().get())
    }

    factory {
        UploadModelDataToServerUseCase(getKoin().modelScope().get())
    }

    factory {
        QueryModelListUseCase(getKoin().modelScope().get())
    }

    viewModel {
        ModelListViewModel(get())
    }

    viewModel {
        ModelDetailViewModel(get())
    }
}