package labs.creative.swipeassigment

import android.app.Application
import labs.creative.swipeassigment.di.golbalModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(golbalModule)
        }
    }

}