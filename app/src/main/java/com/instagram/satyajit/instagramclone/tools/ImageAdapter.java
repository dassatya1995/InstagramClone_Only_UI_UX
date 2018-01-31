package com.instagram.satyajit.instagramclone.tools;

/**
 * Created by satyajit on 28/01/18.
 */
// Grid view
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.instagram.satyajit.instagramclone.R;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // createing a new view for each item
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setPadding(0, 5, 8, 3);

        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to images
    private Integer[] mThumbIds = {
            R.drawable.car, R.drawable.fanatasy,
            R.drawable.tom, R.drawable.aki,
            R.drawable.robo, R.drawable.james,
            R.drawable.alia, R.drawable.hritik,
            R.drawable.alia, R.drawable.cycle,
            R.drawable.pp

    };
}