package com.noirdev.austin.the3dease;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class PopularActivity extends Activity {
    ListView listView;
    FloatingActionButton fab;
    public void onCreate( Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);


        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.listView4);
        fab = (FloatingActionButton) findViewById(R.id.fab_2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(PopularActivity.this,UploadActivity.class);
                startActivity(myIntent);
            }
        });
        // Defined Array values to show in ListView
        Item item_data[] = new Item[]{
                new Item("My girlfriend","Sharing is caring..","",""),
                new Item("Psy sculpture", "just grab i","",""),
                new Item("Turtle Egg", "The legendary ","",""),
                new Item("My foetus", "my first kid at 7th month","",""),
                new Item("My dad's face","for memeories","","")

        };

        CustomAdapter adapter = new CustomAdapter(this, R.layout.layout_list_image,item_data);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


            }

        });

    }

}
