package com.example.sahildhatrak.travelguide;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MetroStations extends AppCompatActivity {

    String x;
    String y;
private String[] vstations = {"Versova","DN Nagar","Azad Nagar","Bank of Baroda Andheri","Western Express Highway","Chakala (JB Nagar)","Airport Road","Ajmera Marol Naka","Saki Naka","Asalpha","Jagruti Nagar", "Vivo Ghatkopar"};
private String[] gstations = {"Vivo Ghatkopar","Jagruti Nagar","Asalpha","Saki Naka","Ajmera Marol Naka","Airport Road","Chakala (JB Nagar)","Western Express Highway","Bank of Baroda Andheri","Azad Nagar","DN Nagar","Versova"};
private EditText inputSearch2;
    ArrayAdapter<String> adapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        setContentView(R.layout.activity_metro_stations);
        inputSearch2 = (EditText) findViewById(R.id.editText2);
        ListView listView = (ListView) findViewById(R.id.listview2);
        if (extras.getString("value_to_be_passed") != null) {

            x = extras.getString("value_to_be_passed");

        }

        if (x.equals("0")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, vstations);
            listView.setAdapter(adapter2);

        } else if (x.equals("1")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, gstations);
            listView.setAdapter(adapter2);

        }
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    y = "0";
                    Intent myIntent = new Intent(view.getContext(), MetroSchedules.class);
                    myIntent.putExtra("value",y);
                    startActivityForResult(myIntent, 0);
                }
                }
            });
        inputSearch2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence arg0, int start, int count, int after) {


            }
            @Override
            public void onTextChanged(CharSequence arg0, int start, int before, int count) {
                MetroStations.this.adapter2.getFilter().filter(arg0);
            }

            @Override
            public void afterTextChanged(Editable arg0) {
                MetroStations.this.adapter2.getFilter().filter(arg0.toString());

            }
        });


    }

}


