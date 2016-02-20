package com.noirdev.austin.the3dease;


import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityGroup;
import android.app.TabActivity;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TableLayout;

public class SurfActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surf);

        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("Unresolved");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Store");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("My Collection");

        tab1.setIndicator("Unresolved");
        tab1.setContent(new Intent(this, UnresolvedActivity.class));

        tab2.setIndicator("Store");
        tab2.setContent(new Intent(this, StoreActivity.class));

        tab3.setIndicator("My Collection");
        tab3.setContent(new Intent(this, PopularActivity.class));


        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);



    }


}
