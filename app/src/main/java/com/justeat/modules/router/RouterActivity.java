package com.justeat.modules.router;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class RouterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Router().route(this, getIntent());
    }
}
