package com.instagram.satyajit.instagramclone.loginandRegister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.instagram.satyajit.instagramclone.R;

public class GethelpSigningIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gethelp_signing_in);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Log In Help");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
