
package com.instagram.satyajit.instagramclone.HomeFragments;


import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ListView;


import com.instagram.satyajit.instagramclone.R;
import com.instagram.satyajit.instagramclone.tools.CustomListAdapter;


public class Home extends Fragment {
    ListView lv1;
    String[] itemname = {
            "Hritik Roshan",
            "Alia Bhatt",
            "Tom IMF",
            "Akhsay Kumar",
            "James Bond",
    };
    private Integer[] imgid =
            {
                    R.drawable.car, R.drawable.cycle, R.drawable.tom,
                    R.drawable.fanatasy,
                    R.drawable.robo
            };
    private Integer[] profilepics =
            {
                    R.drawable.hritik, R.drawable.alia, R.drawable.tom,
                    R.drawable.aki,
                    R.drawable.james
            };


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        lv1 = view.findViewById(R.id.listView);
        CustomListAdapter adapter = new CustomListAdapter(getActivity(), itemname, imgid,profilepics);
        lv1 = (ListView) view.findViewById(R.id.listView);
        lv1.setDivider(null);
        lv1.setAdapter(adapter);

        return view;

    }

}