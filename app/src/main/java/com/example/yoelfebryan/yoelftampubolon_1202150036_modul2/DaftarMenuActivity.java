package com.example.yoelfebryan.yoelftampubolon_1202150036_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Yoel Febryan on 18/02/2018.
 */

public class DaftarMenuActivity extends AppCompatActivity {
    private RecyclerView rvmenu;
    private RecyclerView.Adapter rvadapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Menu;
    private ArrayList<String> Harga;
    private ArrayList<Integer> Gambar;

    //Daftar Menu, Daftar Harga, Daftar Gambar
    private String[] menu = {"Nasi Goreng", "Mie Goreng Spesial", "Mie Kuah Spesial", "Sate Madura","Nasi Wagyu", "Mie Kuah Upnormal", "Nasi Goreng Bawang"};
    private String[] harga = {"15.000", "10.000", "10.000", "25.000", "30.000", "25.000", "30.000"};
    private int[] gambar = {R.drawable.nasigoreng, R.drawable.miegoreng, R.drawable.miekuah, R.drawable.satemadura, R.drawable.nasiwagyu, R.drawable.miekuahupnormal,
            R.drawable.nasigorengbawang};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);

        Menu = new ArrayList<>();
        Harga = new ArrayList<>();
        Gambar = new ArrayList<>();

        rvmenu= findViewById(R.id.RVmenu);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        rvmenu.setLayoutManager(layoutManager);
        rvmenu.setHasFixedSize(true);
        rvadapter = new DaftarMenuAdapter(Menu, Harga, Gambar);
        //Memasang Adapter pada RecyclerView
        rvmenu.setAdapter(rvadapter);
    }
    private void DaftarItem() {
        for (int a=0; a<menu.length; a++){
            Gambar.add(gambar[a]);
            Menu.add(menu[a]);
            Harga.add(harga[a]);
        }
    }
}
