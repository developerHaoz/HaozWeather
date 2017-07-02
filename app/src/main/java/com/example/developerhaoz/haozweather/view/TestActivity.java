package com.example.developerhaoz.haozweather.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;

import com.example.developerhaoz.haozweather.R;
import com.example.developerhaoz.haozweather.base.net.HttpUtil;
import com.example.developerhaoz.haozweather.base.net.OnResponseCallback;
import com.example.developerhaoz.haozweather.utils.UrlUtils;
import com.orhanobut.logger.Logger;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 用于测试的 Activity
 * <p>
 * Created by developerHaoz on 2017/6/26.
 */

public class TestActivity extends AppCompatActivity implements TestAdapter.ListItemClickListener{

    private static final String TAG = "TestActivity";

    @BindView(R.id.test_btn_button1)
    Button mBtn1;
    @BindView(R.id.test_rv)
    RecyclerView mRv;

    public static final String GET_DUANZI = "http://is.snssdk.com/neihan/stream/mix/v1/?mpic=1&webp=1&essence=1&content_type=-102&message_cursor=-1&am_longitude=110&am_latitude=120&am_city=%E5%8C%97%E4%BA%AC%E5%B8%82&am_loc_time=1489226058493&count=30&min_time=1489205901&screen_width=1450&do00le_col_mode=0&iid=3216590132&device_id=32613520945&ac=wifi&channel=360&aid=7&app_name=joke_essay&version_code=612&version_name=6.1.2&device_platform=android&ssmix=a&device_type=sansung&device_brand=xiaomi&os_api=28&os_version=6.10.1&uuid=326135942187625&openudid=3dg6s95rhg2a3dg5&manifest_version_code=612&resolution=1450*2800&dpi=620&update_version_code=6120";


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
        List<Integer> mList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mList.add(i);
        }

        String urlTest = "http://guolin.tech/api/china";
        try{
            urlTest = URLEncoder.encode(urlTest, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        HttpUtil.sendHttpGet(this, UrlUtils.getWeatherUrl("北京"), new OnResponseCallback() {
            @Override
            public void onSuccess(String response) {
                Logger.json(response);
            }

            @Override
            public void onError(Exception error) {
                Logger.d(error);
            }
        });
        TestAdapter adapter = new TestAdapter(mList, this);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        mRv.setAdapter(adapter);



    }

    @Override
    public void onListItemClick(int position) {
        Log.d(TAG, "onListItemClick: " + position);
    }
}
