package com.example.developerhaoz.haozweather.base.fragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager;

/**
 * 通用的 DialogFragment
 *
 * Created by developerHaoz on 2017/6/28.
 */

public class CommonDialogFragment extends DialogFragment{

    /**
     * 监听弹出窗是否被取消
     */
    private OnDialogCancelListener mCancelListener;

    /**
     * 回调获得需要显示的 Dialog
     */
    private OnCallDialogListener mOnCallDialogListener;

    public interface OnDialogCancelListener{
        void onCancel();
    }

    public interface OnCallDialogListener{
        Dialog getDialog(Context context);
    }

    public static CommonDialogFragment newInstance(OnCallDialogListener callDialogListener, boolean cancelable){
        return newInstance(callDialogListener, cancelable, null);
    }


    public static CommonDialogFragment newInstance(OnCallDialogListener callDialogListener, boolean cancelable, OnDialogCancelListener cancelListener){
        CommonDialogFragment instance = new CommonDialogFragment();
        instance.setCancelable(cancelable);
        instance.mOnCallDialogListener = callDialogListener;
        instance.mCancelListener = cancelListener;
        return instance;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if(null == mOnCallDialogListener){
            super.onCreateDialog(savedInstanceState);
        }
        return mOnCallDialogListener.getDialog(getActivity());
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        dialog.setCanceledOnTouchOutside(false);

        if(dialog != null){

            //在5.0以下的版本会出现白色背景边框，若在5.0以上设置则会造成文字部分的背景也变成透明
            if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.KITKAT) {
                //目前只有这两个dialog会出现边框
                if (dialog instanceof ProgressDialog || dialog instanceof DatePickerDialog) {
                    getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                }
            }
            Window window = getDialog().getWindow();
            WindowManager.LayoutParams windowParams = window.getAttributes();
            windowParams.dimAmount = 0.0f;
            window.setAttributes(windowParams);
        }
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        if(mCancelListener != null){
            mCancelListener.onCancel();
        }
    }
}





