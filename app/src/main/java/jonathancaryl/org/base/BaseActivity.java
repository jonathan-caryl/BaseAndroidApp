package jonathancaryl.org.base;

import android.support.v7.app.AppCompatActivity;

import jonathancaryl.org.base.components.ActivityComponent;
import jonathancaryl.org.base.components.DaggerActivityComponent;
import jonathancaryl.org.base.modules.ActivityModule;

public class BaseActivity extends AppCompatActivity {

    protected ActivityComponent getActivityComponent() {
        return DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(BaseApplication.get(this).getApplicationComponent())
                .build();
    }
}
