package com.instagram.satyajit.instagramclone.BaseFragmnts;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.instagram.satyajit.instagramclone.R;

/**
 * Created by satyajit on 25/01/2018.
 */

public class CameraFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_camera, container, false);
        Button camera=view.findViewById(R.id.cameraFragment);
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