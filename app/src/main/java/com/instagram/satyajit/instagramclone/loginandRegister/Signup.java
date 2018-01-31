package com.instagram.satyajit.instagramclone.loginandRegister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.instagram.satyajit.instagramclone.BaseFragmnts.BaseActivity;
import com.instagram.satyajit.instagramclone.R;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button login=findViewById(R.id.loginsignup);
        Button fbLoging=findViewById(R.id.loginfbsignup);
        Button signUplogin=findViewById(R.id.signuplogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), BaseActivity.class);
                startActivity(i);
                finish();
            }
        });
        fbLoging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), BaseActivity.class);
                startActivity(i);
                finish();
            }
        });
        signUplogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
