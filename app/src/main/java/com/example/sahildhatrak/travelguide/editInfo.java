package com.example.sahildhatrak.travelguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static com.example.sahildhatrak.travelguide.Constants.emailID;

import java.util.UUID;

public class editInfo extends AppCompatActivity {

    private EditText editName,editNumber;
    private Button update;
    private FirebaseDatabase firebasedata;
    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private DatabaseReference myref;
    private FirebaseUser inputEmail;
    String TAG;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_info);
        editName = (EditText)findViewById(R.id.editname);
        editNumber = (EditText)findViewById(R.id.editnumber);
        update = (Button)findViewById(R.id.buttonupdate);

        auth = FirebaseAuth.getInstance();
        firebasedata = FirebaseDatabase.getInstance();
        myref = firebasedata.getReference();


        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
/*
                String value = dataSnapshot.getValue(String.class);

*/
                Object value = dataSnapshot.getValue();
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
    update.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name = editName.getText().toString();
        String number = editNumber.getText().toString();

        if(!name.equals("")){

            FirebaseUser user = auth.getCurrentUser();
            String userID = user.getUid();
            myref.child(userID).child("Users").child("Name").setValue(name);
            editName.setText("");

            }
        if(!number.equals("")){

            FirebaseUser user = auth.getCurrentUser();
            String userID = user.getUid();
            myref.child(userID).child("Users").child("Number").setValue(number);
            editNumber.setText("");
            }
        Intent intent = new Intent(editInfo.this,Profile.class);
        startActivity(intent);
}
        });
    }
        private void toastMessage(String message){
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }
    }

