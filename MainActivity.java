package com.words.english.english100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView ;
    private ArrayList<Post> finalPosts;
    private ArrayList<Post> posts;
    private AdapterPost adapterPost;
    private ArrayList<String>arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout relativeLayout;
        relativeLayout =(RelativeLayout)findViewById(R.id.relativelayout);
        switch (item.getItemId()){
            case R.id.id_search :
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                break;
            case R.id.id_share :
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
                break;
        }


        return true;
    }
}
