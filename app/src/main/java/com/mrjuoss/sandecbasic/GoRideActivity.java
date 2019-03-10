package com.mrjuoss.sandecbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GoRideActivity extends AppCompatActivity {

    EditText et_jarak;
    TextView tv_total_biaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_ride);
        getSupportActionBar().setTitle("GO RIDE");

        Button btn_hitung_biaya = (Button)findViewById(R.id.btn_hitung_biaya);
        et_jarak = (EditText)findViewById(R.id.et_jarak);
        tv_total_biaya = (TextView)findViewById(R.id.tv_total_biaya);
    }

    public void hitungBiaya(View view) {
        if (et_jarak.getText().toString().isEmpty()) {
            et_jarak.setError("Error");
            return;
        }

        String jarak = et_jarak.getText().toString().trim();
        int harga_per_km = 5000;

        // Merubah jarak yang tadinya string ke integer (angka)
        int jarak_angka = Integer.parseInt(jarak);

        // Hitung harga yang harus dibayar
        int total_biaya = jarak_angka * harga_per_km;

        // Masukkan hasil perhitungan ke textView
        tv_total_biaya.setText(": " + total_biaya);
    }

    public void goHome(View view) {
        Intent intent = new Intent(this, GojekActivity.class);
        startActivity(intent);
    }
}
