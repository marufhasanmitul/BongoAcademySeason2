package com.maruftech.uidesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLay;
    MaterialToolbar toolBarId;

    NavigationView navigationViewId;

    ImageView imageView;

    View headerview;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLay=findViewById(R.id.drawerLay);
        toolBarId=findViewById(R.id.toolBarId);
        navigationViewId=findViewById(R.id.navigationViewId);

        headerview=navigationViewId.getHeaderView(0);
        imageView=headerview.findViewById(R.id.imageView);



        toolBarId.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if(item.getItemId()==R.id.share){

                    Toast.makeText(MainActivity.this, "This is a Share", Toast.LENGTH_SHORT).show();
                }



                return true;
            }
        });



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is a Image", Toast.LENGTH_SHORT).show();
            }
        });




        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(
            MainActivity.this,drawerLay,toolBarId,R.string.open,R.string.close

        );

        drawerLay.addDrawerListener(toggle);

        FragmentManager fManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLay,new FirstFragment());
        fragmentTransaction.commit();

        navigationViewId.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.home){
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    FragmentManager fManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLay,new FirstFragment());
                    fragmentTransaction.commit();
                    drawerLay.closeDrawer(GravityCompat.START);
                }

                else if(item.getItemId()==R.id.profile){
                    FragmentManager fManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLay,new SecondFragment());
                    fragmentTransaction.commit();
                    drawerLay.closeDrawer(GravityCompat.START);
                }

                else if(item.getItemId()==R.id.setting){
                    FragmentManager fManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLay,new ThirdFragment());
                    fragmentTransaction.commit();
                    drawerLay.closeDrawer(GravityCompat.START);
                }





                return true;
            }
        });


















        /*

        * */









    }
}