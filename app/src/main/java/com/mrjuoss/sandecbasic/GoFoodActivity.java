package com.mrjuoss.sandecbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GoFoodActivity extends AppCompatActivity {

    EditText et_nama;
    EditText et_alamat;
    EditText et_pesanan;
    Button btn_order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);
        getSupportActionBar().setTitle("GO FOOD");

        et_nama = (EditText)findViewById(R.id.et_nama);
        et_alamat = (EditText)findViewById(R.id.et_alamat);
        et_pesanan = (EditText)findViewById(R.id.et_menu);

        btn_order = (Button)findViewById(R.id.btn_order);

        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GoFoodActivity.this, OrderFoodActivity.class);

                Bundle bundle = new Bundle();

                String nama = et_nama.getText().toString();
                String alamat = et_alamat.getText().toString();
                String pesanan = et_pesanan.getText().toString();

                bundle.putString("nama", nama);
                bundle.putString("alamat", alamat);
                bundle.putString("pesanan", pesanan);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }

    public void goHome(View view) {
        Intent intent = new Intent(this, GojekActivity.class);
        startActivity(intent);
    }
}
