package `fun`.yeshu.demo

import `fun`.yeshu.demo.koin.appModules
import `fun`.yeshu.ui.koin.modelModule
import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class DemoApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@DemoApplication)
            modules(arrayListOf<Module>().apply {
                add(appModules)
                add(modelModule)
            })
        }
    }
}