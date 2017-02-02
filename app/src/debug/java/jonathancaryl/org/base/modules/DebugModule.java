package jonathancaryl.org.base.modules;

import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import timber.log.Timber;

@Module
public class DebugModule {

    @Provides
    @Singleton
    Picasso providePicasso(Picasso.Builder picassoBuilder) {
        return picassoBuilder
                .listener((picasso1, uri, e) -> Timber.i(e, "Failed to load image: %s", uri))
                .build();
    }

}
