package com.example.android.dewizsaqia_1202150265_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ASUS on 2/18/2018.
 */

public class DetailMenu extends AppCompatActivity {
    TextView tv_food, tv_price;
    ImageView iv_photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        Intent intent = getIntent();
        String food = intent.getStringExtra("food");
        Integer price = intent.getIntExtra("price",0);
        Integer photo = intent.getIntExtra("photo",0);

        Log.d("getIntExtra", ""+price+photo);

        tv_food = (TextView)findViewById(R.id.tv_detFood);
        tv_price = (TextView)findViewById(R.id.tv_detPrice);
        iv_photo = (ImageView)findViewById(R.id.iv_detPhoto);

        tv_food.setText(food);
        tv_price.setText("Rp. "+price);
        iv_photo.setImageResource(photo);
    }
}
