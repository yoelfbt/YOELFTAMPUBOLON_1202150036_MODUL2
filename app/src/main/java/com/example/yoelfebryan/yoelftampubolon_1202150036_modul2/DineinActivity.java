package com.example.yoelfebryan.yoelftampubolon_1202150036_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Yoel Febryan on 18/02/2018.
 */

public class DineinActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);
        Toast.makeText(DineinActivity.this, "Dine In", Toast.LENGTH_SHORT).show();


        //Mengatur isi dari spinner agar bisa ditampilkan
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.tables, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    //Mengatur item agar ketika di select maka memunculkan toast
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text + " telah dipilih", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    //Mengatur aksi tombol ketika ditekan
    public void pilihpes1(View view) {
        Intent intent = new Intent(DineinActivity.this,DaftarMenuActivity.class);
        startActivity(intent);
    }
}
