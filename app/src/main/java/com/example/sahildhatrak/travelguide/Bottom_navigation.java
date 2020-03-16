package com.example.sahildhatrak.travelguide;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class Bottom_navigation extends SingleFragment {

    private TextView mTextMessage;

    @Override
    protected Fragment createFragment(){
        return new fragment().newInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(navlistener);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new fragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navlistener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment=null;
            switch (menuItem.getItemId()) {
                case R.id.schedules:
                    selectedFragment = new fragment();
                    Log.d("Selected Fragment: ", "schedules");
                    break;

                case R.id.booking:
                    selectedFragment = new fragment();
                    Log.d("Selected Fragment: ", "booking");
                    break;


            }
            Log.d("Trying to replace frag ", "sdfsf");
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
            Log.d("Finished trying ", "sdfssdff");
            return true;
        }
    };

}
