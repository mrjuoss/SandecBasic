package com.mrjuoss.sandecbasic;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_wakatobi = (Button)findViewById(R.id.btn_wakatobi);
        Button btn_bali = (Button)findViewById(R.id.btn_bali);
        Button btn_bromo = (Button)findViewById(R.id.btn_bromo);
        Button btn_toraja = (Button)findViewById(R.id.btn_toraja);

        btn_wakatobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                promoTourWakatobi();
            }
        });

        btn_bali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                promoTourBali();
            }
        });

        btn_bromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                promoTourBromo();
            }
        });

        btn_toraja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                promoTourToraja();
            }
        });
    }

    private void promoTourBromo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("FLASH DEAL");
        builder.setMessage("Free city tour in Malang. Segera hubungi agen travel kami. Penawaran Terbatas");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.e("info", "OK");
            }
        });
        builder.show();
    }

    private void promoTourToraja() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("PAKET MURAH");
        builder.setMessage("Liburan ke Toraja sekeluarga hanya 1 Juta. Syarat dan Ketentuan berlaku.");
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.e("info", "NO");
            }
        });
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.e("info", "YES");
            }
        });

        builder.show();
    }

    private void promoTourBali() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("PROMO");
        builder.setMessage("Paket menginap 3 hari 2 malam 50% OFF. Segera hubungi agen travel kami.");

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.e("info", "NO");
            }
        });

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.e("Info", "YES");
            }
        });

        builder.setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.e("info", "CANCEL");
            }
        });
        builder.show();
    }

    private void promoTourWakatobi() {
        Toast.makeText(this,
                "Silahkan menghubungi agen travel kami untuk paket promo liburan ke Wakatobi",
                Toast.LENGTH_LONG).show();
    }
}
