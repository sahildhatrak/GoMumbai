package com.example.sahildhatrak.travelguide;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import static com.example.sahildhatrak.travelguide.Constants.emailID;

public class navigation_actual extends AppCompatActivity implements View.OnClickListener {
    private DrawerLayout dl;
    private ActionBarDrawerToggle toggle;
    private DatabaseReference myref;
    private FirebaseAuth auth;
    private FirebaseDatabase database;
    String z;
    private ViewPager viewPager;
    private SlideAdapter myadapter;

Button b1;
    private CardView local,metro,bus,monorail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        setContentView(R.layout.activity_navigation_actual);
        /*if(extras.getString("value") != null)
        {

            z = extras.getString("value");

        }*/
        dl = (DrawerLayout)findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this, dl, R.string.open, R.string.close);
        dl.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        local = (CardView) findViewById(R.id.localcard);
        metro = (CardView) findViewById(R.id.metrocard);
        bus = (CardView) findViewById(R.id.buscard);
        monorail = (CardView) findViewById(R.id.monocard);


        local.setOnClickListener(this);


        metro.setOnClickListener(this);


        bus.setOnClickListener(this);


        monorail.setOnClickListener(this);



        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View headerView = navigationView.getHeaderView(0);
        TextView navEmail = (TextView) headerView.findViewById(R.id.username_id);
        final TextView navName = (TextView) headerView.findViewById(R.id.name_id);
        navEmail.setText(emailID);


        auth = FirebaseAuth.getInstance();
        FirebaseUser user = auth.getCurrentUser();
        final String userID = user.getUid();
        myref = FirebaseDatabase.getInstance().getReference();
        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String name = dataSnapshot.child(userID).child("Users").child("Name").getValue(String.class);
                String number = dataSnapshot.child(userID).child("Users").child("Number").getValue(String.class);

                navName.setText(name);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id) {
                    case R.id.profile:
                        Intent profile = new Intent(navigation_actual.this,Profile.class);
                        profile.setFlags((profile.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY));
                        startActivity(profile);
                        break;
                    case R.id.bookings:
                        Intent booking = new Intent(navigation_actual.this,TicketReceipt.class);
                        booking.setFlags((booking.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY));
                        startActivity(booking);
                        break;
                    case R.id.contact:
                        Intent contact = new Intent(navigation_actual.this,Contact.class);
                        contact.setFlags((contact.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY));
                        startActivity(contact);
                        break;
                    case R.id.settings:
                        Intent feedback = new Intent(navigation_actual.this,Feedback.class);
                        feedback.setFlags((feedback.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY));
                        startActivity(feedback);
                        break;
                    case R.id.logout:
                        FirebaseAuth.getInstance().signOut();
                        Intent logout = new Intent(navigation_actual.this,MainActivity.class);
                        logout.setFlags((logout.getFlags() | Intent.FLAG_ACTIVITY_CLEAR_TOP));
                        startActivity(logout);
                        Toast.makeText(navigation_actual.this,"Successfully logged out", Toast.LENGTH_SHORT).show();
                        finish();
                        break;
                }
                return false;
            }
        });


    }

    @Override
    public void onClick(View v) {
        String x;
        Intent l;
        Intent m,busintent,monointent;
        switch (v.getId()) {
            case R.id.localcard:
                x = "0";
                l = new Intent(this, b.class);
                startActivity(l);
                break;
            case R.id.metrocard:
                x = "1";
                m = new Intent(this, MetroTowards.class);
                startActivity(m);
                break;
            case R.id.buscard:
                x = "2";
                busintent = new Intent(this, Bus.class);
                startActivity(busintent);
                break;
            case R.id.monocard:
                x = "3";
                monointent = new Intent(this, Monorail.class);
                startActivity(monointent);
                break;
            default:
                break;

        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
        }

    public void xyz (View V)
    {
        Intent intent2 = new Intent(navigation_actual.this,b.class);
        startActivity(intent2);

    }
}
