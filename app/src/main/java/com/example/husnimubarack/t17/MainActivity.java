package com.example.husnimubarack.t17;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mToolbar;
    private ArrayList<DrawerListItem> mDrawerItems= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.main_action_bar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("tathva '17");
        getSupportActionBar().setIcon(R.drawable.tathva_man);

        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man,"Events"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man,"Workshops"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man,"Lectures"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man,"Exhibitions"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man,"Proshows"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man,"Adizya"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man,"Wheels"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man,"Blitzkrieg"));


        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);

        mToggle =new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
