package site.pnpl.igotit

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import site.pnpl.igotit.di.DaggerAppComponent

class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<App> =
        DaggerAppComponent.builder().withContext(applicationContext).build()
}