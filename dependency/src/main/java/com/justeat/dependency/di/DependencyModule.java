package com.justeat.dependency.di;

import com.justeat.dependency.model.DependencyModel;
import com.justeat.lowleveldependency.di.LowLevelDependencyModule;
import com.justeat.lowleveldependency.model.LowLevelDependencyModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = LowLevelDependencyModule.class)
public class DependencyModule {
    @Provides @Singleton
    DependencyModel provideDependencyModel(LowLevelDependencyModel lowLevelDependencyModel) {
        return new DependencyModel(lowLevelDependencyModel);
    }
}
