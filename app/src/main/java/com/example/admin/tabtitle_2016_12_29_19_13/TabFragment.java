package com.example.admin.tabtitle_2016_12_29_19_13;

import android.support.v4.app.Fragment;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2017/1/16 16:02 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2017/1/16 16:02 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public class TabFragment {
    private String tabName;
    private Fragment frg;

    public TabFragment(String tabName, Fragment frg) {
        this.frg = frg;
        this.tabName = tabName;
    }

    public TabFragment() {
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public Fragment getFrg() {
        return frg;
    }

    public void setFrg(Fragment frg) {
        this.frg = frg;
    }
}
