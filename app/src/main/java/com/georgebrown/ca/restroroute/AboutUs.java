package com.georgebrown.ca.restroroute;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_layout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemAddResturant:
                startActivity(new Intent(this, com.georgebrown.ca.restroroute.Welcome.class));
                finish();
                return true;

            case R.id.itemResturantList:
                startActivity(new Intent(this, ResturantList.class));
                return true;

            case R.id.itemAboutUs:
                startActivity(new Intent(this, AboutUs.class));
                return true;

            case R.id.itemSplashScreen:
                startActivity(new Intent(this, com.georgebrown.ca.restroroute.SplashScreen.class));
                return true;



            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
