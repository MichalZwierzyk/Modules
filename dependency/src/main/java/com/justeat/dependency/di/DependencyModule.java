package com.justeat.dependency.di;

import com.justeat.dependency.model.DependencyModel;
import com.justeat.lowleveldependency.di.LowLevelDependencyModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = LowLevelDependencyModule.class)
public class DependencyModule {
    @Provides @Singleton
    DependencyModel provideDependencyModel() {
        return new DependencyModel();
    }
}
