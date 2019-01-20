package com.tce.naveen.quest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class category extends AppCompatActivity {

    public ListView li1;
    public Context con;
    public ArrayList al;
    public String[] names={"English Litz","Tamil Litz","Online","Dance","Dramatics","Creative Drawing","Music","Skill events"};
    public int[] dra={R.drawable.eng1,R.drawable.tamil1,R.drawable.online1,R.drawable.dance1,R.drawable.dc1,R.drawable.draw1,R.drawable.song1,R.drawable.skill1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        //li1=(ListView)findViewById(R.id.list1);
        con=this;
        li1=(ListView)findViewById(R.id.list1);
        li1.setAdapter(new CustomAdap1(this,names,dra));
        li1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(view.getContext(),MainActivity.class);
                intent.putExtra("place",i);
                //intent.putExtra("images",dra[i]);
                startActivity(intent);
            }
        });
    }
}
