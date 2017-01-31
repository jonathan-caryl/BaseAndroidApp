package jonathancaryl.org.base.modules;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import jonathancaryl.org.base.annotations.ActivityContext;

@Module
public class ActivityModule {

    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return activity;
    }

    @Provides
    Activity provideActivity() {
        return activity;
    }
}
