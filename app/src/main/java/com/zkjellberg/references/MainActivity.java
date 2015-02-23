package com.zkjellberg.references;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.zkjellberg.references.fragments.FragmentDash;
import com.zkjellberg.references.fragments.FragmentExpandListView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.containerDash, new FragmentDash())
//                    .add(R.id.containerDash, new FragmentSandbox())
                    .commit();
            getFragmentManager().beginTransaction()
//                    .add(R.id.containerStatus, new FragmentDash())
//                    .add(R.id.containerStatus, new FragmentList())
//                    .add(R.id.containerStatus, new FragmentStatus())
//                    .add(R.id.containerStatus, new FragmentSandbox())
                    .add(R.id.containerStatus, new FragmentExpandListView())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this, "Options not yet implemented", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buttonClick(View v) {
        Toast.makeText(getApplication(), "Test", Toast.LENGTH_SHORT).show();
    }
}