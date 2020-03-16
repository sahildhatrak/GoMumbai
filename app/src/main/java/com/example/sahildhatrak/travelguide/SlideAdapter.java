package com.example.sahildhatrak.travelguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public SlideAdapter(Context context){
        this.context = context;
    }

    public int[] list_images = {

            R.drawable.mumbai_local,
            R.drawable.metro,
            R.drawable.bus,
            R.drawable.mono

    };
    public String[] list_titles = {
            "You can check schedules of trains of any station and also you can book a ticket for your desired travel",
            "You have to select if you want to go towards Versova or Ghatkopar and then check schedules of the trains",
            "You can select which bus you want to take and check the stops of that particular bus",
            "You have to select if you want to go towards Wadala or Chembur and then check schedules of the trains"
    };

    @Override
    public int getCount() {
        return list_titles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return (view==(ConstraintLayout)o);

    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        ConstraintLayout layoutslide = view.findViewById(R.id.slideLayout);
        ImageView imgSlide = (ImageView) view.findViewById(R.id.slideimg);
        TextView textSlide = (TextView) view.findViewById(R.id.slideText);
        imgSlide.setImageResource(list_images[position]);
        textSlide.setText(list_titles[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
    container.removeView((ConstraintLayout)object);
    }
}
