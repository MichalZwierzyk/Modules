package com.justeat.componentscontainer;

import java.util.HashMap;
import java.util.Map;

public enum ComponentsContainer {
    INSTANCE;

    private Map<String, Object> components = new HashMap<>();

    public void add(String componentName, Object component) {
        components.put(componentName, component);
    }

    public void remove(String componentName) {
        components.remove(componentName);
    }

    public void clear() {
        components.clear();
    }

    public Object get(String componentName) {
        return components.get(componentName);
    }
}
