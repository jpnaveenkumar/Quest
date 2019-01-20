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

public class MainActivity extends AppCompatActivity {

    public ListView li;
    public Context con;
    public ArrayList al;
    public int pos;
    public String[] names={"Tamil Essay","English Essay","Tamil Story Telling","English Story Telling"};
    public String[] time={"9:00 A.M. - 11:00 A.M.","11:00 A.M. - 1:00 P.M.","9:00 A.M. - 11:00 A.M.","11:00 A.M. - 1:00 P.M."};
    public String[] location={"S1 Hall","B4 hall","S2 Hall","B5 Hall"};
    public String[] descp={"Innovative Tamil writeups for 2 to 3 pages with 2 hours time limit"
            ,"Innovative English writeups for 2 to 3 pages with 2 hours time limit"
            ,"Innovative Story in Tamil dealing about current trend in TamilNadu for 3 minutes"
            ,"Innovative Story in English dealing about current trend in TamilNadu for 3 minutes"};
    public int[] dra={R.drawable.tamilessay,R.drawable.engessay,R.drawable.tamilessay,R.drawable.engessay};

    public String[] names1={"French Essay","Hindi Essay","Tamil Story Telling","English Story Telling"};
    public String[] time1={"9:00 A.M. - 11:00 A.M.","11:00 A.M. - 1:00 P.M.","9:00 A.M. - 11:00 A.M.","11:00 A.M. - 1:00 P.M."};
    public String[] location1={"S1 Hall","B4 hall","S2 Hall","B5 Hall"};
    public String[] descp1={"Innovative Tamil writeups for 2 to 3 pages with 2 hours time limit"
            ,"Innovative English writeups for 2 to 3 pages with 2 hours time limit"
            ,"Innovative Story in Tamil dealing about current trend in TamilNadu for 3 minutes"
            ,"Innovative Story in English dealing about current trend in TamilNadu for 3 minutes"};
    public int[] dra1={R.drawable.tamilessay,R.drawable.engessay,R.drawable.tamilessay,R.drawable.engessay};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        con=this;
        pos=getIntent().getExtras().getInt("place");
        li=(ListView)findViewById(R.id.list);
        if(pos==0)
        {
            li.setAdapter(new CustomAdap(this,names,dra));
        }
        else if(pos==1)
        {
            li.setAdapter(new CustomAdap(this,names1,dra1));
        }
        li.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(pos==0) {
                    Intent intent = new Intent(view.getContext(), Event.class);
                    intent.putExtra("names", names[i]);
                    intent.putExtra("images", dra[i]);
                    intent.putExtra("time", time[i]);
                    intent.putExtra("location", location[i]);
                    intent.putExtra("description", descp[i]);
                    startActivity(intent);
                }
                else if(pos==1)
                {
                    Intent intent = new Intent(view.getContext(), Event.class);
                    intent.putExtra("names", names1[i]);
                    intent.putExtra("images", dra1[i]);
                    intent.putExtra("time", time1[i]);
                    intent.putExtra("location", location1[i]);
                    intent.putExtra("description", descp1[i]);
                    startActivity(intent);
                }
            }
        });
    }
}
