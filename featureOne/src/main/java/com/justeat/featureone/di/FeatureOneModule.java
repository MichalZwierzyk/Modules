package com.justeat.featureone.di;

import com.justeat.featureone.model.FeatureOneModel;

import dagger.Module;
import dagger.Provides;

@Module
public class FeatureOneModule {
    @Provides
    FeatureOneModel provideFeatureOneModel() {
        return new FeatureOneModel();
    }
}
