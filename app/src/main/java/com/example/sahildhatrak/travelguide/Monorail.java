package com.example.sahildhatrak.travelguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Monorail extends AppCompatActivity implements View.OnClickListener {

    private CardView wadala,chembur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monorail);
        wadala = (CardView) findViewById(R.id.wadalacard);
        chembur = (CardView) findViewById(R.id.chemburcard);


        wadala.setOnClickListener(this);


        chembur.setOnClickListener(this);





    }
    @Override
    public void onClick(View v){
        String x;
        Intent w;
        Intent h;
        switch (v.getId()) {
            case R.id.wadalacard: x="0";w = new Intent(this,MonoStations.class);w.putExtra("value_to_be_passed", x);startActivity(w); break;
            case R.id.chemburcard: x="1";h = new Intent(this,MonoStations.class);h.putExtra("value_to_be_passed",x);startActivity(h);break;
            default:break;

        }

    }

}

