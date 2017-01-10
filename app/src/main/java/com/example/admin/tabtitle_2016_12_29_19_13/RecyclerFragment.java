package com.example.admin.tabtitle_2016_12_29_19_13;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * --------------------------------------------
 * auther :  Lvfq
 * 2016/12/27 0:32
 * description ：
 * -------------------------------------------
 **/
public class RecyclerFragment extends Fragment {

    private View view;
    private RecyclerView recyclerView;
    private List<String> mList = new ArrayList<>();
    private RecyclAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_recycler, container, false);

        initData();

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = new RecyclAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        return view;
    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            mList.add("item" + i);
        }
    }


    private class RecyclAdapter extends RecyclerView.Adapter<RecyclAdapter.MyHolder> {

        private List<String> list;

        public RecyclAdapter(List<String> list) {
            this.list = list;
        }

        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyHolder(LayoutInflater.from(getActivity()).inflate(android.R.layout.simple_list_item_1, parent, false));
        }

        @Override
        public void onBindViewHolder(MyHolder holder, int position) {
            String item = list.get(position);
            holder.tv_title.setText(item);
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class MyHolder extends RecyclerView.ViewHolder {
            TextView tv_title;

            public MyHolder(View itemView) {
                super(itemView);
                tv_title = (TextView) itemView.findViewById(android.R.id.text1);
            }
        }
    }


}
