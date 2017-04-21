package com.justeat.dependency.model;

import com.justeat.lowleveldependency.model.LowLevelDependencyModel;

public class DependencyModel {
    private final LowLevelDependencyModel lowLevelDependencyModel;

    public DependencyModel(LowLevelDependencyModel lowLevelDependencyModel) {
        this.lowLevelDependencyModel = lowLevelDependencyModel;
    }
}
