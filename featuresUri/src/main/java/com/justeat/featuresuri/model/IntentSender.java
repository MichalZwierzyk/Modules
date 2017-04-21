package com.justeat.featuresuri.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class IntentSender {
    public void sendIntent(Context context, String featureUri) {
        context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(featureUri)));
    }
}
