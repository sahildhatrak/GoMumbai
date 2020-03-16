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

public class western extends AppCompatActivity {

    String x;
    String y;

    private String[] wstations = {"Churchgate", "Marine Lines", "Charni Road", "Grant Road", "Mumbai Central", "Mahalakshmi", "Lower Parel", "Prabhadevi", "Dadar", "Matunga Road", "Mahim", "Bandra", "Khar Road", "Santacruz", "Vile Parle", "Andheri", "Jogeshwari", "Ram Mandir", "Goregaon", "Malad", "Kandivali", "Borivali", "Dahisar", "Mira Road", "Bhayander", "Naigaon", "Vasai Road", "Nalla Sopara", "Virar"};
    private String[] hstations = {"Panvel", "Kharghar", "Belapur CBD", "Seawoods", "Nerul", "Juinagar", "Sanpada", "Vashi", "Mankhurd", "Govandi", "Chembur", "Tilaknagar", "Kurla", "Chunabhatti", "GTB Nagar", "Vadala Road", "Sewri", "Kings Circle", "Mahim", "Bandra", "CSMT", "Khar Road", "Santacruz", "Vile Parle", "Andheri", "Jogeshwari", "Ram Mandir","Goregaon","Masjid","Sandhurst Road", "Khandeshwar", "Mansarovar","Dockyard Road","Reay Road","Cotton Green"};
    private String[] censtations ={"Chatrapati Shivaji Terminus			",
            "Masjid Bunder",
            "Sandhurst Road			",
            "Byculla			",
            "Chinchpokli			",
            "Currey Road			",
            "Parel			",
            "Dadar			",
            "Matunga			",
            "Sion			",
            "Kurla			",
            "Vidyavihar			",
            "Ghatkopar			",
            "Vikhroli			",
            "Kanjurmarg			",
            "Bhandup			",
            "Nahur			",
            "Mulund			",
            "Thane			",
            "Kalwa			",
            "Mumbra			",
            "Diwa			",
            "Kopar			",
            "Dombivli			",
            "Thakurli			",
            "Kalyan			",
            "Sahad			",
            "Ambivalli			",
            "Titwala			",
            "Khadavli			",
            "Vasind			",
            "Asangaon			",
            "Atgaon			",
            "Kardi			",
            "Kasara			"};
    private String[] transstations ={"Thane","Airoli","Rebale","Ghansoli","Koparkhairne","Turbhe","Sanpada",
            "Vashi","Juinagar","Nerul","Seawood Darave","Belapur CBD","Kharghar","Manasarovar","Khandeshwar","Panvel"};
    private EditText inputSearch;
ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        setContentView(R.layout.activity_western);
        inputSearch = (EditText)findViewById(R.id.editText);
        if(extras.getString("value_to_be_passed") != null)
        {

            x = extras.getString("value_to_be_passed");

        }

        if (x.equals("0")) {
            adapter = new ArrayAdapter<String>(this, R.layout.stations, wstations);
            ListView listView = (ListView) findViewById(R.id.listview);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    if (position == 0) {
                        y = "0";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 1) {
                        y = "1";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 2) {
                        y = "2";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 3) {
                        y = "3";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 4) {
                        y = "4";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 5) {
                        y = "28";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 6) {
                        y = "29";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 7) {
                        y = "30";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 8) {
                        y = "31";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 9) {
                        y = "32";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 10) {
                        y = "33";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 11) {
                        y = "34";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 12) {
                        y = "35";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 13) {
                        y = "36";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 14) {
                        y = "37";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 15) {
                        y = "38";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 16) {
                        y = "39";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 17) {
                        y = "40";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 18) {
                        y = "41";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 19) {
                        y = "42";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 20) {
                        y = "43";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 21) {
                        y = "44";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 22) {
                        y = "45";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }



                }
            });}
            else if (x.equals("1")) {
            adapter = new ArrayAdapter<String>(this, R.layout.stations, hstations);
            ListView listView = (ListView) findViewById(R.id.listview);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    if (position == 0) {
                        y = "5";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 1) {
                        y = "6";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 2) {
                        y = "7";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 3) {
                        y = "8";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 4) {
                        y = "9";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 5) {
                        y = "10";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 6) {
                        y = "11";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 7) {
                        y = "12";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 8) {
                        y = "13";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 9) {
                        y = "14";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 10) {
                        y = "15";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 11) {
                        y = "16";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 12) {
                        y = "17";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 13) {
                        y = "18";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 14) {
                        y = "19";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 15) {
                        y = "20";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 16) {
                        y = "21";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 17) {
                        y = "22";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 18) {
                        y = "23";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 19) {
                        y = "24";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 20) {
                        y = "25";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 21) {
                        y = "26";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 22) {
                        y = "27";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }


                }
            });
        }
            else if(x.equals("2")) {
                adapter = new ArrayAdapter<String>(this, R.layout.stations, censtations);
            ListView listView = (ListView) findViewById(R.id.listview);
            listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {
                        if (position == 0) {
                            y = "62";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value",y);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 1) {
                            y = "63";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }

                        if (position == 2) {
                            y = "64";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }

                        if (position == 3) {
                            y = "65";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }

                        if (position == 4) {
                            y = "66";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 5) {
                            y = "67";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 6) {
                            y = "68";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 7) {
                            y = "69";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 8) {
                            y = "70";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 9) {
                            y = "71";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 10) {
                            y = "72";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 11) {
                            y = "73";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 12) {
                            y = "74";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 13) {
                            y = "75";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 14) {
                            y = "76";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 15) {
                            y = "77";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 16) {
                            y = "78";
                            Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                            myIntent.putExtra("value", y);
                            startActivityForResult(myIntent, 0);
                        }
        }
                    });}

        else if(x.equals("3")) {
            adapter = new ArrayAdapter<String>(this, R.layout.stations, transstations);
            ListView listView = (ListView) findViewById(R.id.listview);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    if (position == 0) {
                        y = "45";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value",y);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 1) {
                        y = "46";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 2) {
                        y = "47";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 3) {
                        y = "48";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 4) {
                        y = "49";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 5) {
                        y = "50";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 6) {
                        y = "51";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 7) {
                        y = "52";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 8) {
                        y = "53";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 9) {
                        y = "54";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 10) {
                        y = "55";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 11) {
                        y = "56";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 12) {
                        y = "57";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 13) {
                        y = "58";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 14) {
                        y = "59";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 15) {
                        y = "60";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 16) {
                        y = "61";
                        Intent myIntent = new Intent(view.getContext(), TrainSchedules.class);
                        myIntent.putExtra("value", y);
                        startActivityForResult(myIntent, 0);
                    }
                }
            });}
      inputSearch.addTextChangedListener(new TextWatcher() {
                                               @Override
                                               public void beforeTextChanged(CharSequence arg0, int start, int count, int after) {


                                               }
                                               @Override
                                               public void onTextChanged(CharSequence arg0, int start, int before, int count) {
                                                   western.this.adapter.getFilter().filter(arg0);
                                               }

                                               @Override
                                               public void afterTextChanged(Editable arg0) {
                                                   western.this.adapter.getFilter().filter(arg0.toString());

                                               }
                                           });


    }

}



