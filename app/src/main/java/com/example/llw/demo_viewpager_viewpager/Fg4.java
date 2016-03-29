package com.example.llw.demo_viewpager_viewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fg4 extends Fragment {
    private LayoutInflater layoutInflater;
    private TextView textView;

    public Fg4(MainActivity mainActivity) {
        // Required empty public constructor
        layoutInflater = LayoutInflater.from(mainActivity);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

/*
        container = (ViewGroup) layoutInflater.inflate(R.layout.fragment_fg4, null);
        textView = (TextView) container.findViewById(R.id.text_four);
*/

        View view = inflater.inflate(R.layout.fragment_fg4, container, false);
        return view;
    }

}
