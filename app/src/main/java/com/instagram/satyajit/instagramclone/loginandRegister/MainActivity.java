package com.instagram.satyajit.instagramclone.loginandRegister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import com.instagram.satyajit.instagramclone.BaseFragmnts.BaseActivity;
import com.instagram.satyajit.instagramclone.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initResources();
    }
    public void initResources(){
        Button login=findViewById(R.id.login);
        Button helpsigning=findViewById(R.id.helpsigningIn);
        Button facebooksign=findViewById(R.id.facebooklogin);
        Button signup=findViewById(R.id.signup);
        login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(MainActivity.this,BaseActivity.class);
               startActivity(i);

           }
       });
        facebooksign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,BaseActivity.class);
                startActivity(i);

            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Signup.class);
                startActivity(i);

            }
        });
        helpsigning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,GethelpSigningIn.class);
                startActivity(i);

            }
        });
    }
}
