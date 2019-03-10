package com.mrjuoss.sandecbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GojekActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gojek);
        getSupportActionBar().setTitle("Simple GO JEK App");

    }

    public void goFood(View view) {
        Intent intent = new Intent(this, GoFoodActivity.class);
        startActivity(intent);
    }

    public void goRide(View view) {
        Intent intent = new Intent(this, GoRideActivity.class);
        startActivity(intent);
    }

    public void goSend(View view) {
        Intent intent = new Intent(this, GoSendActivity.class);
        startActivity(intent);
    }

    public void goMart(View view) {
        Intent intent = new Intent(this, GoMartActivity.class);
        startActivity(intent);
    }
}
