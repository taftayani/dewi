package com.example.android.dewizsaqia_1202150265_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ASUS on 2/18/2018.
 */

public class TakeAway extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void onClickOrder(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }

    public void onDate(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));
    }
    public void onTime(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));
    }
}

