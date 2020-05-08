package com.glucosemonitor.carelinkglucosedatauploader;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DeveloperMenuFragment extends Fragment {


    public DeveloperMenuFragment() {
        // Required empty public constructor
    }

    public static DeveloperMenuFragment newInstance() {
        DeveloperMenuFragment fragment = new DeveloperMenuFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_developer_menu, container, false);
    }

}
