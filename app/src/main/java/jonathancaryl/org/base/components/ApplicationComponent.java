package jonathancaryl.org.base.components;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import jonathancaryl.org.base.modules.ApplicationModule;
import jonathancaryl.org.base.BaseApplication;
import jonathancaryl.org.base.annotations.ApplicationContext;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(BaseApplication baseApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();
}