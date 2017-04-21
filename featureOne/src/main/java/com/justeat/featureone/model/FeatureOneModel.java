package com.justeat.featureone.model;

import com.justeat.dependency.model.DependencyModel;
import com.justeat.dependencyTwo.model.DependencyTwoModel;

public class FeatureOneModel {
    private final DependencyModel dependencyModel;
    private final DependencyTwoModel dependencyTwoModel;

    public FeatureOneModel(DependencyModel dependencyModel, DependencyTwoModel dependencyTwoModel) {
        this.dependencyModel = dependencyModel;
        this.dependencyTwoModel = dependencyTwoModel;
    }
}
