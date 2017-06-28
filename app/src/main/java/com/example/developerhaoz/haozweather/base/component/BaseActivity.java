package com.example.developerhaoz.haozweather.base.component;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 所有 Activity 的基类
 *
 * Created by developerHaoz on 2017/6/28.
 */

public abstract class BaseActivity extends AppCompatActivity{

    private Unbinder mUnbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        mUnbinder = ButterKnife.bind(this);
        init(savedInstanceState);
    }

    /**
     * 返回布局的 id
     *
     * @return 布局的 id
     */
    public abstract int getContentViewId();

    public abstract void init(Bundle saveInstanceState);

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
    }

    public void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private static DialogFragment mDialogFragment;

    protected DialogFragment showLoading(String message){
        if(mDialogFragment == null){
            // TODO: 添加显示正在加载的 DialogFragment
        }
        return mDialogFragment;
    }

    public static void dismissLoading(){
        if(mDialogFragment != null){
            mDialogFragment.dismiss();
            mDialogFragment = null;
        }
    }
}

























