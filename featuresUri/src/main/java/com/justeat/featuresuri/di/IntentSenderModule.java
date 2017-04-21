package com.justeat.featuresuri.di;

import com.justeat.featuresuri.model.IntentSender;

import dagger.Provides;

@dagger.Module
public class IntentSenderModule {
    @Provides
    IntentSender provideIntentSender() {
        return new IntentSender();
    }
}
