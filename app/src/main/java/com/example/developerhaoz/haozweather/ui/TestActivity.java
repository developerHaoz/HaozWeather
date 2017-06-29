package com.example.developerhaoz.haozweather.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.developerhaoz.haozweather.R;
import com.example.developerhaoz.haozweather.base.fragment.DialogFragmentHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 用于测试的 Activity
 *
 * Created by developerHaoz on 2017/6/26.
 */

public class TestActivity extends AppCompatActivity{

    @BindView(R.id.test_btn_button1)
    Button mBtn1;

    private static final String TAG = "TestActivity";

    private DialogFragment mDialogFragment;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, TestActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                mDialogFragment = DialogFragmentHelper.showProgress(fragmentManager, "正在加载中...");
            }
        });

    }

}
