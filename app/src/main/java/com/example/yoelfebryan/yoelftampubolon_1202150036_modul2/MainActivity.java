    package com.example.yoelfebryan.yoelftampubolon_1202150036_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
        //Mengatur waktu dari splash screen
        private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Mengatur perpindahan aktivity setelah splash screen dan memunculkan toast
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent menu = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(menu);
                Toast.makeText(MainActivity.this, "YOEL F.TAMPUBOLON_1202150036", Toast.LENGTH_SHORT).show();
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
