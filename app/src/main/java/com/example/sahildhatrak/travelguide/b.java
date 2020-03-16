package com.example.sahildhatrak.travelguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;

public class b extends AppCompatActivity implements View.OnClickListener{
private CardView western,central,harbour,transharbour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        western = (CardView) findViewById(R.id.wescard);
        central = (CardView) findViewById(R.id.cencard);
        harbour = (CardView) findViewById(R.id.harcard);
        transharbour = (CardView) findViewById(R.id.transcard);


        western.setOnClickListener(this);


        central.setOnClickListener(this);


        harbour.setOnClickListener(this);


        transharbour.setOnClickListener(this);



    }
    @Override
    public void onClick(View v){
String x;
Intent w;
Intent h;
        switch (v.getId()) {
            case R.id.wescard: x="0";w = new Intent(this,western.class);w.putExtra("value_to_be_passed", x);startActivity(w); break;
            case R.id.harcard: x="1";h = new Intent(this,western.class);h.putExtra("value_to_be_passed",x);startActivity(h);break;
            case R.id.cencard: x="2";h = new Intent(this,western.class);h.putExtra("value_to_be_passed",x);startActivity(h);break;
            case R.id.transcard: x="3";h = new Intent(this,western.class);h.putExtra("value_to_be_passed",x);startActivity(h);break;
            default:break;

        }

    }
    public void ticket(View view){
        Intent bookTicket = new Intent(b.this,NormalBooking.class);
        startActivity(bookTicket);
    }

}
