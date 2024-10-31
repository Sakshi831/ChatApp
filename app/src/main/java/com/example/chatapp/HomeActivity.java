package com.example.chatapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView btnNav;
    Fragment fragment=new ChatFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnNav=findViewById(R.id.bottomNav);
       getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
//         btnNav.setSelectedItemId(R.id.nav_chat);


        btnNav.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                 if (item.getItemId()==R.id.nav_chat) {
                    fragment=new ChatFragment();
                }
                else if (item.getItemId()==R.id.nav_Status){
                    fragment=new StatusFragment();
                }
                else if (item.getItemId()==R.id.nav_calls) {
                   fragment=new CallsFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
            }
        });
    }
}