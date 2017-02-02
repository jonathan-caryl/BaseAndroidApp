package jonathancaryl.org.base.components;

import javax.inject.Singleton;

import dagger.Component;
import jonathancaryl.org.base.modules.ApplicationModule;
import jonathancaryl.org.base.modules.DebugModule;

@Singleton
@Component(modules = {ApplicationModule.class, DebugModule.class})
public interface ApplicationComponent extends BaseComponent {
}
