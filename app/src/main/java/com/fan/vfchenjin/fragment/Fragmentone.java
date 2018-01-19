package com.fan.vfchenjin.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fan.vfchenjin.R;

/**
 * Created by dell on 2018/1/18.
 */

public class Fragmentone extends Fragment {
    private View v;
    private TextView tv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=View.inflate(getActivity(), R.layout.one,null);
       tv= v.findViewById(R.id.tv);
        int statusBarHeight1 = -1;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            statusBarHeight1 = getResources().getDimensionPixelSize(resourceId);
            Log.d("sst",statusBarHeight1+"");
        }


        ViewGroup.LayoutParams layoutParams = tv.getLayoutParams();
        layoutParams.height = statusBarHeight1;
        tv.setLayoutParams(layoutParams);

        return  v;
    }

}
