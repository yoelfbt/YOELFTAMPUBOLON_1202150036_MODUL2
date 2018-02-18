package com.example.yoelfebryan.yoelftampubolon_1202150036_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Yoel Febryan on 18/02/2018.
 */

public class DetailMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalimenu);
        //mengeset button back agar muncul di view
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //menerima value yang dikirimkan dari activity sebelumnya dengan syarat namenya harus sama
        String menu = getIntent().getStringExtra("menu");
        String harga = getIntent().getStringExtra("harga");
        String komposisi = getIntent().getStringExtra("komposisi");
        Integer gambar = getIntent().getIntExtra("gambar", 0);

        //mendifinisikan TextView dan ImageView dengan id
        TextView Menu = findViewById(R.id.namaMenu);
        TextView Harga = findViewById(R.id.hargaMenu);
        TextView Komposisi = findViewById(R.id.detailKomp);
        ImageView Gambar = findViewById(R.id.gambarMenu);

        //mengeset valuenya agar bisa ditampilkan pada class xml
        Menu.setText(menu);
        Harga.setText("Rp. "+harga);
        Komposisi.setText(komposisi);
        Gambar.setImageResource(gambar);
    }
    @Override
    public boolean onSupportNavigateUp() {
        //function ketika button back di klik maka akan kembali ke view sebelumnya
        onBackPressed();
        return true;
    }
}
