package com.instagram.satyajit.instagramclone.Likes;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.instagram.satyajit.instagramclone.R;
import com.instagram.satyajit.instagramclone.tools.CustomLikeAdapter;

public class FragmentFollowing extends Fragment {
    ListView lvlike;
    String[] msgnames = {
            "Hritik Roshan Liked Your post",
            "Alia Bhatt Liked Your post",
            "Tom IMF Started Following You",
            "Akhsay Kumar Liked Your post",
            "James Bond Started Following You",
            "bollywood Liked Your post",
            "Superman Started Following You",

    };

    private Integer[] msgprofilepic =
            {
                    R.drawable.hritik, R.drawable.alia, R.drawable.tom,
                    R.drawable.aki,
                    R.drawable.james, R.drawable.aki,
                    R.drawable.james,

            };
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_following, container, false);
        CustomLikeAdapter adapter2 = new CustomLikeAdapter(getActivity(), msgnames,msgprofilepic);
        lvlike = (ListView) view.findViewById(R.id.listviewLikefollowing);
        lvlike.setDivider(null);
        lvlike.setAdapter(adapter2);
        return view;

    }
}