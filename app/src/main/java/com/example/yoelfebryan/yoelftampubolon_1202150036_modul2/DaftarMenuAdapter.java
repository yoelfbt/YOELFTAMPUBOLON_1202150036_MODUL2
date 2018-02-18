package com.example.yoelfebryan.yoelftampubolon_1202150036_modul2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Yoel Febryan on 18/02/2018.
 */

public class DaftarMenuAdapter extends RecyclerView.Adapter<DaftarMenuAdapter.ViewHolder> {

    private ArrayList<String> ALmenu; //Membuat Arraylist untuk Judul
    private ArrayList<String> ALharga; //Membuat Arraylist untuk Menu
    private ArrayList<Integer> ALgambar; //Membuat Arraylist Gambar

    //Membuat Konstruktor pada Class ini
    DaftarMenuAdapter(ArrayList<String> arrayListMenu, ArrayList<String> arrayListsHarga, ArrayList<Integer> arrayListgambar){
        this.ALmenu = arrayListMenu;
        this.ALharga = arrayListsHarga;
        this.ALgambar = arrayListgambar;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView menu, harga;
        private ImageView gambar;
        private LinearLayout ItemList;

        ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada activity_daftarmenu
            menu = itemView.findViewById(R.id.TVmenu);
            harga = itemView.findViewById(R.id.TVharga);
            gambar = itemView.findViewById(R.id.IVgambar);
            ItemList = itemView.findViewById(R.id.list_item);
        }
    }

    @Override
    public DaftarMenuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Mengarahkan View agar ditampilkan pada activity_layout.xml
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_layout, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final DaftarMenuAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String menu = ALmenu.get(position);
        final String harga = ALharga.get(position);
        final Integer gambar = ALgambar.get(position);
        holder.menu.setText(menu);
        holder.harga.setText("Rp. "+harga);
        holder.gambar.setImageResource(gambar);

        //Membuat Aksi Saat List Ditekan
        holder.ItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailMenu.class);
                String komposisi;
                switch (position){
                    case 0:
                        intent.putExtra("menu", ALmenu.get(position));
                        intent.putExtra("harga", ALharga.get(position));
                        intent.putExtra("gambar", ALgambar.get(position));
                        komposisi = "Nasi, Kecap, Telur, Bumbu";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("menu", ALmenu.get(position));
                        intent.putExtra("harga", ALharga.get(position));
                        intent.putExtra("gambar", ALgambar.get(position));
                        komposisi = "Mie Goreng, Telur, Tomat, Cabe, Udang";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("menu", ALmenu.get(position));
                        intent.putExtra("harga", ALharga.get(position));
                        intent.putExtra("gambar", ALgambar.get(position));
                        komposisi = "Mie Kuah, Telur, Ayam";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("menu", ALmenu.get(position));
                        intent.putExtra("harga", ALharga.get(position));
                        intent.putExtra("gambar", ALgambar.get(position));
                        komposisi = "Daging, Kecap, Nasi, Cabe, Bawang";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("menu", ALmenu.get(position));
                        intent.putExtra("harga", ALharga.get(position));
                        intent.putExtra("gambar", ALgambar.get(position));
                        komposisi = "Nasi, Telur, Beef";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("menu", ALmenu.get(position));
                        intent.putExtra("harga", ALharga.get(position));
                        intent.putExtra("gambar", ALgambar.get(position));
                        komposisi = "Nasi, Kecap, Telur, Tomat, Cabe, Bawang, Sayur";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("menu", ALmenu.get(position));
                        intent.putExtra("harga", ALharga.get(position));
                        intent.putExtra("gambar", ALgambar.get(position));
                        komposisi = "Nasi, Bawang, Telur, Kecap";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return ALmenu.size();
    }
}
