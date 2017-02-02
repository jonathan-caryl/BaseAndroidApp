package jonathancaryl.org.base.modules;

import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ReleaseModule {

    @Provides
    @Singleton
    Picasso providePicasso(Picasso.Builder picassoBuilder) {
        return picassoBuilder
                .build();
    }
}
