package com.example.sahildhatrak.travelguide;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import static com.example.sahildhatrak.travelguide.Constants.*;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {


    private EditText inputEmail, inputPassword;
    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private ProgressBar progressBar;
    private Button  SignIn;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        auth = FirebaseAuth.getInstance();

       /* if (auth.getCurrentUser() != null) {
            startActivity(new Intent(MainActivity.this, navigation_actual.class));
            finish();
        }*/
        setContentView(R.layout.activity_main);

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
*/
        inputEmail = (EditText) findViewById(R.id.textView);
        inputPassword = (EditText) findViewById(R.id.textView2);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);


        SignIn = (Button) findViewById(R.id.buttonSignIn);

        auth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
/*
                    toastMessage("Successfully signed in with: " + user.getEmail());
*/
                } else {
                    // User is signed out
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                    toastMessage("Successfully signed out.");
                }
                // ...
            }
        };


        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String email = inputEmail.getText().toString();
                final String password = inputPassword.getText().toString();
                emailID = email;
                Log.d("Email ID Set to:", emailID);

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);

                //authenticate user
                auth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                // If sign in fails, display a message to the user. If sign in succeeds
                                // the auth state listener will be notified and logic to handle the
                                // signed in user can be handled in the listener.
                                progressBar.setVisibility(View.GONE);
                                if (!task.isSuccessful()) {
                                    // there was an error
                                if (password.length() < 6) {
                                    inputPassword.setError(getString(R.string.minimum_password));
                                } else {
                                    Toast.makeText(MainActivity.this, getString(R.string.auth_failed), Toast.LENGTH_LONG).show();
                                }
                            } else {
                                    //String email = inputEmail.getText().toString().trim();
                                    //Constants.emailID = String.valueOf(inputEmail.getText());
                                    Intent intent = new Intent(MainActivity.this, navigation_actual.class);
                                    startActivity(intent);
                                    finish();
                                }
                            }
                        });
            }
        });


    }
    /*mCallbackManager = CallbackManager.Factory.create();
    LoginButton loginButton = findViewById(R.id.buttonFacebookLogin);
loginButton.setReadPermissions("email", "public_profile");
loginButton.registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {
        @Override
        public void onSuccess(LoginResult loginResult) {
            Log.d(TAG, "facebook:onSuccess:" + loginResult);
            handleFacebookAccessToken(loginResult.getAccessToken());
        }

        @Override
        public void onCancel() {
            Log.d(TAG, "facebook:onCancel");
            // ...
        }

        @Override
        public void onError(FacebookException error) {
            Log.d(TAG, "facebook:onError", error);
            // ...
        }
    });
    // ...
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Pass the activity result back to the Facebook SDK
        mCallbackManager.onActivityResult(requestCode, resultCode, data);
    }*/
    public void register(View view){
        Intent intent = new Intent(MainActivity.this,google.class);
        startActivity(intent);

    }
    private void toastMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}












