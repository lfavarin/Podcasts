package com.leandrofavarin.podcasts.directory;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.leandrofavarin.podcasts.R;

import java.util.List;

public class DirectoryPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private List<Fragment> fragments;
    private boolean isLargeScreen;

    public DirectoryPagerAdapter(Context context, FragmentManager fManager, List<Fragment> items) {
        super(fManager);
        this.context = context;
        this.fragments = items;
        this.isLargeScreen = context.getResources().getBoolean(R.bool.largeScreen);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // TODO
        //return mFragments.get(position).getTitle(context);
        return position + " position";
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public float getPageWidth(int position) {
        if (isLargeScreen) {
            return (position == 0) ? 0.5f : 1.0f;
        }
        return super.getPageWidth(position);
    }
}
