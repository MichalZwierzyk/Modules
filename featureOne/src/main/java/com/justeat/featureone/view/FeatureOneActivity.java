package com.justeat.featureone.view;

import android.app.Activity;
import android.os.Bundle;

import com.justeat.componentscontainer.ComponentsContainer;
import com.justeat.dependency.model.DependencyModel;
import com.justeat.dependencyTwo.model.DependencyTwoModel;
import com.justeat.featureone.R;
import com.justeat.featureone.di.DaggerFeatureOneComponent;
import com.justeat.featureone.di.FeatureOneComponent;
import com.justeat.featureone.model.FeatureOneModel;
import com.justeat.lowleveldependency.model.LowLevelDependencyModel;

import javax.inject.Inject;

public class FeatureOneActivity extends Activity {
    @Inject FeatureOneModel featureOneModel;
    @Inject DependencyModel dependencyModel;
    @Inject DependencyTwoModel dependencyTwoModel;
    @Inject LowLevelDependencyModel lowLevelDependencyModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_feature_one);

        FeatureOneComponent component = (FeatureOneComponent) ComponentsContainer.INSTANCE.get(FeatureOneActivity.class.getName());

        if (component == null) {
            component = DaggerFeatureOneComponent.builder().build();
            ComponentsContainer.INSTANCE.add(FeatureOneActivity.class.getName(), component);
        }

        component.inject(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (isFinishing()) {
            ComponentsContainer.INSTANCE.remove(FeatureOneActivity.class.getName());
        }
    }
}
