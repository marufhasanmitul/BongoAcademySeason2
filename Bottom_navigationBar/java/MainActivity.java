package com.maruftech.uidesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavId;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavId=findViewById(R.id.bottomNavId);




        FragmentManager fManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,new FirstFragment());
        fragmentTransaction.commit();



        bottomNavId.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int getId=item.getItemId();

                if(getId==R.id.home){
                    FragmentManager fManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout,new FirstFragment());
                    fragmentTransaction.commit();
                } else if (getId==R.id.share) {
                    FragmentManager fManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout,new SecondFragment());
                    fragmentTransaction.commit();
                } else if (getId==R.id.setting) {
                    FragmentManager fManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout,new ThirdFragment());
                    fragmentTransaction.commit();
                } else if (getId==R.id.profile) {
                    FragmentManager fManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout,new ThirdFragment());
                    fragmentTransaction.commit();
                }
                return true;
            }
        });
        




    }
}