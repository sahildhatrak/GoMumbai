package com.example.sahildhatrak.travelguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Bus extends AppCompatActivity {

    private String[] BusNumbers = {"100","101","102","103","104","105","106","201","202","203","204","205","206","207","301","302","303","304","305","306","307"};
    private String[] Start = {"Mantralaya","Colaba Depot","Grant Road Railway Station(E)","RC Church","J Mehta Marg","Kamla Nehru Park","Ram Mandir Railway Station","CSM Bus Terminus","Ahilyabai Holkar Chowk","Navy Nagar:Colaba","PT Paluskar Chowk","Backbay Depot","Byculla Bus Depot","Colaba Bus Station","Prem Nagar","Malabar Hill","Goregaon Railway Station","Chowpati Band Stand","Gateway of India","Worli Village","Charni Road"};
    private String[] End = {"Ahilyabai Holkar Chowk","Walkeshwar","Tardeo Bus Station","Kamla Nehru Park","Prem Nagar","Malabar Hill","Goregaon Railway Station","Chowpati Band Stand","Gateway of India","Worli Village","Charni Road","J Mehta Marg","Nehru Planetarium","Worli Depot","RC Church","J Mehta Marg","Kamla Nehru Park","Ram Mandir Railway Station","CSM Bus Terminus","Ahilyabai Holkar Chowk","Navy Nagar:Colaba"};
    private EditText inputSearch;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        ListView listView = (ListView) findViewById(R.id.listviewBus);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);



    }
    class CustomAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return BusNumbers.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.bus_stops,null);
            TextView busNumber = (TextView) view.findViewById(R.id.lable);
            TextView busStopA = (TextView) view.findViewById(R.id.lable2);
            TextView busStopB = (TextView) view.findViewById(R.id.lable3);
            TextView busStart = (TextView) view.findViewById(R.id.lable4);
            TextView busEnd = (TextView) view.findViewById(R.id.lable5);



            busNumber.setText(BusNumbers[i]);
            busStopA.setText(Start[i]);
            busStopB.setText(End[i]);
            return view;


        }
    }

}
