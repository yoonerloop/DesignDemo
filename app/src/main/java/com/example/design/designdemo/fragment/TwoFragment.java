package com.example.design.designdemo.fragment;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * data: 2017/4/25 13:53
 * description：  第二个fragment
 */
public class TwoFragment extends BaseFragment {

    @Override
    public View getSuccessLayout() {
        TextView view = new TextView(activity);
        view.setText("第二个");
        return view;
    }

    @Override
    protected void scrollToTop(int position) {
        Toast.makeText(activity, "第二个,position是："+position, Toast.LENGTH_SHORT).show();
    }
}
