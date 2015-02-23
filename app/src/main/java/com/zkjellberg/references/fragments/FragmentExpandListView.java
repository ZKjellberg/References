package com.zkjellberg.references.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.zkjellberg.references.R;
import com.zkjellberg.references.objects.Group;
import com.zkjellberg.references.objects.MyExpandableListAdapter;


public class FragmentExpandListView extends Fragment {
    // more efficient than HashMap for mapping integers to objects
    SparseArray<Group> groups = new SparseArray<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list, container, false);
        createData();
        ExpandableListView listView = (ExpandableListView) v.findViewById(R.id.listView);
        MyExpandableListAdapter adapter = new MyExpandableListAdapter(getActivity(), groups);
        listView.setAdapter(adapter);
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

    public void createData() {
        // Generating Mock Data
        Group group;

        // Total Tests
        group = new Group("Total Tests Received: " + 500);
        group.children.add("Failed Test at 0800");
        group.children.add("Unknown Test at 0945");
        group.children.add("Successful Test at 1600");
        group.children.add("Successful Test at 1615");
        groups.append(0, group);

        // Total Tests
        group = new Group("Status");
        group.children.add("Picture request at 1600");
        group.children.add("Task completed at 1630");
        group.children.add("Return home at 1645");
        groups.append(1, group);

        for (int j = 2; j < 5; j++) {
            group = new Group("Task Category " + j);
            for (int i = 0; i < 5; i++) {
                group.children.add("Task" + i);
            }
            groups.append(j, group);
        }
    }
}
