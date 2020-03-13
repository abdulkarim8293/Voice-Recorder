package com.abdulkarim.voicerecorder.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.abdulkarim.voicerecorder.fragments.FileViewerFragment;
import com.abdulkarim.voicerecorder.fragments.RecordFragment;


public class MyAdapter extends FragmentPagerAdapter {

    private String[] titles = {"Record","Save Recording" };

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:{
                return RecordFragment.newInstance(position);
            }
            case 1:{
                return FileViewerFragment.newInstance(position);
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
