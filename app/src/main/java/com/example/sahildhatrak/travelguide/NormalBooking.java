package com.example.sahildhatrak.travelguide;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class NormalBooking extends AppCompatActivity implements View.OnClickListener{
    private String[] stations = {"Churchgate", "Marine Lines", "Charni Road", "Grant Road", "Mumbai Central", "Mahalakshmi", "Lower Parel", "Prabhadevi", "Dadar", "Matunga Road", "Mahim", "Bandra", "Khar Road", "Santacruz", "Vile Parle", "Jogeshwari", "Ram Mandir", "Goregaon", "Malad", "Kandivali", "Borivali", "Dahisar", "Mira Road", "Bhayander", "Naigaon", "Vasai Road", "Nalla Sopara", "Virar", "Panvel", "Khandeshwar", "Mansarovar", "Kharghar", "Belapur CBD", "Seawoods", "Nerul", "Juinagar", "Sanpada", "Vashi", "Mankhurd", "Govandi", "Chembur", "Tilaknagar", "Kurla", "Chunabhatti", "GTB Nagar", "Vadala Road", "Sewri", "Kings Circle", "CSMT", "Andheri", "Jogeshwari", "Ram Mandir","Goregaon","Masjid","Sandhurst Road","Dockyard Road","Reay Road","Cotton Green"};
private String[] Class = {" First Class", " Second Class"};
    private ProgressDialog progressDialog;
    Button button;

    private FirebaseDatabase firebasedata;
    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private DatabaseReference myref;
    private FirebaseUser inputEmail;
    String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_booking);

        final AutoCompleteTextView fromstation = (AutoCompleteTextView) findViewById(R.id.fromStation);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.auto_layout, stations);
        fromstation.setThreshold(1);
        fromstation.setAdapter(adapter);

        final AutoCompleteTextView tostation = (AutoCompleteTextView) findViewById(R.id.toStation);
        ArrayAdapter adapter2 = new ArrayAdapter<String>(this, R.layout.auto_layout, stations);
        tostation.setThreshold(1);
        tostation.setAdapter(adapter2);

        Spinner myspinner = (Spinner) findViewById(R.id.spinnerclass);
        ArrayAdapter adapter3 = new ArrayAdapter<String>(this, R.layout.spinner_item, Class);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(adapter3);

        button = (Button) findViewById(R.id.button3);
        progressDialog = new ProgressDialog(this);
        button.setOnClickListener(this);
        auth = FirebaseAuth.getInstance();
        firebasedata = FirebaseDatabase.getInstance();
        myref = firebasedata.getReference();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = fromstation.getText().toString();
                String number = tostation.getText().toString();

                if(!name.equals("")){

                    FirebaseUser user = auth.getCurrentUser();
                    String userID = user.getUid();
                    myref.child(userID).child("Ticket").child("From").setValue(name);
                    fromstation.setText("");

                }
                if(!number.equals("")){

                    FirebaseUser user = auth.getCurrentUser();
                    String userID = user.getUid();
                    myref.child(userID).child("Ticket").child("To").setValue(number);
                    tostation.setText("");
                }
                Intent intent = new Intent(NormalBooking.this,TicketReceipt.class);
                startActivity(intent);
            }
        });



    }
    public void bookticket(){

        progressDialog.setMessage("Booking Ticket Please Wait...");
        progressDialog.show();


        Toast.makeText(NormalBooking.this,"Ticket Booked",Toast.LENGTH_SHORT).show();
        Intent confirmticket = new Intent(NormalBooking.this, b.class);
        startActivity(confirmticket);
        progressDialog.dismiss();

    }

    @Override
    public void onClick(View v) {
        bookticket();
    }
}
