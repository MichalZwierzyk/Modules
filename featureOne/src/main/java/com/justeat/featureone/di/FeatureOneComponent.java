package com.justeat.featureone.di;

import com.justeat.dependencyTwo.di.DependencyTwoModule;
import com.justeat.dependency.di.DependencyModule;
import com.justeat.featureone.view.FeatureOneActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { FeatureOneModule.class, DependencyModule.class, DependencyTwoModule.class })
public interface FeatureOneComponent {
    void inject(FeatureOneActivity featureOneActivity);
}
