package com.example.yoelfebryan.yoelftampubolon_1202150036_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Yoel Febryan on 17/02/2018.
 */

public class MenuActivity extends AppCompatActivity {
    private RadioGroup rg;
    private RadioButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //Mengarahkan sesuai dengan id pada class xml
        rg = findViewById(R.id.Radiogroup);
    }

    //Mengatur aksi apabila radio button di klik maka akan pindah aktivity sesuai dengan radio button yang dipilih
    public void pesan(View view) {
        int rbselected = rg.getCheckedRadioButtonId();
        rb1 = findViewById(R.id.rbdine);
        rb2 = findViewById(R.id.rbtake);

        if(rbselected == rb1.getId()){
            Intent intent = new Intent(MenuActivity.this,DineinActivity.class);
            startActivity(intent);
        }else {
            Intent intent = new Intent(MenuActivity.this,TakeawayActivity.class);
            startActivity(intent);
        }
    }
}
