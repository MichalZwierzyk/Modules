package com.justeat.lowleveldependency.di;

import com.justeat.lowleveldependency.model.LowLevelDependencyModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LowLevelDependencyModule {
    @Provides @Singleton
    LowLevelDependencyModel provideLowLevelDependencyModel() {
        return new LowLevelDependencyModel();
    }
}
