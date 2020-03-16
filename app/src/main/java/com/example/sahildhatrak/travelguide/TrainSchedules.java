package com.example.sahildhatrak.travelguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;


public class TrainSchedules extends AppCompatActivity {
    String y;
    ArrayAdapter<String> adapter2;

    private String[] Churchgate = {"04:15 AM Virar S", "04:38 AM Borivali S","04:46 Borivali S","04:58 Dahanu Road F","05:00 AM Borivali S","05:07 AM Virar F","05:15 AM Goregaon S","05:32 AM Virar F","05:45 AM Borivali S","05:52 AM Vasai Road F","05:58 AM Virar F","06:11 AM Borivali S","06:21 AM Virar F","06:35 AM Borivali S","06:48 AM Andheri S","07:05 AM Borivali S","07:14 AM Virar F","07:30 AM Goregaon F","07:42 AM Borivali S","07:55 AM Virar F","08:07 AM Andheri S","08:23 AM Virar F","08:39 AM Borivali S","08:47 AM Borivali S","08:56 AM Dahanu Road F","09:04 AM Borivali S","09:14 AM Goregaon S","09:33 AM Virar F","09:44 AM Borivali S","10:00 AM Borivali S","10;17 AM Virar F"};
    private String[] Marine_Lines = {"04:18 AM Virar S", "04:41 AM Borivali S","04:49 Borivali S","05:01 Dahanu Road F","05:03 AM Borivali S","05:10 AM Virar F","05:18 AM Goregaon S","05:35 AM Virar F","05:48 AM Borivali S","05:55 AM Vasai Road F","06:01 AM Virar F","06:14 AM Borivali S","06:24 AM Virar F","06:38 AM Borivali S","06:51 AM Andheri S","07:08 AM Borivali S","07:14 AM Virar F","07:30 AM Goregaon F","07:45 AM Borivali S","07:58 AM Virar F","08:10 AM Andheri S","08:26 AM Virar F","08:42 AM Borivali S","08:50 AM Borivali S","08:59 AM Dahanu Road F","09:07 AM Borivali S","09:17 AM Goregaon S","09:36 AM Virar F","09:47 AM Borivali S","10:03 AM Borivali S","10;20 AM Virar F"};
    private String[] Charni_Road = {"04:20 AM Virar S", "04:43 AM Borivali S","04:51 Borivali S","05:03 Dahanu Road F","05:05 AM Borivali S","05:12 AM Virar F","05:20 AM Goregaon S","05:37 AM Virar F","05:50 AM Borivali S","05:57 AM Vasai Road F","06:03 AM Virar F","06:16 AM Borivali S","06:26 AM Virar F","06:40 AM Borivali S","06:53 AM Andheri S","07:10 AM Borivali S","07:16 AM Virar F","07:32 AM Goregaon F","07:47 AM Borivali S","08:00 AM Virar F","08:12 AM Andheri S","08:28 AM Virar F","08:44 AM Borivali S","08:52 AM Borivali S","09:01 AM Dahanu Road F","09:09 AM Borivali S","09:19 AM Goregaon S","09:38 AM Virar F","09:49 AM Borivali S","10:05 AM Borivali S","10;22 AM Virar F"};
    private String[] Grant_Road = {"04:23 AM Virar S", "04:46 AM Borivali S","04:54 Borivali S","05:06 Dahanu Road F","05:08 AM Borivali S","05:15 AM Virar F","05:23 AM Goregaon S","05:40 AM Virar F","05:53 AM Borivali S","06:00 AM Vasai Road F","06:06 AM Virar F","06:19 AM Borivali S","06:29 AM Virar F","06:43 AM Borivali S","06:56 AM Andheri S","07:13 AM Borivali S","07:19 AM Virar F","07:35 AM Goregaon F","07:50 AM Borivali S","08:03 AM Virar F","08:15 AM Andheri S","08:31 AM Virar F","08:47 AM Borivali S","08:55 AM Borivali S","09:07 AM Dahanu Road F","09:15 AM Borivali S","09:22 AM Goregaon S","09:41 AM Virar F","09:52 AM Borivali S","10:08 AM Borivali S","10;25 AM Virar F"};
    private String[] Mumbai_Central = {"04:25 AM Virar S", "04:48 AM Borivali S","04:56 Borivali S","05:08 Dahanu Road F","05:10 AM Borivali S","05:17 AM Virar F","05:25 AM Goregaon S","05:42 AM Virar F","05:55 AM Borivali S","06:02 AM Vasai Road F","06:08 AM Virar F","06:21 AM Borivali S","06:31 AM Virar F","06:45 AM Borivali S","06:58 AM Andheri S","07:15 AM Borivali S","07:21 AM Virar F","07:37 AM Goregaon F","07:52 AM Borivali S","08:05 AM Virar F","08:17 AM Andheri S","08:33 AM Virar F","08:49 AM Borivali S","08:57 AM Borivali S","09:09 AM Dahanu Road F","09:17 AM Borivali S","09:24 AM Goregaon S","09:43 AM Virar F","09:54 AM Borivali S","10:10 AM Borivali S","10;27 AM Virar F"};
    private String[] Panvel = {"04:03 AM CSMT S", "04:29 AM CSMT  S","04:49 CSMT  S","04:53 JUINAGAR S","05:05 AM CSMT S","05:21 AM JUINAGAR S ","05:36 AM CSMT S","05:58 AM ANDHERi S","06:05 AM CSMT S ","06: 17 AM JUINAGAR S ","06:41 AM VADALA ROAD S","06:53 AM ANDHERI S","07:09 AM VADALA ROAD S","07:19 AM JUINAGAR S","07:39 AM ANDHERI S","07:59AM CSMT S(WS)","08:04 AM JUINAGAR S ","08:26 AM CSMT S ","08:40 AM VADALA ROAD S ","08:47 AM CSMT S","09:09 AM CSMT S","09:16 AM VADALA ROAD S","09:48 AM JUINAGAR S ","09:53 AM CSMT S","10:05 AM CSMT S","10;21 AM VADALA ROAD S"};
    private String[] Kharghar = {"04:12 AM CSMT S", "04:38 AM CSMT  S","04:57 CSMT  S","05:02 JUINAGAR S","05:14 AM CSMT S","05:30 AM JUINAGAR S ","05:45 AM CSMT S","06:07 AM ANDHERi S","06:14 AM CSMT S ","06: 26 AM JUINAGAR S ","06:50 AM VADALA ROAD S","07:02 AM ANDHERI S","07:18 AM VADALA ROAD S","07:28 AM JUINAGAR S","07:48 AM ANDHERI S","08:08AM CSMT S(WS)","08:13 AM JUINAGAR S ","08:35 AM CSMT S ","08:49 AM VADALA ROAD S ","08:56 AM CSMT S","09:18 AM CSMT S","09:2516 AM VADALA ROAD S","09:57 AM JUINAGAR S ","10:02 AM CSMT S","10:14 AM CSMT S","10:30 AM VADALA ROAD S"};
    private String[] Belapur = {"04:16 AM CSMT S", "04:42 AM CSMT  S","05:01 CSMT  S","05:06 JUINAGAR S","05:18 AM CSMT S","05:34 AM JUINAGAR S ","05:49 AM CSMT S","06:11 AM ANDHERi S","06:18 AM CSMT S ","06:30 AM JUINAGAR S ","06:54 AM VADALA ROAD S","07:06 AM ANDHERI S","07:22 AM VADALA ROAD S","07:32 AM JUINAGAR S","07:52 AM ANDHERI S","08:12AM CSMT S(WS)","08:17 AM JUINAGAR S ","08:39 AM CSMT S ","08:54 AM VADALA ROAD S ","09:00 AM CSMT S","09:22 AM CSMT S","09:29 AM VADALA ROAD S","10:01 AM JUINAGAR S ","10:06 AM CSMT S","10:18 AM CSMT S","10:34 AM VADALA ROAD S"};
    private String[] Nerul = {"04:23 AM CSMT S", "04:49 AM CSMT  S","05:08 CSMT  S","05:13 JUINAGAR S","05:25 AM CSMT S","05:41 AM JUINAGAR S ","05:56 AM CSMT S","06:18 AM ANDHERi S","06:25AM CSMT S ","06:37 AM JUINAGAR S ","07:01 AM VADALA ROAD S","07:13 AM ANDHERI S","07:29 AM VADALA ROAD S","07:39 AM JUINAGAR S","07:59 AM ANDHERI S","08:19AM CSMT S(WS)","08:24 AM JUINAGAR S ","08:46 AM CSMT S ","09:01 AM VADALA ROAD S ","09:07 AM CSMT S","09:29 AM CSMT S","09:36 AM VADALA ROAD S","10:08 AM JUINAGAR S ","10:13 AM CSMT S","10:25 AM CSMT S","10:41 AM VADALA ROAD S"};
    private String[] Vashi = {"04:32 AM CSMT S", "04:58 AM CSMT  S","05:15 VADALA ROAD S","05:17 CSMT  S","05:34 AM CSMT S","05:59 AM VADALA ROAD S ","06:05 AM CSMT S","06:27 AM ANDHERI S","06:34 AM CSMT S ","06:46 AM VADALA ROAD S ","07:10 AM VADALA ROAD S","07:22 AM ANDHERI S","07:38 AM VADALA ROAD S","08:08 AM ANDHERI S","08:28 AM CSMT S(WS)","08:34 AM VADALA ROAD S ","08:54 AM CSMT S ","09:10 AM VADALA ROAD S ","09:16 AM CSMT S","09:38 AM CSMT S","09:45 AM VADALA ROAD S","10:16 AM CSMT S ","10:22 AM CSMT S","10:34 AM CSMT S","10:50 AM VADALA ROAD S"};
    private String[] Mankhurd = {"04:40 AM CSMT S", "05:06 AM CSMT  S","05:23 VADALA ROAD S","05:25 CSMT  S","05:42 AM CSMT S","06:07 AM VADALA ROAD S ","06:13 AM CSMT S","06:35 AM ANDHERI S","06:42 AM CSMT S ","06:54 AM VADALA ROAD S ","07:18 AM VADALA ROAD S","07:30 AM ANDHERI S","07:46 AM VADALA ROAD S","08:16 AM ANDHERI S","08:36 AM CSMT S(WS)","08:42 AM VADALA ROAD S ","09:02 AM CSMT S ","09:18 AM VADALA ROAD S ","09:24 AM CSMT S","09:46 AM CSMT S","09:54 AM VADALA ROAD S","10:24 AM CSMT S ","10:30 AM CSMT S","10:42 AM CSMT S","10:58 AM VADALA ROAD S"};
    private String[] Kurla = {"04:22 AM CSMT S", "04:32 AM CSMT  S","04:44 VADALA ROAD S","04:52 CSMT  S","05:00 AM CSMT S","05:09 AM CSMT S","05:22 AM VADALA ROAD S ","05:34 AM CSMT S","05:46 AM CSMT S","06:06 AM CSMT S ","06:18 AM VADALA ROAD S ","06:35 AM CSMT S","06:47 AM ANDHERI S","07:06 AM VADALA ROAD S","07:30 AM CSMT S","07:30 AM VADALA ROAD S","07:42 AM ANDHERI S","07:54 AM CSMT S","08:12 AM VADALA ROAD S ","08:24 AM CSMT S","08:40 AM CSMT S ","09:08 AM (WS) S ","09:26 AM CSMT S","09:42 AM CSMT S","10:05 AM VADALA ROAD S","10:21 AM CSMT S ","10:30 AM CSMT S","10:42 AM CSMT S","10:54 AM CSMT S"};
    private String[] Vadala = {"04:32 AM CSMT S", "04:42 AM CSMT  S","04:44 VADALA ROAD S","04:52 CSMT  S","05:00 AM CSMT S","05:09 AM CSMT S","05:22 AM VADALA ROAD S ","05:34 AM CSMT S","05:46 AM CSMT S","06:06 AM CSMT S ","06:18 AM VADALA ROAD S ","06:35 AM CSMT S","06:47 AM ANDHERI S","07:06 AM VADALA ROAD S","07:30 AM CSMT S","07:30 AM VADALA ROAD S","07:42 AM ANDHERI S","07:54 AM CSMT S","08:12 AM VADALA ROAD S ","08:24 AM CSMT S","08:40 AM CSMT S ","09:08 AM (WS) S ","09:26 AM CSMT S","09:42 AM CSMT S","10:05 AM VADALA ROAD S","10:21 AM CSMT S ","10:30 AM CSMT S","10:42 AM CSMT S","10:54 AM CSMT S"};
    private String[] Thane = {"05:12 Panvel S","05:25 Vashi S","05:40 AM Nerul S ","05:53 AM Vashi S","06:09 AM Vashi S","06:20 AM Panvel S ","06:39 AM Vashi S ","07:04 AM Panvel S","07:17 AM Vashi S","07:23 AM Nerul S","07:35 AM Vashi S","07:43 AM Nerul S","08:14 AM Nerul S","08:23 AM Vashi S ","08:36 AM Vashi S ","09:04 AM Nerul S ","09:14 AM Panvel S","09:30 AM Vashi S","09:47 AM Nerul S","10:07 AM Vashi S ","10:12 AM Nerul S","10:35 AM Vashi S","10:40 AM Belapur CBD S","11:06 AM Vashi S"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        setContentView(R.layout.activity_train_schedules);
        if (extras.getString("value") != null) {

            y = extras.getString("value");

        }
        if (y.equals("0")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Churchgate);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("1")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Marine_Lines);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("2")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Charni_Road);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("3")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Grant_Road);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("4")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("5")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Panvel);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("6")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Kharghar);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("7")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Belapur);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("8")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Nerul);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("9")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Nerul);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("10")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Nerul);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("11")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Vashi);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("12")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Vashi);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("13")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mankhurd);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("14")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mankhurd);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("15")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mankhurd);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("16")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mankhurd);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("17")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Kurla);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("18")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Kurla);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("19")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Kurla);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("20")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Kurla);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("21")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Vadala);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("22")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Vadala);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("23")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Vadala);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("24")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Nerul);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("25")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Nerul);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("26")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Nerul);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("27")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Nerul);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("28")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("29")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("30")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("31")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("32")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("33")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("34")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("35")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("36")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("37")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("38")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("39")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("40")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("41")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("42")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("43")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("44")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("45")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("46")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("47")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("48")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("49")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("50")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("51")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("52")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("53")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("54")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("55")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("56")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("57")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("58")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("59")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("60")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("61")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("62")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("63")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Thane);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("64")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Nerul);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("65")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Nerul);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("66")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Nerul);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("67")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Nerul);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("68")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("69")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("70")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("71")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("72")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("73")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("74")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("75")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("76")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("77")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("78")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("79")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("80")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("81")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }
        if (y.equals("82")) {
            adapter2 = new ArrayAdapter<String>(this, R.layout.stations, Mumbai_Central);
            ListView listView2 = (ListView) findViewById(R.id.listview2);
            listView2.setAdapter(adapter2);

        }

    }
}