package com.justeat.featuretwo.di;

import com.justeat.dependency.di.DependencyModule;
import com.justeat.featuretwo.view.FeatureTwoActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { FeatureTwoModule.class, DependencyModule.class })
public interface FeatureTwoComponent {
    void inject(FeatureTwoActivity featureTwoActivity);
}
