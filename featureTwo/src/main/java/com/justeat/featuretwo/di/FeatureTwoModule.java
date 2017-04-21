package com.justeat.featuretwo.di;

import com.justeat.dependency.model.DependencyModel;
import com.justeat.featuretwo.model.FeatureTwoModel;

import dagger.Module;
import dagger.Provides;

@Module
class FeatureTwoModule {
    @Provides
    FeatureTwoModel provideFeatureTwoModel(DependencyModel dependencyModel) {
        return new FeatureTwoModel(dependencyModel);
    }
}
