package com.example.sahildhatrak.travelguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MonoStations extends AppCompatActivity {

    String x;
    String y;
    ArrayAdapter<String> adapter2;
    private EditText inputSearch2;
    private String[] wstations = {"Chembur","VNP Marg Junction","Fertiliser Township","Bharat Petroleum","Mysore Colony","Bhakti Park","Wadala"};
    private String[] cstations = {"Wadala","Bhakti Park","Mysore Colony","Bharat Petroleum","Fertilizer Township","VNP Marg Junction","Chembur"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mono_stations);
        Bundle extras = getIntent().getExtras();
        inputSearch2 = (EditText) findViewById(R.id.editText2);
        ListView listView = (ListView) findViewById(R.id.listview2);
        if (extras.getString("value_to_be_passed") != null) {

            x = extras.getString("value_to_be_passed");

        }

        if (x.equals("0")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, wstations);
            listView.setAdapter(adapter2);

        } else if (x.equals("1")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, cstations);
            listView.setAdapter(adapter2);

        }

        inputSearch2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence arg0, int start, int count, int after) {


            }
            @Override
            public void onTextChanged(CharSequence arg0, int start, int before, int count) {
                MonoStations.this.adapter2.getFilter().filter(arg0);
            }

            @Override
            public void afterTextChanged(Editable arg0) {
                MonoStations.this.adapter2.getFilter().filter(arg0.toString());

            }
        });
    }
}
