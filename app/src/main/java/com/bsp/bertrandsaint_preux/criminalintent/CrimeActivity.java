package com.bsp.bertrandsaint_preux.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();
        Fragment crimeFragment = fm.findFragmentById(R.id.fragment_container);

        if (crimeFragment == null) {
            crimeFragment = new CrimeFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, crimeFragment)
                    .commit();
        }
    }
}
