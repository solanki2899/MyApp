package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab2 extends Fragment {

    View view;
    public tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view= inflater.inflate(R.layout.fragment_tab2, container, false);


        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        TextView tv=(TextView) view.findViewById(R.id.workshopdesc);
        tv.setText(Html.fromHtml(getString(R.string.workshopdesc)));
    }
}
