package com.example.developerhaoz.haozweather.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.developerhaoz.haozweather.R;

import java.util.List;

/**
 * 测试的 Adapter
 *
 * Created by developerHaoz on 2017/6/29.
 */

class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder> {

    private OnItemClickListener mClickListener;

    interface OnItemClickListener{
        void onItemClick(int position);
    }

    private List<Integer> mList;

//    public TestAdapter(List<Integer> mList){
//        this.mList = mList;
//    }
//
//    public void setOnItemClickListener(OnItemClickListener listener){
//        this.mClickListener = listener;
//    }

    @Override
    public TestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_test, parent);
        return new TestViewHolder(view);

    }

    @Override
    public void onBindViewHolder(TestViewHolder holder, final int position) {
        holder.mTvTest.setText(R.string.HEHEHE);

    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

    class TestViewHolder extends RecyclerView.ViewHolder{

        private TextView mTvTest;

        TestViewHolder(View itemView) {
            super(itemView);
            mTvTest = (TextView) itemView.findViewById(R.id.item_test_tv);
        }
     }
}
