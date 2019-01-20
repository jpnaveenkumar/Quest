package com.example.naveen.quest;


import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.tce.naveen.quest.R;

import static com.tce.naveen.quest.R.*;


public class First extends AppCompatActivity {


    private static int TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_first);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(First.this,HomeActivity.class);
                startActivity(i);
                finish();
            }
        },TIME_OUT);

    }
}