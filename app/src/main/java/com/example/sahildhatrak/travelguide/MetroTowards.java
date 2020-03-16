package com.example.sahildhatrak.travelguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;

public class MetroTowards extends AppCompatActivity implements View.OnClickListener{
    private CardView ghatkopar,versova;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro_towards);
        ghatkopar = (CardView) findViewById(R.id.ghatkoparcard);
        versova = (CardView) findViewById(R.id.versovacard);


        ghatkopar.setOnClickListener(this);


        versova.setOnClickListener(this);





    }
    @Override
    public void onClick(View v){
        String x;
        Intent w;
        Intent h;
        switch (v.getId()) {
            case R.id.ghatkoparcard: x="0";w = new Intent(this,MetroStations.class);w.putExtra("value_to_be_passed", x);startActivity(w); break;
            case R.id.versovacard: x="1";h = new Intent(this,MetroStations.class);h.putExtra("value_to_be_passed",x);startActivity(h);break;
            default:break;

        }

    }


}
