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
import com.justeat.featuresuri.model.FeaturesUri;
import com.justeat.featuresuri.model.IntentSender;

import javax.inject.Inject;

public class FeatureOneActivity extends Activity {
    @Inject FeatureOneModel featureOneModel;
    @Inject DependencyModel dependencyModel;
    @Inject DependencyTwoModel dependencyTwoModel;
    @Inject IntentSender intentSender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setUpView();

        FeatureOneComponent component = (FeatureOneComponent) ComponentsContainer.INSTANCE.get(FeatureOneActivity.class.getName());

        if (component == null) {
            component = DaggerFeatureOneComponent.builder().build();
            ComponentsContainer.INSTANCE.add(FeatureOneActivity.class.getName(), component);
        }

        component.inject(this);
    }

    private void setUpView() {
        setContentView(R.layout.feature_one_activity_main);
        findViewById(R.id.go_to_next_feature_button).setOnClickListener(v -> intentSender.sendIntent(this, FeaturesUri.FEATURE_TWO));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (isFinishing()) {
            ComponentsContainer.INSTANCE.remove(FeatureOneActivity.class.getName());
        }
    }
}
