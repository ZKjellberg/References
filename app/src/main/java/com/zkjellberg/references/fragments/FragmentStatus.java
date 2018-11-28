package com.zkjellberg.references.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zkjellberg.references.R;

public class FragmentStatus extends Fragment {
    public FragmentStatus() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_status, container, false);

        // UGV Task Status
        TextView containerAssetStatus = v.findViewById(R.id.textViewContainerAssetStatus);
        containerAssetStatus.setText(
                "Current Pose: Pitch, Roll, Heading\n" +
                "Current Velocity: 35MPH\n" +
                "Battery Voltage: 80%\n" +
                "Current Errors:\n" +
                "\t\tMobility: 0 FATAL 0 SEVERE 1 WARNING\n" +
                "\t\tSensor: 0 FATAL 0 SEVERE 1 WARNING\n" +
                "Total Tasks received: 1\n" +
                "Tasks Rejected: 0\n" +
                "Tasks Accepted: 1\n" +
                "Tasks Executed: 1\n" +
                "Tasks Failed: 0" +
                "");

        return v;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
