package com.instagram.satyajit.instagramclone.BaseFragmnts;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.instagram.satyajit.instagramclone.R;
import com.instagram.satyajit.instagramclone.loginandRegister.MainActivity;
import com.instagram.satyajit.instagramclone.tools.CustomListAdapter;
import com.instagram.satyajit.instagramclone.tools.CustomMessageAdapter;

/**
 * Created by satyajit on 28/01/2018.
 */

public class MessagesFragment extends Fragment {

    ListView lvmsg;
    String[] msgnames = {
            "Hritik Roshan",
            "Alia Bhatt",
            "Tom IMF",
            "Akhsay Kumar",
            "James Bond",
    };

    private Integer[] msgprofilepic =
            {
                    R.drawable.hritik, R.drawable.alia, R.drawable.tom,
                    R.drawable.aki,
                    R.drawable.james
            };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_messages, container, false);
        CustomMessageAdapter adapter2 = new CustomMessageAdapter(getActivity(), msgnames,msgprofilepic);
        lvmsg =view.findViewById(R.id.listviewmessage);
        lvmsg.setDivider(null);
        lvmsg.setAdapter(adapter2);
        Button camera=view.findViewById(R.id.messagecamera);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(i);
            }
        });
        return view;
    }
}
