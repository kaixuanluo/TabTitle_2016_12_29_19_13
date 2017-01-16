package com.example.admin.tabtitle_2016_12_29_19_13;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2017/1/16 14:00 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2017/1/16 14:00 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        ViewPager nsvp = (ViewPager) findViewById(R.id.nsvp);
        TabLayout tl = (TabLayout) findViewById(R.id.tl);

        List<TabFragment> tabFragmentList = new ArrayList<>();
        tabFragmentList.add(new TabFragment("aaaaaaaa", new RecyclerFragment()));
        tabFragmentList.add(new TabFragment("bbbbbb", new ScrollFragment()));

        nsvp.setAdapter(new MyPageAdapter(getSupportFragmentManager(), tabFragmentList));
        tl.setupWithViewPager(nsvp);
    }

    public class MyPageAdapter extends FragmentStatePagerAdapter {

        List<TabFragment> mTabFragmentList;

        public MyPageAdapter(FragmentManager fm, List<TabFragment> tabFragmentList) {
            super(fm);
            mTabFragmentList = tabFragmentList;
        }

        @Override
        public Fragment getItem(int position) {
            return mTabFragmentList.get(position).getFrg();
        }

        @Override
        public int getCount() {
            return mTabFragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTabFragmentList.get(position).getTabName();
        }
    }
}
