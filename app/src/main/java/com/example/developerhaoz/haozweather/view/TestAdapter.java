package com.example.developerhaoz.haozweather.view;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
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

    private static final String TAG = "TestAdapter";

    final private ListItemClickListener mOnClickener;

    public interface ListItemClickListener{
        void onListItemClick(int position);
    }

    private List<Integer> mList;

    public TestAdapter(List<Integer> mList, ListItemClickListener listener){
        this.mList = mList;
        this.mOnClickener = listener;
    }

    @Override
    public TestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_test, null);
        return new TestViewHolder(view);

    }

    @Override
    public void onBindViewHolder(TestViewHolder holder, final int position) {
        holder.mTvTest.setText(R.string.HEHEHE);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: ");
            }
        });

    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

    class TestViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView mTvTest;

        TestViewHolder(View itemView) {
            super(itemView);
            mTvTest = (TextView) itemView.findViewById(R.id.item_test_tv);
        }

        @Override
        public void onClick(View v) {
            mOnClickener.onListItemClick(getAdapterPosition());
        }
    }
}
