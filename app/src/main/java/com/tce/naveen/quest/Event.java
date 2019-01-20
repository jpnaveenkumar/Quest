package com.tce.naveen.quest;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Event extends AppCompatActivity {

    public ImageView iv;
    public TextView t1,t2,t3,t4;
    public FloatingActionButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        String name=getIntent().getExtras().getString("names");
        String time=getIntent().getExtras().getString("time");
        String location=getIntent().getExtras().getString("location");
        String descp=getIntent().getExtras().getString("description");
        int img=getIntent().getIntExtra("images",0);
        iv=(ImageView)findViewById(R.id.img);
        b1=(FloatingActionButton)findViewById(R.id.b1);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);
        t1.setText(name);
        t2.setText(time);
        t3.setText(location);
        t4.setText(descp);
        iv.setImageResource(img);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9840545516")));
            }
        });
    }
}
