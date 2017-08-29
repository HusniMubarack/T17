package com.example.husnimubarack.t17;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mToolbar;
    private ArrayList<DrawerListItem> mDrawerItems = new ArrayList<>();
    private ListView mDrawerList;
    private DrawerAdapter mDrawerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man, "Events"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man, "Workshops"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man, "Lectures"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man, "Exhibitions"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man, "Proshows"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man, "Adizya"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man, "Wheels"));
        mDrawerItems.add(new DrawerListItem(R.drawable.tathva_man, "Blitzkrieg"));

        mDrawerAdapter = new DrawerAdapter(this, mDrawerItems);
        mDrawerList = (ListView) findViewById(R.id.drawer_list);

        mDrawerList.setAdapter(mDrawerAdapter);

        mToolbar = (Toolbar) findViewById(R.id.main_action_bar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("tathva '17");
        getSupportActionBar().setIcon(R.drawable.tathva_man);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView navigationListView = (ListView) findViewById(R.id.drawer_list);

        navigationListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment = null;
                switch (position) {
                    case 0:
                        getSupportActionBar().setTitle("Events");
                        fragment = new EventsFrag();
                        break;
                    case 1:
                        fragment = new WorkshopsFrag();
                        getSupportActionBar().setTitle("Workshops");
                        break;
                    case 2:
                        fragment = new LecturesFrag();
                        getSupportActionBar().setTitle("Lectures");
                        break;
                    case 3:
                        fragment = new ExhibitionsFrag();
                        getSupportActionBar().setTitle("Exhibitions");
                        break;
                    case 4:
                        fragment = new ProshowsFrag();
                        getSupportActionBar().setTitle("Proshows");
                        break;
                    case 5:
                        fragment = new AdizyaFrag();
                        getSupportActionBar().setTitle("Adizya");
                        break;
                    case 6:
                        fragment = new WheelsFrag();
                        getSupportActionBar().setTitle("Wheels");
                        break;
                    case 7:
                        fragment = new BlitzkriegFrag();
                        getSupportActionBar().setTitle("Blitzkrieg");
                        break;
                }
                if (fragment != null) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.content_frame, fragment);
                    ft.commit();
                }

                mDrawerLayout.closeDrawer(GravityCompat.START);
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
