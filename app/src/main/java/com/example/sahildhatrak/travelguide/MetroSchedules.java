package com.example.sahildhatrak.travelguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MetroSchedules extends AppCompatActivity {

    private EditText inputSearch3;
    ArrayAdapter<String> adapter3;
    String v;
    private String[] versova = {"5:30 AM Vivo Ghatkopar" ,
            "5:38 AM Vivo Ghatkopar" ,
            "5:46 AM Vivo Ghatkopar" ,
            "5:54:00	Vivo Ghatkopar" ,
            "	6:02:00	Vivo Ghatkopar		" ,
            "	6:10:00	Vivo Ghatkopar		" ,
            "	6:18:00	Vivo Ghatkopar		" ,
            "	6:26:00	Vivo Ghatkopar		" ,
            "	6:34:00	Vivo Ghatkopar		" ,
            "	6:42:00	Vivo Ghatkopar		" ,
            "	6:50:00	Vivo Ghatkopar		" ,
            "	6:58:00	Vivo Ghatkopar		" ,
            "	7:06:00	Vivo Ghatkopar		" ,
            "	7:14:00	Vivo Ghatkopar		" ,
            "	7:22:00	Vivo Ghatkopar		" ,
            "	7:30:00	Vivo Ghatkopar		" ,
            "	7:38:00	Vivo Ghatkopar		" ,
            "	7:46:00	Vivo Ghatkopar		" ,
            "	7:54:00	Vivo Ghatkopar		" ,
            "	8:02:00	Vivo Ghatkopar		" ,
            "	8:10:00	Vivo Ghatkopar		" ,
            "	8:18:00	Vivo Ghatkopar		" ,
            "	8:26:00	Vivo Ghatkopar		" ,
            "	8:34:00	Vivo Ghatkopar		" ,
            "	8:50:00	Vivo Ghatkopar		" ,
            "	8:58:00	Vivo Ghatkopar		" ,
            "	9:06:00	Vivo Ghatkopar		" ,
            "	9:14:00	Vivo Ghatkopar		" ,
            "	9:22:00	Vivo Ghatkopar		" ,
            "	9:30:00	Vivo Ghatkopar		" ,
            "	9:38:00	Vivo Ghatkopar		" ,
            "	9:46:00	Vivo Ghatkopar		" ,
            "	9:54:00	Vivo Ghatkopar		" ,
            "	10:02:00	Vivo Ghatkopar		" ,
            "	10:10:00	Vivo Ghatkopar		" ,
            "	10:18:00	Vivo Ghatkopar		" ,
            "	10:26:00	Vivo Ghatkopar		" ,
            "	10:34:00	Vivo Ghatkopar		" ,
            "	10:42:00	Vivo Ghatkopar		" ,
            "	10:50:00	Vivo Ghatkopar		" ,
            "	10:58:00	Vivo Ghatkopar		" ,
            "	11:06:00	Vivo Ghatkopar		" ,
            "	11:14:00	Vivo Ghatkopar		" ,
            "	11:22:00	Vivo Ghatkopar		" ,
            "	11:30:00	Vivo Ghatkopar		" ,
            "	11:38:00	Vivo Ghatkopar		" ,
            "	12:02:00	Vivo Ghatkopar		" ,
            "	12:10:00	Vivo Ghatkopar		" ,
            "	12:18:00	Vivo Ghatkopar		" ,
            "	12:26:00	Vivo Ghatkopar		" ,
            "	12:34:00	Vivo Ghatkopar		" ,
            "	12:42:00	Vivo Ghatkopar		" ,
            "	12:50:00	Vivo Ghatkopar		" ,
            "	12:58:00	Vivo Ghatkopar		" ,
            "	13:06:00	Vivo Ghatkopar		" ,
            "	13:14:00	Vivo Ghatkopar		" ,
            "	13:22:00	Vivo Ghatkopar		" ,
            "	13:30:00	Vivo Ghatkopar		" ,
            "	13:38:00	Vivo Ghatkopar		" ,
            "	13:46:00	Vivo Ghatkopar		" ,
            "	13:54:00	Vivo Ghatkopar		" ,
            "	14:02:00	Vivo Ghatkopar		" ,
            "	14:10:00	Vivo Ghatkopar		" ,
            "	14:18:00	Vivo Ghatkopar		" ,
            "	14:26:00	Vivo Ghatkopar		" ,
            "	14:34:00	Vivo Ghatkopar		" ,
            "	14:42:00	Vivo Ghatkopar		" ,
            "	14:50:00	Vivo Ghatkopar		" ,
            "	14:58:00	Vivo Ghatkopar		" ,
            "	15:06:00	Vivo Ghatkopar		" ,
            "	15:14:00	Vivo Ghatkopar		" ,
            "	15:22:00	Vivo Ghatkopar		" ,
            "	15:30:00	Vivo Ghatkopar		" ,
            "	15:38:00	Vivo Ghatkopar		" ,
            "	15:46:00	Vivo Ghatkopar		" ,
            "	15:54:00	Vivo Ghatkopar		" ,
            "	16:02:00	Vivo Ghatkopar		" ,
            "	16:10:00	Vivo Ghatkopar		" ,
            "	16:18:00	Vivo Ghatkopar		" ,
            "	16:26:00	Vivo Ghatkopar		" ,
            "	16:34:00	Vivo Ghatkopar		" ,
            "	16:42:00	Vivo Ghatkopar		" ,
            "	16:50:00	Vivo Ghatkopar		" ,
            "	16:58:00	Vivo Ghatkopar		" ,
            "	17:06:00	Vivo Ghatkopar		" ,
            "	17:14:00	Vivo Ghatkopar		" ,
            "	17:22:00	Vivo Ghatkopar		" ,
            "	17:30:00	Vivo Ghatkopar		" ,
            "	17:38:00	Vivo Ghatkopar		" ,
            "	17:46:00	Vivo Ghatkopar		" ,
            "	17:54:00	Vivo Ghatkopar		" ,
            "	18:02:00	Vivo Ghatkopar		" ,
            "	18:10:00	Vivo Ghatkopar		" ,
            "	18:18:00	Vivo Ghatkopar		" ,
            "	18:26:00	Vivo Ghatkopar		" ,
            "	18:34:00	Vivo Ghatkopar		" ,
            "	18:42:00	Vivo Ghatkopar		" ,
            "	18:50:00	Vivo Ghatkopar		" ,
            "	18:58:00	Vivo Ghatkopar		" ,
            "	19:06:00	Vivo Ghatkopar		" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        setContentView(R.layout.activity_metro_schedules);
        ListView listView2 = (ListView) findViewById(R.id.listview2);
        if (extras.getString("value") != null) {

            v = extras.getString("value");

        }
        if (v.equals("0")) {
            adapter3 = new ArrayAdapter<String>(this, R.layout.stations, versova);
            listView2.setAdapter(adapter3);

        }

    }
}
