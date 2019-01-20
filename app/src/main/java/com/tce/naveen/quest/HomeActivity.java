package com.tce.naveen.quest;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {


    FloatingActionButton menu1,menu2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        menu1 = (FloatingActionButton)findViewById(R.id.subFloatingMenu1) ;
        menu2 = (FloatingActionButton)findViewById(R.id.subFloatingMenu2) ;
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(HomeActivity.this,category.class);
                startActivity(i);
                //Toast.makeText(HomeActivity.this , " Event Icon clicked ", Toast.LENGTH_LONG).show();

            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tce.edu"));
                startActivity(i);
                //Toast.makeText(HomeActivity.this , "Register Icon clicked", Toast.LENGTH_LONG).show();

            }
        });


    }
}
