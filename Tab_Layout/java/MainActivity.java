package com.maruftech.uidesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
    TabLayout tabLayOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayOut=findViewById(R.id.tabLayOut);


        FragmentManager fManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,new FirstFragment());
        fragmentTransaction.commit();
        
        tabLayOut.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
               int tabPosition= tab.getPosition();
               if(tabPosition==0){
                   FragmentManager fManager=getSupportFragmentManager();
                   FragmentTransaction fragmentTransaction=fManager.beginTransaction();
                   fragmentTransaction.add(R.id.frameLayout,new FirstFragment());
                   fragmentTransaction.commit();
               } else if (tabPosition==1) {
                   FragmentManager fManager=getSupportFragmentManager();
                   FragmentTransaction fragmentTransaction=fManager.beginTransaction();
                   fragmentTransaction.add(R.id.frameLayout,new SecondFragment());
                   fragmentTransaction.commit();
               } else if (tabPosition==2) {
                   FragmentManager fManager=getSupportFragmentManager();
                   FragmentTransaction fragmentTransaction=fManager.beginTransaction();
                   fragmentTransaction.add(R.id.frameLayout,new ThirdFragment());
                   fragmentTransaction.commit();
               }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}