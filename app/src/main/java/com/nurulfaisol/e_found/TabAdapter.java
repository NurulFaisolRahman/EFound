package com.nurulfaisol.e_found;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabAdapter extends FragmentPagerAdapter {

    private final List<Fragment> ListFragment = new ArrayList<>();
    private final List<String> ListJudulTab = new ArrayList<>();

    public TabAdapter(FragmentManager FM){
        super(FM);
    }

    @Override
    public Fragment getItem(int position) {
        return ListFragment.get(position);
    }

    @Override
    public int getCount() {
        return ListJudulTab.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return ListJudulTab.get(position);
    }

    public void TambahFragment(Fragment fragment, String judul){
        ListFragment.add(fragment);
        ListJudulTab.add(judul);
    }
}
