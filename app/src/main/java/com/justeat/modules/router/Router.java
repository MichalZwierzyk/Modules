package com.justeat.modules.router;

import android.content.Context;
import android.content.Intent;

import com.justeat.featureone.view.FeatureOneActivity;
import com.justeat.featuretwo.view.FeatureTwoActivity;

import static com.justeat.featuresuri.model.FeaturesUri.FEATURE_ONE;
import static com.justeat.featuresuri.model.FeaturesUri.FEATURE_TWO;

class Router {
    void route(Context context, Intent intent) {
        switch(intent.getData().toString()) {
            case FEATURE_ONE:
                context.startActivity(new Intent(context, FeatureOneActivity.class));
                break;
            case FEATURE_TWO:
                context.startActivity(new Intent(context, FeatureTwoActivity.class));
                break;
            default:
                break;
        }
    }
}
