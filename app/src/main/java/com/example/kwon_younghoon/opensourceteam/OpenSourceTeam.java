package com.example.kwon_younghoon.opensourceteam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class OpenSourceTeam extends AppCompatActivity {
    GridView gridView;
    ArrayList<CardData> cardArray= new ArrayList<CardData>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_source_team);
        init();
    }
    void init(){
        gridView = (GridView)findViewById(R.id.cardnews);
        cardArray.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray.add(new CardData(R.drawable.ic_action_search,"trtr"));
        adapter = new Adapter(cardArray, this);
        gridView.setAdapter(adapter);
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
