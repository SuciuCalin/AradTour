package com.example.android.aradtour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    //ID for ButterKnife to find and automatically cast the corresponding view in the layout
    @BindView(R.id.pager)
    ViewPager mViewPager;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;
    @BindView(R.id.nav_view)
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        CustomPagerAdapter mCustomPagerAdapter = new CustomPagerAdapter(this);
        mViewPager.setAdapter(mCustomPagerAdapter);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
    }

    //set the activities to be opened from the navigation drawer
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        Intent intent;
        switch (item.getItemId()) {
            case R.id.nav_monuments:
                intent = new Intent(MainActivity.this, MonumentsActivity.class);
                break;
            case R.id.nav_museums:
                intent = new Intent(MainActivity.this, MuseumsActivity.class);
                break;
            case R.id.nav_restaurants:
                intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                break;
            case R.id.nav_hotels:
                intent = new Intent(MainActivity.this, HotelsActivity.class);
                break;
            case R.id.nav_cityGuide:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getString(R.string.cityGuideWeb)));
                break;
            case R.id.nav_carTrouble:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getString(R.string.carTroubleWeb)));
                break;
            default:
                intent = new Intent(MainActivity.this, MainActivity.class);
                break;
        }

        startActivity(intent);

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
