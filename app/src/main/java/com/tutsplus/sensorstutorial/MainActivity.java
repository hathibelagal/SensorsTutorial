package com.tutsplus.sensorstutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openProximity(View view) {
        startActivity(new Intent(MainActivity.this, ProximityActivity.class));
    }

    public void openGyroscope(View view) {
        startActivity(new Intent(MainActivity.this, GyroscopeActivity.class));
    }

    public void openRotationVector(View view) {
        startActivity(new Intent(MainActivity.this, RotationVectorActivity.class));
    }
}
