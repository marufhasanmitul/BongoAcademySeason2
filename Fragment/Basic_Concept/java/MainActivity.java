package com.maruftech.uidesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,new FirstFragment());
        fragmentTransaction.commit();



    }
}