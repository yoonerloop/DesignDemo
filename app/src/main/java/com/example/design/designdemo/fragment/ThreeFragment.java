package com.example.design.designdemo.fragment;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * data: 2017/4/25 13:53
 * description：第三个fragment
 */
public class ThreeFragment extends BaseFragment {

    @Override
    public View getSuccessLayout() {
        TextView view = new TextView(getContext());
        view.setText("第3个");
        return view;
    }

    @Override
    protected void scrollToTop(int position) {
        Toast.makeText(activity, "第三个,position是："+position, Toast.LENGTH_SHORT).show();
    }
}
