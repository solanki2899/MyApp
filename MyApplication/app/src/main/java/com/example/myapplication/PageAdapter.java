package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter
{
    int ntabs;


    public PageAdapter(FragmentManager fm,int n) {
        super(fm);
        this.ntabs=n;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:return new tab1();
            case 1:return new tab2();
            case 2:return new tab3();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return ntabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
