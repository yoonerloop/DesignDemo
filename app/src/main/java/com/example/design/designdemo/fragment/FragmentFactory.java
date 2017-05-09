package com.example.design.designdemo.fragment;


import android.support.v4.app.Fragment;

import java.util.HashMap;

/**
 * data: 2017/4/25 14:47
 * description：fragment工厂类
 */
public class FragmentFactory {

    public static HashMap<Integer, BaseFragment> hashMap = new HashMap<>();
    public static Fragment createFragment(int position) {
        BaseFragment fragment = hashMap.get(position);
        if (fragment == null) {
            switch (position) {
                case 0:
                    fragment = new OneFragment();
                    break;
                case 1:
                    fragment = new TwoFragment();
                    break;
                case 2:
                    fragment = new ThreeFragment();
                    break;

                default:
                    break;
            }
            hashMap.put(position, fragment);
        }
        return fragment;
    }
}
