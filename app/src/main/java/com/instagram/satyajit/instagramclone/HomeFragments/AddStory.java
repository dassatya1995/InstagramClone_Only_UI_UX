
package com.instagram.satyajit.instagramclone.HomeFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.instagram.satyajit.instagramclone.AddStory.GalleryFragment;
import com.instagram.satyajit.instagramclone.AddStory.Photo;
import com.instagram.satyajit.instagramclone.AddStory.Video;
import com.instagram.satyajit.instagramclone.Likes.FragmentFollowing;
import com.instagram.satyajit.instagramclone.Likes.FragmentYou;
import com.instagram.satyajit.instagramclone.R;

import java.util.ArrayList;
import java.util.List;

public class AddStory extends Fragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_story, container, false);
        viewPager=view.findViewById(R.id.viewpageraddstory);
        tabLayout=view.findViewById(R.id.tabaddstory);
        setupViewPager();
        tabLayout.setupWithViewPager(viewPager);
        return view;

    }

    public void setupViewPager(){
       ViewPagerAdapter adapter =new ViewPagerAdapter(getFragmentManager());
        adapter.addFragment(new GalleryFragment(),"Gallery"); //index 0
        adapter.addFragment(new Photo(),"Photo"); //index 1
        adapter.addFragment(new Video(),"Video"); //index 2
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

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}