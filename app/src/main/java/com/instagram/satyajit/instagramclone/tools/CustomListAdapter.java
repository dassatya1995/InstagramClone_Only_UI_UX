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

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    private final Integer[] profilepics;

    public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid,Integer[] profilepics) {
        super(context, R.layout.layout_view_post, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.profilepics=profilepics;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.layout_view_post, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.username);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.post_image);
        ImageView imageView2 = (ImageView) rowView.findViewById(R.id.profile_photo);


        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        imageView2.setImageResource(profilepics[position]);
        return rowView;

    };
}