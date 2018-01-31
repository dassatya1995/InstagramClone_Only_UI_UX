
package com.instagram.satyajit.instagramclone.HomeFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.instagram.satyajit.instagramclone.BaseFragmnts.BaseFragment;
import com.instagram.satyajit.instagramclone.R;
import com.instagram.satyajit.instagramclone.tools.ImageAdapter;

public class Account extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);
        GridView gridview = (GridView)view.findViewById(R.id.gridView);
        gridview.setAdapter(new ImageAdapter(getActivity()));

        return view;

    }
}