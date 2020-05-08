package com.glucosemonitor.carelinkglucosedatauploader;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public static MainActivityFragment newInstance(String text){
        MainActivityFragment m = new MainActivityFragment();
        Bundle b = new Bundle();
        b.putString("msg", text); // Add a string to the bundle
        m.setArguments(b); // Pass the bundle to the fragment
        return m;
    }

    public MainActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Create view from xml file "fragment_main"
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        // Get textbox from view
        TextView tv = (TextView) v.findViewById(R.id.textbox);
        // Change textbox value to saved value in bundle
        tv.setText(getArguments().getString("msg"));
        return v;
    }
}
