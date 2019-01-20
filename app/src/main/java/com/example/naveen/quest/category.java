package com.example.naveen.quest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.tce.naveen.quest.R;

import java.util.ArrayList;
import java.util.List;

public class category extends AppCompatActivity {

    public ListView li1;
    public Context con;
    public ArrayList al;
    public String[] names={"Dramatics","Music"};
    public int[] dra={R.drawable.tamilessay, R.drawable.engessay};

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
