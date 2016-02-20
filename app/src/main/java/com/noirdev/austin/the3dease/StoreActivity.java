package com.noirdev.austin.the3dease;

import android.app.Activity;
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

public class StoreActivity extends Activity {
    ListView listView;
    public void onCreate( Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        // Get ListView object from xml
        listView = (ListView)findViewById(R.id.listView2);

        // Defined Array values to show in ListView
        Item item_data[] = new Item[]{
                new Item("Phone Case i5","I have designed a phone case for i5","",""),
                new Item("Phone Case S4", "A design for Samsung case S4","",""),
                new Item("Water Bottle", "my own design ","",""),
                new Item("Powerpuff Girl Collection","Imma fan of Powerpuff girl!!","",""),
                new Item("John Cena Sculpture", "My favourite hero","",""),
                new Item("Dota Heroes Collection", "Dota fan collection ","",""),
                new Item("Spareparts","in case I lose it","",""),
                new Item("My girlfriend's face", "Sharing is caring","",""),
                new Item("The Cup", "I saw it in a coffeeshop yesterday ","",""),
                new Item("Turtle Egg?","The legendary egg","",""),
                new Item("Casing for rare phones", "Open for share","",""),

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
