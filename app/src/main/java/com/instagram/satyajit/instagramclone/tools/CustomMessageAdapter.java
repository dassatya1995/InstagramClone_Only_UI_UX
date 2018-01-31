package com.instagram.satyajit.instagramclone.tools;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.instagram.satyajit.instagramclone.R;

/**
 * Created by satyajit on ${28/01/18}.
 */

public class CustomMessageAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] msgusername;
    private final Integer[] msgprofilepic;

    public CustomMessageAdapter(Activity context, String[] msgusername, Integer[] msgprofilepic) {
        super(context, R.layout.layout_view_message, msgusername);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.msgusername=msgusername;
        this.msgprofilepic=msgprofilepic;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.layout_view_message, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.usernamemsg);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.profile_photomsg);

        txtTitle.setText(msgusername[position]);
        imageView.setImageResource(msgprofilepic[position]);
        return rowView;

    };
}