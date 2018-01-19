package com.fan.vfchenjin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.fan.vfchenjin.adapter.RadioGroupFragmentPagerAdapter;
import com.fan.vfchenjin.fragment.Fragmentone;
import com.fan.vfchenjin.fragment.Fragmentthree;
import com.fan.vfchenjin.fragment.Fragmenttwo;
import com.fan.vfchenjin.widget.widget.FitStateUI;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, RadioGroup.OnCheckedChangeListener {

    private ViewPager mViewPager;
    private RadioGroup mRadioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FitStateUI.setImmersionStateMode(this);
        setContentView(R.layout.activity_main);

        //Fragment 的列表，将会显示在ViewPager里面。
        List<Fragment> mList = new ArrayList<Fragment>();
        mList.add(new Fragmentone());
        mList.add(new Fragmenttwo());
        mList.add(new Fragmentthree());

        //Adapter设置，这里面的 FragmentManager 一定要是支持包里面的SupportFragmentManager
        RadioGroupFragmentPagerAdapter adapter = new RadioGroupFragmentPagerAdapter(getSupportFragmentManager(),mList);

        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mViewPager.setAdapter(adapter);
        mRadioGroup = (RadioGroup)findViewById(R.id.radiogroup);

        //设置联动，设置ViewPager的PageChange的监听器，RadioGroup的CheckedChange监听器
        mViewPager.setOnPageChangeListener(this);
        mRadioGroup.setOnCheckedChangeListener(this);
        //默认的是 让第一个 RadioButton 是选中的状态
        mRadioGroup.check(R.id.radiobutton_a);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    //ViewPager 翻页以后，RadioGroup 也进行 相应的操作。
    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:
                mRadioGroup.check(R.id.radiobutton_a);
                break;
            case 1:
                mRadioGroup.check(R.id.radiobutton_b);
                break;
            case 2:
                mRadioGroup.check(R.id.radiobutton_c);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    //RadioGroup 点击之后切换viewPager
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.radiobutton_a:
                mViewPager.setCurrentItem(0);
                break;
            case R.id.radiobutton_b:
                mViewPager.setCurrentItem(1);
                break;
            case R.id.radiobutton_c:
                mViewPager.setCurrentItem(2);
                break;
        }
    }

}
