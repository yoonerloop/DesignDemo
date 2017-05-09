package com.example.design.designdemo.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.design.designdemo.MainActivity;

/**
 * data: 2017/4/25 13:54
 * description： Fragment的基类
 */
public abstract class BaseFragment extends Fragment {

    public MainActivity activity;
    public View         rootView;
    public Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            scrollToTop(msg.what);
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = (MainActivity) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = getSuccessLayout();
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        activity.setHandler(mHandler);
        loadData();
    }

    protected void loadData() {
    }

    public abstract View getSuccessLayout();

    protected abstract void scrollToTop(int position);

}
