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
public class tab3 extends Fragment {
    View view;
    public tab3() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_tab3, container, false);


        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        TextView tv=(TextView) view.findViewById(R.id.projectdesc);
        tv.setText(Html.fromHtml(getString(R.string.projectsdesc)));
    }
}
