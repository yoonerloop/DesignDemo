package com.example.design.designdemo.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.design.designdemo.adapter.RecycleAdapter;

/**
 * data: 2017/4/25 13:53
 * description：第一个fragment
 */
public class OneFragment extends BaseFragment {

    private RecyclerView recyclerView;

    @Override
    public View getSuccessLayout() {
        if (recyclerView == null) {
            recyclerView = new RecyclerView(activity);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecycleAdapter(activity));
        return recyclerView;
    }

    @Override
    protected void scrollToTop(int position) {
        recyclerView.scrollToPosition(0);
        Toast.makeText(activity, "第一个,position是：" + position, Toast.LENGTH_SHORT).show();
    }
}
