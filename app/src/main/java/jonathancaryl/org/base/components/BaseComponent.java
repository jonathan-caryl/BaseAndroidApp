package jonathancaryl.org.base.components;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import jonathancaryl.org.base.api.ApiService;
import jonathancaryl.org.base.BaseApplication;
import jonathancaryl.org.base.annotations.ApplicationContext;
import timber.log.Timber;

public interface BaseComponent {

    void inject(BaseApplication baseApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    Picasso providePicasso();

    ApiService provideApiService();

    Gson provideGson();

    Timber provideTimber();
}