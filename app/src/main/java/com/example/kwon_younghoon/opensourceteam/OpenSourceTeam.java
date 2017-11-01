package com.example.kwon_younghoon.opensourceteam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class OpenSourceTeam extends AppCompatActivity {
    GridView gridView1;
    GridView gridView2;
    GridView gridView3;
    GridView gridView4;
    GridView gridView5;
    ArrayList<CardData> cardArray1 = new ArrayList<CardData>();
    ArrayList<CardData> cardArray2 = new ArrayList<CardData>();
    ArrayList<CardData> cardArray3 = new ArrayList<CardData>();
    ArrayList<CardData> cardArray4 = new ArrayList<CardData>();
    ArrayList<CardData> cardArray5 = new ArrayList<CardData>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_source_team);
        init_1();
        init_2();
        init_3();
        init_4();
        init_5();

        Button button1 = (Button)findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridView1.setVisibility(View.VISIBLE);
                gridView2.setVisibility(View.GONE);
                gridView3.setVisibility(View.GONE);
                gridView4.setVisibility(View.GONE);
                gridView5.setVisibility(View.GONE);
            }
        });
        Button button2 = (Button)findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridView1.setVisibility(View.GONE);
                gridView2.setVisibility(View.VISIBLE);
                gridView3.setVisibility(View.GONE);
                gridView4.setVisibility(View.GONE);
                gridView5.setVisibility(View.GONE);
            }
        });
        Button button3 = (Button)findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridView1.setVisibility(View.GONE);
                gridView2.setVisibility(View.GONE);
                gridView3.setVisibility(View.VISIBLE);
                gridView4.setVisibility(View.GONE);
                gridView5.setVisibility(View.GONE);
            }
        });
        Button button4 = (Button)findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridView1.setVisibility(View.GONE);
                gridView2.setVisibility(View.GONE);
                gridView3.setVisibility(View.GONE);
                gridView4.setVisibility(View.VISIBLE);
                gridView5.setVisibility(View.GONE);
            }
        });
        Button button5 = (Button)findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridView1.setVisibility(View.GONE);
                gridView2.setVisibility(View.GONE);
                gridView3.setVisibility(View.GONE);
                gridView4.setVisibility(View.GONE);
                gridView5.setVisibility(View.VISIBLE);
            }
        });
        Button closebutton = (Button)findViewById(R.id.gridclose);
        closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridView1.setVisibility(View.GONE);
                gridView2.setVisibility(View.GONE);
                gridView3.setVisibility(View.GONE);
                gridView4.setVisibility(View.GONE);
                gridView5.setVisibility(View.GONE);
            }
        });


    }
    void init_1(){
        gridView1 = (GridView)findViewById(R.id.card1);
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        adapter = new Adapter(cardArray1, this);
        gridView1.setAdapter(adapter);
    }

    void init_2(){
        gridView2 = (GridView)findViewById(R.id.card2);
        cardArray2.add(new CardData(R.drawable.ic_action_search,"t"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"t"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"t"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"trtr"));
        adapter = new Adapter(cardArray2, this);
        gridView2.setAdapter(adapter);
    }

    void init_3(){
        gridView3 = (GridView)findViewById(R.id.card3);
        cardArray3.add(new CardData(R.drawable.ic_action_search,"3"));
        cardArray3.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray3.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray3.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray3.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray3.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray3.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray3.add(new CardData(R.drawable.ic_action_search,"trtr"));
        adapter = new Adapter(cardArray3, this);
        gridView3.setAdapter(adapter);
    }

    void init_4(){
        gridView4 = (GridView)findViewById(R.id.card4);
        cardArray4.add(new CardData(R.drawable.ic_action_search,"4"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        adapter = new Adapter(cardArray4, this);
        gridView4.setAdapter(adapter);
    }

    void init_5(){
        gridView5 = (GridView)findViewById(R.id.card5);
        cardArray5.add(new CardData(R.drawable.ic_action_search,"5"));
        cardArray5.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray5.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray5.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray5.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray5.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray5.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray5.add(new CardData(R.drawable.ic_action_search,"trtr"));
        adapter = new Adapter(cardArray5, this);
        gridView5.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.show_all:
                Toast.makeText(this, "ff", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.show_image:
                Toast.makeText(this, "ff", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.show_txt:
                Toast.makeText(this, "ff", Toast.LENGTH_SHORT).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
