package jonathancaryl.org.base.components;

import dagger.Component;
import jonathancaryl.org.base.MainActivity;
import jonathancaryl.org.base.annotations.PerActivity;
import jonathancaryl.org.base.modules.ActivityModule;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
