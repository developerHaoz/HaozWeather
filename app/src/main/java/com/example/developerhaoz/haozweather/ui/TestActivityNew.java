package com.example.developerhaoz.haozweather.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.developerhaoz.haozweather.R;

/**
 * Created by developerHaoz on 2017/6/26.
 */

public class TestActivityNew extends AppCompatActivity {

    public static void startActivity(Context context){
        Intent intent = new Intent(context, TestActivityNew.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }
}
