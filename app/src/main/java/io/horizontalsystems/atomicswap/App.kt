package io.horizontalsystems.atomicswap

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()

//        // Enable debug bridge
//        Stetho.initializeWithDefaults(this);
//
//        if (LeakCanary.isInAnalyzerProcess(this)) {
//            // This process is dedicated to LeakCanary for heap analysis.
//            // You should not init your app in this process.
//            return
//        }
//
//        LeakCanary.install(this)

        instance = this
    }

    companion object {
        lateinit var instance: App
            private set
    }

}
