package com.tce.naveen.quest;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ListView li;
    public Context con;
    public ArrayList al;
    public int pos;
    public String[] names={"Essay Writing","Elocution","Follow the Flow","Build Nest","Creative Poetry","Ad-Zap","Quiz","Tell a Tale"};
    public String[] time={"11:00 to 11:40","11:45 to 12:25","11:30 to 12:25 ","9:30 to 10:15","11:00 to 11:40","11:45 to 12:25","11:00 to 11:30","9:30 to 10:15"};
    public String[] location={"A9 Hall","b6 Hall","A10 Hall","B5 Hall","B1 Hall","A8 Hall","A7 Hall","B11(B12) Hall"};
    public String[] descp={"A topic will be given and the participant is expected to write a story not exceeding 5 sentences"
            ,"If your speech could mesmerize us then the stage is all yours."
            ,"Create a story coherently."
            ,"Write a story from the picture provided as hints."
            ,"You could create a poem that could touch our soul."
            ,"Exhibit your talent in marketing. Market the products and grab prizes"
            ,"50 questions about anything and everything about the history of vaigai"
            ,"Narrate a story with a moral"};
    public int[] dra={R.drawable.english,R.drawable.english,R.drawable.english,R.drawable.english,R.drawable.english,R.drawable.english,R.drawable.english,R.drawable.english};
    public String[] conname={"YUVAN SHANKAR KARTHICK"};
    public String[] conno={"8973550994"};

    public String[] names1={"Urakka Solvom.","katturai kovai","kavi eluthu","padam parthu kathai eluthu","Kathai solla va","Thirukural","Pechu potti","Muranbada yosi","Vina vidai","oli oli bathilali"};
    public String[] time1={"11:30 to 12:25","11:00 to 11:40","11:00 to 11:40","9:30 to 10:15","9:30 to 10:15","10:15 to 11:00","10:15 to 11:00","11:45 to 12:25","11:00 to 11:30","9:30 to 10:15"};
    public String[] location1={"A11 Hall","A8 Hall","A10 Hall","B6 Hall","B9(B10) Hall","B5 Hall","B7 Hall","A9 Hall","A6 Hall","B7 Hall"};
    public String[] descp1={"If your speech could mesmerize us then the stage is all yours."
            ,"If your words could inscrive message and provoke thoughts in our minds of the people. Then you are the next winner."
            ,"The greatest poem is one that could flow like a river and touch readers soul...making them awe and beauty and simplicity of it. can you be the poet?"
            ,"Write a creative story from the picture provided as hints."
            ,"Recite a story or poem in tamil."
            ,"Be sound enough to find using starting and ending words, meaning to kural and vide versa."
            ,"If your speech could mesmerize us then the stage is all yours."
            ,"Talk and against in favour of a given topic."
            ,"50 questions about anything and everything in madurai."
            ,"Testing your vocabulary and listening ability."};
    public int[] dra1={R.drawable.tamilessay,R.drawable.tamilessay,R.drawable.tamilessay,R.drawable.tamilessay,R.drawable.tamilessay,R.drawable.tamilessay,R.drawable.tamilessay,R.drawable.tamilessay,R.drawable.tamilessay,R.drawable.tamilessay};
    public String[] conname1={"DHUVARAHA"};
    public String[] conno1={"8098807286"};


    public String[] names2={"Photography","Short film"};
    public String[] time2={"Online event","Online event"};
    public String[] location2={"Online event","Online event"};
    public String[] descp2={"Let the serene beauty you capture in the lens, capture the heart."
            ,"Are you a high school student who loves to create short film? this is the right place. The competition encourages students to explore the medium of film and use multimedia formats for awareness."};
    public int[] dra2={R.drawable.online,R.drawable.online};
    public String[] conname2={"ASHWIN KUMAR"};
    public String[] conno2={"9444173280"};


    public String[] names3={"Solo dance","Group dance","Foot loose"};
    public String[] time3={"11:00 to 4:00","11:00 to 4:00","11:00 to 4:00"};
    public String[] location3={"Open auditorium","Open auditorium","Open auditorium"};
    public String[] descp3={"Bring out the PRABHUDEVA in you","Got a gang, inspired by dance.Show your passion. The stage is yours. Stun the audience","Dance for the song we put"};
    public int[] dra3={R.drawable.dance,R.drawable.dance,R.drawable.dance};
    public String[] conname3={"JEYASURIYA"};
    public String[] conno3={"8012722326"};


    public String[] names4={"Mime","Variety Show","MonoActing - Navarasam"};
    public String[] time4={"11:30 to 12:30","11:00 to 1:00","12:30 to 1:10"};
    public String[] location4={"MD3 Hall","KM floor","A8 Hall"};
    public String[] descp4={"The act should not contain any dialogues or lip sync.It should be related to the topic and it should contain social message."
            ,"You got a gang that is multitalented? Express the talents in you and entertain the crowd."
            ,"Are you that actor who could grab the attention of all those audience with your acting skills? set the stage on fire."};
    public int[] dra4={R.drawable.dc,R.drawable.dc,R.drawable.dc};
    public String[] conname4={"KARTHEESWARAN"};
    public String[] conno4={"7010124382"};


    public String[] names5={"Poster making","Crayon rubbing","Make a model - vaigai","Paint without brush","varaipadam variga","Soap carving","Cartoon/caricature drawing","Fancy dress","Face painting","Rangoli","Poothoduthal","SandArt"};
    public String[] time5={"12:30 to 1:10","10:15 to 11:00","12:30 to 1:10 ","11:00 to 11:40","11:00 to 11:40","12:30 to 1:10","12:30 to 1:10","10:15 to 11:00","12:30 to 1:10","9:30 to 10:30","12:30 to 1:10","11:30 to 12:25"};
    public String[] location5={"M3 and M4 Hall","B9(B10) Hall","KM auditorium.","B9 Hall","B10 Hall","A12 Hall","A7 Hall","IT department Lobby","A6 Hall","SD corridor","B12 Hall","IT Department Entrance"};
    public String[] descp5={"Expose the designer in you"
            ,"Join the dots and colour the picture"
            ,"Present a model of vaigai and explain"
            ,"can use anything other than brush to bring out the artistic talent in you!"
            ,"Convey the theme in the form of a drawing"
            ,"Carve the sculpture in soap"
            ,"Be an editorial combining artistic skill,hyperbole in order to question the authority"
            ,"Dress up which encourages tamil audience and culture."
            ,"Can you paint and convey the messages on the face?"
            ,"Show how creative you are"
            ,"Expose the creativity in you into beautiful flowers"
            ,"portray your art skills in sand"};
    public int[] dra5={R.drawable.drawing,R.drawable.drawing,R.drawable.drawing,R.drawable.drawing,R.drawable.drawing,R.drawable.drawing,R.drawable.drawing,R.drawable.drawing,R.drawable.drawing,R.drawable.drawing,R.drawable.drawing,R.drawable.drawing};
    public String[] conname5={"YAMINI"};
    public String[] conno5={"9600412707"};



    public String[] names6={"Solosinging","Concert"};
    public String[] time6={"11:00 to 1:00","11:00 to 1:00"};
    public String[] location6={"M5 Hall","MD1 Hall"};
    public String[] descp6={"Expose the singer in you."
            ,"Bring out the lyricist,musician,music director and the singer in you.Compose an own song with own lyrics and music."};
    public int[] dra6={R.drawable.song,R.drawable.song};
    public String[] conname6={"NITHISH"};
    public String[] conno6={"9715971025"};


    public String[] names7={"Fun Events","Fireless cooking","Yoga","60 nodiyil thiran kaatu","Mr and Ms QUEST"};
    public String[] time7={"11:30 to 12:25","12:30 to 1:10","11:30 to 12:25","12:30 to 1:10","3:00 to 4:00"};
    public String[] location7={"MCA Block","B10 Hall","MD2 Hall","B9 Hall","KS auditorium"};
    public String[] descp7={"Various games will be conducted to enthuse the kids."
            ,"Can your cooking tickle the taste buds and flavour favours your chance of winning?"
            ,"Showcase your yoga skills."
            ,"Impress the judge in 60 seconds"
            ,"Tests yout management, event handling,talents and all your skills! Become the star of the show."};
    public int[] dra7={R.drawable.skill,R.drawable.skill,R.drawable.skill,R.drawable.skill,R.drawable.skill};
    public String[] conname7={"VAIRAM SUJITHA"};
    public String[] conno7={"8940124879"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
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
        else if(pos==2)
        {
            li.setAdapter(new CustomAdap(this,names2,dra2));
        }
        else if(pos==3)
        {
            li.setAdapter(new CustomAdap(this,names3,dra3));
        }
        else if(pos==4)
        {
            li.setAdapter(new CustomAdap(this,names4,dra4));
        }
        else if(pos==5)
        {
            li.setAdapter(new CustomAdap(this,names5,dra5));
        }
        else if(pos==6)
        {
            li.setAdapter(new CustomAdap(this,names6,dra6));
        }

        else if(pos==7)
        {
            li.setAdapter(new CustomAdap(this,names7,dra7));
        }
        li.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(pos==0) {
                    Intent intent1 = new Intent(MainActivity.this, Event.class);
                    Bundle extras = new Bundle();
                    extras.putString("names", names[i]);
                    extras.putInt("images", dra[i]);
                    extras.putString("time", time[i]);
                    extras.putString("location", location[i]);
                    extras.putString("description", descp[i]);
                    extras.putString("contact name",conname[0]);
                    extras.putString("contact no",conno[0]);
                    intent1.putExtras(extras);
                    startActivity(intent1);
                }
                else if(pos==1)
                {
                    Intent intent1 = new Intent(MainActivity.this, Event.class);
                    Bundle extras = new Bundle();
                    extras.putString("names", names1[i]);
                    extras.putInt("images", dra1[i]);
                    extras.putString("time", time1[i]);
                    extras.putString("location", location1[i]);
                    extras.putString("description", descp1[i]);
                    extras.putString("contact name",conname1[0]);
                    extras.putString("contact no",conno1[0]);
                    intent1.putExtras(extras);
                    startActivity(intent1);
                }
                else if(pos==2)
                {
                    Intent intent1 = new Intent(MainActivity.this, Event.class);
                    Bundle extras = new Bundle();
                    extras.putString("names", names2[i]);
                    extras.putInt("images", dra2[i]);
                    extras.putString("time", time2[i]);
                    extras.putString("location", location2[i]);
                    extras.putString("description", descp2[i]);
                    extras.putString("contact name",conname2[0]);
                    extras.putString("contact no",conno2[0]);
                    intent1.putExtras(extras);
                    startActivity(intent1);
                }
                else if(pos==3)
                {
                    Intent intent1 = new Intent(MainActivity.this, Event.class);
                    Bundle extras = new Bundle();
                    extras.putString("names", names3[i]);
                    extras.putInt("images", dra3[i]);
                    extras.putString("time", time3[i]);
                    extras.putString("location", location3[i]);
                    extras.putString("description", descp3[i]);
                    extras.putString("contact name",conname3[0]);
                    extras.putString("contact no",conno3[0]);
                    intent1.putExtras(extras);
                    startActivity(intent1);
                }
                else if(pos==4)
                {
                    Intent intent1 = new Intent(MainActivity.this, Event.class);
                    Bundle extras = new Bundle();
                    extras.putString("names", names4[i]);
                    extras.putInt("images", dra4[i]);
                    extras.putString("time", time4[i]);
                    extras.putString("location", location4[i]);
                    extras.putString("description", descp4[i]);
                    extras.putString("contact name",conname4[0]);
                    extras.putString("contact no",conno4[0]);
                    intent1.putExtras(extras);
                    startActivity(intent1);
                }
                else if(pos==5)
                {
                    Intent intent1 = new Intent(MainActivity.this, Event.class);
                    Bundle extras = new Bundle();
                    extras.putString("names", names5[i]);
                    extras.putInt("images", dra5[i]);
                    extras.putString("time", time5[i]);
                    extras.putString("location", location5[i]);
                    extras.putString("description", descp5[i]);
                    extras.putString("contact name",conname5[0]);
                    extras.putString("contact no",conno5[0]);
                    intent1.putExtras(extras);
                    startActivity(intent1);
                }
                else if(pos==6)
                {
                    Intent intent1 = new Intent(MainActivity.this, Event.class);
                    Bundle extras = new Bundle();
                    extras.putString("names", names6[i]);
                    extras.putInt("images", dra6[i]);
                    extras.putString("time", time6[i]);
                    extras.putString("location", location6[i]);
                    extras.putString("description", descp6[i]);
                    extras.putString("contact name",conname6[0]);
                    extras.putString("contact no",conno6[0]);
                    intent1.putExtras(extras);
                    startActivity(intent1);
                }
                else if(pos==7)
                {
                    Intent intent1 = new Intent(MainActivity.this, Event.class);
                    Bundle extras = new Bundle();
                    extras.putString("names", names7[i]);
                    extras.putInt("images", dra7[i]);
                    extras.putString("time", time7[i]);
                    extras.putString("location", location7[i]);
                    extras.putString("description", descp7[i]);
                    extras.putString("contact name",conname7[0]);
                    extras.putString("contact no",conno7[0]);
                    intent1.putExtras(extras);
                    startActivity(intent1);
                }

            }
        });
    }
  /*  @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/
}
