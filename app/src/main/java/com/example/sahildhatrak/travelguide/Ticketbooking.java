package com.example.sahildhatrak.travelguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Ticketbooking extends AppCompatActivity {


    AutoCompleteTextView fromStation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticketbooking);

    }
    public void normalbooking(View view){

        Intent normal = new Intent(Ticketbooking.this,NormalBooking.class);
        normal.setFlags((normal.getFlags()) | Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(normal);

    }
}
