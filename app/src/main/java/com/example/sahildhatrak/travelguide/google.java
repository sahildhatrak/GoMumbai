package com.example.sahildhatrak.travelguide;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.example.sahildhatrak.travelguide.Constants.*;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class google extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextName;
    String z;
    private FirebaseDatabase firebasedata;
    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private DatabaseReference myref;
    private FirebaseUser inputEmail;

    private Button buttonSignUp;

    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    String TAG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        firebaseAuth = FirebaseAuth.getInstance();

        editTextEmail = (EditText) findViewById(R.id.textView);
        editTextPassword = (EditText) findViewById(R.id.textView2);
        editTextName = (EditText) findViewById(R.id.textView7);

        /*FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference  = database.getReference();*/


        buttonSignUp = (Button)findViewById(R.id.button);

        progressDialog = new ProgressDialog(this);
       buttonSignUp.setOnClickListener(this);

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

    }
    public void registerUser(){


        final String email = editTextEmail.getText().toString().trim();
        String password  = editTextPassword.getText().toString().trim();
        Constants.emailID = String.valueOf(editTextEmail.getText());



        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Please enter email",Toast.LENGTH_LONG).show();
            return;
        }

        if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter password",Toast.LENGTH_LONG).show();
            return;
        }



        progressDialog.setMessage("Registering Please Wait...");
        progressDialog.show();


        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){

                            Toast.makeText(google.this,"Successfully registered",Toast.LENGTH_LONG).show();
                            String name = editTextName.getText().toString();

                            if(!name.equals("")){

                                FirebaseUser user = auth.getCurrentUser();
                                String userID = user.getUid();
                                myref.child(userID).child("Users").child("Name").setValue(name);
                                editTextName.setText("");

                            }
                            if(!email.equals("")){

                                FirebaseUser user = auth.getCurrentUser();
                                String userID = user.getUid();
                                myref.child(userID).child("Users").child("Email ID").setValue(email);
                                editTextEmail.setText("");

                            }
                            z = "0";
                            Intent intent = new Intent(google.this,navigation_actual.class);
                            intent.putExtra("value",z);
                            startActivity(intent);

                        }else{

                            Toast.makeText(google.this,"Registration Error",Toast.LENGTH_LONG).show();
                        }
                        progressDialog.dismiss();
                    }
                });


    }

    @Override
    public void onClick(View view) {
        registerUser();

}
    }





