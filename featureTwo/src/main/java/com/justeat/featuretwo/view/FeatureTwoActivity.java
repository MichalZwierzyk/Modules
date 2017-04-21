package com.justeat.featuretwo.view;

import android.app.Activity;
import android.os.Bundle;

import com.justeat.componentscontainer.ComponentsContainer;
import com.justeat.featuretwo.R;
import com.justeat.featuretwo.di.DaggerFeatureTwoComponent;
import com.justeat.featuretwo.di.FeatureTwoComponent;
import com.justeat.featuretwo.model.FeatureTwoModel;

import javax.inject.Inject;

public class FeatureTwoActivity extends Activity {
    @Inject FeatureTwoModel featureTwoModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.feature_two_activity_main);

        FeatureTwoComponent component = (FeatureTwoComponent) ComponentsContainer.INSTANCE.get(FeatureTwoActivity.class.getName());

        if (component == null) {
            component = DaggerFeatureTwoComponent.builder().build();
            ComponentsContainer.INSTANCE.add(FeatureTwoActivity.class.getName(), component);
        }

        component.inject(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (isFinishing()) {
            ComponentsContainer.INSTANCE.remove(FeatureTwoActivity.class.getName());
        }
    }
}
