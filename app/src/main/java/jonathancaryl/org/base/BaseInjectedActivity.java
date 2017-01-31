package jonathancaryl.org.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import jonathancaryl.org.base.components.DaggerActivityComponent;
import jonathancaryl.org.base.modules.ActivityModule;

public class BaseInjectedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(BaseApplication.get(this).getApplicationComponent())
                .build();
    }
}
