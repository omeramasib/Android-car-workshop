package com.omeramasib.workshop;

import android.content.Context;
import android.content.Intent;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public void buregister(View view) {
        Intent intent =new Intent(this,MapsActivity.class);
        startActivity(intent);
        Toast.makeText(this,"your register sucssesful",Toast.LENGTH_LONG).show();
    }
}
