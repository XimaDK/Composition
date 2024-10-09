package kadyshev.dmitry.composition.presentation

import android.app.Application
import kadyshev.dmitry.composition.presentation.di.appModule
import kadyshev.dmitry.composition.presentation.di.dataModule
import kadyshev.dmitry.composition.presentation.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.koinApplication

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, domainModule, dataModule))
        }
    }
}