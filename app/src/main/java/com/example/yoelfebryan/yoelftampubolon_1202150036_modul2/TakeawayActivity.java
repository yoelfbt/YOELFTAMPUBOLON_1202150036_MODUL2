package com.example.yoelfebryan.yoelftampubolon_1202150036_modul2;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;
import java.util.Calendar;

/**
 * Created by Yoel Febryan on 18/02/2018.
 */

public class TakeawayActivity extends AppCompatActivity {
    private TextView datepicker,timepicker;
    private DatePickerDialog.OnDateSetListener mDate;
    private TimePickerDialog.OnTimeSetListener mTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);
        Toast.makeText(TakeawayActivity.this, "Take Away", Toast.LENGTH_SHORT).show();

        datepicker = (TextView) findViewById(R.id.datepicker);
        timepicker = (TextView) findViewById(R.id.timepicker);

        datepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int tahun = cal.get(Calendar.YEAR);
                int bulan = cal.get(Calendar.MONTH);
                int hari = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        TakeawayActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDate,
                        tahun, bulan, hari);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDate = new DatePickerDialog.OnDateSetListener() {
            public String TAG;

            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;
                Log.d(TAG, "onDateSet: mm/dd/yy: " + month + "/" + dayOfMonth + "/" + year);

                String date = month + "/" + dayOfMonth + "/" + year;
                datepicker.setText(date);
            }
        };
    }
    public void timepick(View view) {
        DialogFragment newFragment = new TimePicker();
        newFragment.show(getSupportFragmentManager(), "time_picker");
    }
    public void processTimePickerResult(int hourOfDay, int minute){
        //convert waktu yang tadinya ke integer diubah ke string
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        //menggabungkan string ke waktu
        String timemessage = (hour_string + ":" + minute_string);
        Toast.makeText(this, timemessage, Toast.LENGTH_LONG).show();
    }

    //Mengatur ketika tombol di klik maka akan pindah aktivity
    public void pilihpes2(View view) {
        Intent intent = new Intent(TakeawayActivity.this, DaftarMenuActivity.class);
        startActivity(intent);
    }

}
