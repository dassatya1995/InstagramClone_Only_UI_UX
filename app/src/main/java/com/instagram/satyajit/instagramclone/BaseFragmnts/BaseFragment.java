package com.instagram.satyajit.instagramclone.BaseFragmnts;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.instagram.satyajit.instagramclone.HomeFragments.Account;
import com.instagram.satyajit.instagramclone.HomeFragments.AddStory;
import com.instagram.satyajit.instagramclone.HomeFragments.Home;
import com.instagram.satyajit.instagramclone.HomeFragments.Like;
import com.instagram.satyajit.instagramclone.HomeFragments.Search;
import com.instagram.satyajit.instagramclone.R;

import java.util.ArrayList;
import java.util.List;

public class BaseFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.ic_home_black_24dp,
            R.drawable.ic_magnify_black_24dp,
            R.drawable.ic_plus_box_black_24dp,
            R.drawable.ic_heart_black_24dp,
            R.drawable.ic_account_black_24dp,
    };
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_base, container, false);
        viewPager = (ViewPager)view.findViewById(R.id.baseviewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout)view.findViewById(R.id.basetab);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
        return view;

    }
    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);

    }

    private void setupViewPager(final ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getFragmentManager());
        adapter.addFrag(new Home(), "");
        adapter.addFrag(new Search(), "");
        adapter.addFrag(new AddStory(), "");
        adapter.addFrag(new Like(), "");
        adapter.addFrag(new Account(), "");
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);

    }


    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return null;
        }
    }


}
