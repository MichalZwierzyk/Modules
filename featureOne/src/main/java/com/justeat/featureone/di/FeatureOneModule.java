package com.justeat.featureone.di;

import com.justeat.dependency.model.DependencyModel;
import com.justeat.dependencyTwo.model.DependencyTwoModel;
import com.justeat.featureone.model.FeatureOneModel;

import dagger.Module;
import dagger.Provides;

@Module
class FeatureOneModule {
    @Provides
    FeatureOneModel provideFeatureOneModel(DependencyModel dependencyModel, DependencyTwoModel dependencyTwoModel) {
        return new FeatureOneModel(dependencyModel, dependencyTwoModel);
    }
}
