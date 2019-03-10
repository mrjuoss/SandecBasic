package com.mrjuoss.sandecbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GoMartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_mart);
        getSupportActionBar().setTitle("GO MART");
    }

    public void goHome(View view) {
        Intent intent = new Intent(this, GojekActivity.class);
        startActivity(intent);
    }
}
