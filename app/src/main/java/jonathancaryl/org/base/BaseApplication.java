package jonathancaryl.org.base;

import android.app.Application;
import android.content.Context;

import jonathancaryl.org.base.components.ApplicationComponent;
import jonathancaryl.org.base.components.DaggerApplicationComponent;
import jonathancaryl.org.base.modules.ApplicationModule;
import timber.log.Timber;

public class BaseApplication extends Application {
    protected ApplicationComponent applicationComponent;

    public static BaseApplication get(Context context) {
        return (BaseApplication)context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Ideally we would inject a suitable tree for planting,
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
