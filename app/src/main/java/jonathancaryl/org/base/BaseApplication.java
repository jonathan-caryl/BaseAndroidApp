package jonathancaryl.org.base;

import android.app.Application;
import android.content.Context;

import jonathancaryl.org.base.components.ApplicationComponent;
import jonathancaryl.org.base.components.DaggerApplicationComponent;
import jonathancaryl.org.base.modules.ApplicationModule;

public class BaseApplication extends Application {
    protected ApplicationComponent applicationComponent;

    public static BaseApplication get(Context context) {
        return (BaseApplication)context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
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
