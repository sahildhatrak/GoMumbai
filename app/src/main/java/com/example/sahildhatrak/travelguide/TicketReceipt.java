package com.example.sahildhatrak.travelguide;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TicketReceipt extends AppCompatActivity {

    private DatabaseReference myref;
    private FirebaseAuth auth;
    private FirebaseDatabase database;
    TextView fromStation,toStation,myname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_receipt);

        String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        TextView mydate = (TextView)findViewById(R.id.textViewDate);
        mydate.setText(date);




        auth = FirebaseAuth.getInstance();
        FirebaseUser user = auth.getCurrentUser();
        final String userID = user.getUid();
        myref = FirebaseDatabase.getInstance().getReference();
        myname = (TextView)findViewById(R.id.textViewName);
        fromStation = (TextView)findViewById(R.id.fromstation);
        toStation = (TextView)findViewById(R.id.tostation);

        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String name = dataSnapshot.child(userID).child("Users").child("Name").getValue(String.class);

                String from = dataSnapshot.child(userID).child("Ticket").child("From").getValue(String.class);
                String to = dataSnapshot.child(userID).child("Ticket").child("To").getValue(String.class);



                myname.setText(name);

                fromStation.setText(from);
                toStation.setText(to);



            }





            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }


        });


    }
}
