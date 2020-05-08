package com.glucosemonitor.carelinkglucosedatauploader;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingsMenuFragment extends Fragment {

    public SettingsMenuFragment() {
        // Required empty public constructor
    }

    public static SettingsMenuFragment newInstance() {
        SettingsMenuFragment fragment = new SettingsMenuFragment();
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
        return inflater.inflate(R.layout.fragment_settings_menu, container, false);
    }
}
