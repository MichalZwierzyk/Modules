package com.justeat.dependencyTwo.di;

import com.justeat.dependencyTwo.model.DependencyTwoModel;

import dagger.Module;
import dagger.Provides;

@Module
public class DependencyTwoModule {
    @Provides
    DependencyTwoModel provideDependencyTwoModel() {
        return new DependencyTwoModel();
    }
}
