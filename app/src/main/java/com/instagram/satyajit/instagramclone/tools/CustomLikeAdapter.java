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
 * Created by satyajit on ${27/01/18}.
 */

public class CustomLikeAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;


    public CustomLikeAdapter(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.layout_like_model, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.layout_like_model, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.usernamelike);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.likeprofilepic);



        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        return rowView;

    };
}