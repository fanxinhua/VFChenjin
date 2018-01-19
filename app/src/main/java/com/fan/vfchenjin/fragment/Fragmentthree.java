package com.fan.vfchenjin.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fan.vfchenjin.R;

/**
 * Created by dell on 2018/1/18.
 */

public class Fragmentthree extends Fragment {
    private View v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=View.inflate(getActivity(), R.layout.three,null);
        return  v;
    }
}
