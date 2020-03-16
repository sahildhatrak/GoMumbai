package com.example.sahildhatrak.travelguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class fragment extends Fragment {

    public static Fragment newInstance() {
        return new fragment();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;



    }

    private class RecyclerViewHolder extends RecyclerView.ViewHolder implements com.example.sahildhatrak.travelguide.RecyclerViewHolder {
        private CardView western, central, harbour, transharbour;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public RecyclerViewHolder(LayoutInflater inflater, ViewGroup container) {
            super(inflater.inflate(R.layout.activity_b, container, false));

            western = itemView.findViewById(R.id.wescard);
            central = itemView.findViewById(R.id.cencard);
            harbour = itemView.findViewById(R.id.harcard);
            transharbour = itemView.findViewById(R.id.transcard);





        }


    }



    }





