package com.example.sahildhatrak.travelguide;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.view.MenuItem;
import static com.example.sahildhatrak.travelguide.Constants.emailID;
import static com.example.sahildhatrak.travelguide.editInfo.*;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class Profile extends AppCompatActivity {

    private DatabaseReference myref;
    private FirebaseAuth auth;
    private FirebaseDatabase database;
    TextView myname,mynumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textView = (TextView)findViewById(R.id.email);
        textView.setText(emailID);
        auth = FirebaseAuth.getInstance();
        FirebaseUser user = auth.getCurrentUser();
        final String userID = user.getUid();
        myref = FirebaseDatabase.getInstance().getReference();
        myname = (TextView)findViewById(R.id.name);
        mynumber = (TextView)findViewById(R.id.number);
        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String name = dataSnapshot.child(userID).child("Users").child("Name").getValue(String.class);
                String number = dataSnapshot.child(userID).child("Users").child("Number").getValue(String.class);

                myname.setText(name);
                mynumber.setText(number);


                }





            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }


        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
    public void edit(View view){
        Intent edit = new Intent(Profile.this,editInfo.class);
        edit.setFlags((edit.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY));
        startActivity(edit);
    }
}
