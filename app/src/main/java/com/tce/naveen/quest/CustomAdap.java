package com.tce.naveen.quest;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Naveen on 24-01-2018.
 */
public class CustomAdap extends BaseAdapter {

    String nama[];
    int draw[];
    public Context con;
    public static LayoutInflater inflater=null;
    public CustomAdap(MainActivity ma,String names[],int dra[])
    {
        nama=names;
        con=ma;
        draw=dra;
        inflater=(LayoutInflater)con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return nama.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class Hold
    {
        TextView tv;
        ImageView iv;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        Hold h=new Hold();
        View v;
        v=inflater.inflate(R.layout.listview,null);
        h.tv=(TextView)v.findViewById(R.id.t1);
        h.iv=(ImageView)v.findViewById(R.id.img1);
        h.tv.setText(nama[i]);
        h.iv.setImageResource(draw[i]);
       /* v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(con,Event.class);
                i.putExtra("names",nama);
                i.putExtra("images",draw);

                //Toast.makeText(con,""+nama[i],Toast.LENGTH_LONG).show();
            }
        });*/
        return v;
    }
}
