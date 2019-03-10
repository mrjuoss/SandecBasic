package com.mrjuoss.sandecbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food);

        getSupportActionBar().setTitle("PESANAN ANDA");

        // Ambil data dari Intent
        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("nama");
        String alamat = bundle.getString("alamat");
        String pesanan = bundle.getString("pesanan");

        // Membuat object TextView
        TextView tv_nama = (TextView)findViewById(R.id.tv_nama);
        TextView tv_alamat = (TextView)findViewById(R.id.tv_alamat);
        TextView tv_pesanan = (TextView)findViewById(R.id.tv_pesanan);

        // Set nilai ke dalam widget textView
        tv_nama.setText(nama);
        tv_alamat.setText(alamat);
        tv_pesanan.setText(pesanan);

        Button btn_cancel_order = (Button)findViewById(R.id.btn_cancel_order);
        btn_cancel_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderFoodActivity.this, GoFoodActivity.class);
                startActivity(intent);
            }
        });
    }
}
