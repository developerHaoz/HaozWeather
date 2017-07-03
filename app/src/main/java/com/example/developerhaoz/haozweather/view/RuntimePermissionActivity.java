package com.example.developerhaoz.haozweather.view;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.widget.Button;

import com.example.developerhaoz.haozweather.R;
import com.example.developerhaoz.haozweather.base.component.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 测试运行时权限的 Activity
 * <p>
 * created by developerhaoz on 2017/7/3.
 */

public class RuntimePermissionActivity extends BaseActivity {

    @BindView(R.id.runtime_permission_btn_request_permission)
    Button mBtnRequestPermission;

    @Override
    public int getContentViewId() {
        return R.layout.activity_runtime_permission;
    }

    @Override
    public void init(Bundle saveInstanceState) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.runtime_permission_btn_request_permission)
    public void onViewClicked() {
        if (ContextCompat.checkSelfPermission(RuntimePermissionActivity.this, Manifest.
                permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(RuntimePermissionActivity.this, new
                    String[]{Manifest.permission.CALL_PHONE}, 1);
        }else {
            call();
        }
    }

    private void call() {

        try {
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:10086"));
            startActivity(intent);
        }catch (SecurityException e){
            e.printStackTrace();
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 1:
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    call();
                }else {
                    showToast("You denied the permission");
                }
        }
    }
}









