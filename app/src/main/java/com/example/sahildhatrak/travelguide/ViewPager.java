package com.example.sahildhatrak.travelguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewPager extends AppCompatActivity {
    private android.support.v4.view.ViewPager viewPager;
    private SlideAdapter myadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        viewPager = (android.support.v4.view.ViewPager) findViewById(R.id.viewpager);
        myadapter = new SlideAdapter(this);
        viewPager.setAdapter(myadapter);
    }
}
