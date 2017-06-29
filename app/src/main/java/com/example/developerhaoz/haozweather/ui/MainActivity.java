package com.example.developerhaoz.haozweather.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.developerhaoz.haozweather.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @BindView(R.id.main_btn_button1)
    Button mBtnButton1;
    @BindView(R.id.main_btn_button2)
    Button mBtnButton2;
    @BindView(R.id.main_iv_test)
    ImageView mIvTest;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        EventBus.getDefault().register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @OnClick({R.id.main_btn_button1, R.id.main_btn_button2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.main_btn_button1:

                break;
            case R.id.main_btn_button2:
                Log.d(TAG, "onViewClicked: " + "You Click button2");
                break;
        }
    }

    @Subscribe(sticky = true)
    public void onMessageEvent(MessageEvent event) {
        Toast.makeText(this, event.message, Toast.LENGTH_SHORT).show();
    }

    public static class TestNewEvent {

        private String testInfo;

        public String getTestInfo() {
            return testInfo;
        }

        public TestNewEvent(String testInfo) {
            this.testInfo = testInfo;
        }


    }
}
