package com.instagram.satyajit.instagramclone.HomeFragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.instagram.satyajit.instagramclone.BaseFragmnts.BaseActivity;
import com.instagram.satyajit.instagramclone.R;

public class AddStoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_story);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(this, BaseActivity.class);
        startActivity(i);
    }
}
