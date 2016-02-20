package com.noirdev.austin.the3dease;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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

public class UnresolvedActivity extends Activity {


        ListView listView;
    public void onCreate( Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unresolved);


        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.listView3);

        // Defined Array values to show in ListView
        Item item_data[] = new Item[]{
                new Item("Phone Case i8","There is no such case yet and I need it","",""),
                new Item("Laptop Casing- Samsung", "My casing broken and I desperatel need 1","",""),
                new Item("Nike Bottle N362 Cap", "I broke and I need someone who have it to print it ","",""),
                new Item("MIT Logo","I do not know how to convert the jpeg file","",""),
                new Item("Aircond spare part", "model : York 231","",""),
                new Item("Taeyeon face", "needed for Fan collection","","")

        };

        CustomAdapter adapter = new CustomAdapter(this, R.layout.layout_list_image,item_data);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("http://www.stackoverflow.com/"));
                startActivity(viewIntent);
            }

        });

    }

    }

