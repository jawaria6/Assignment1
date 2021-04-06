package com.example.mcsf19m006_assignment1;

import androidx.annotation.NonNull;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;

public  class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

Toolbar toolbar;
    NavigationView navigationView;
   private DrawerLayout drawer;
 /*


*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       toolbar=findViewById(R.id.toolbar);
         setSupportActionBar(toolbar);
        drawer=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle =new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {

            drawer.closeDrawer(GravityCompat.START);
            //Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_SHORT);

        }
        else
        {
            super.onBackPressed();
            //Toast.makeText(getApplicationContext(),"End",Toast.LENGTH_SHORT);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_animation:
                Intent intent=new Intent(this,EngAlphabets.class);
                startActivity(intent);
                break;
            case R.id.nav_cpoem:
                Intent intent2=new Intent(this,Poem.class);
                startActivity(intent2);
                break;
            case R.id.nav_Piano:
                Intent intent3=new Intent(this,AnimalPiano.class);
                startActivity(intent3);
                break;

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


   public void Move(View view) {
        Intent intent=new Intent(this,EngAlphabets.class);
        startActivity(intent);
    }
    public void MoveToPiano(View view) {
        Intent intent=new Intent(this,AnimalPiano.class);
        startActivity(intent);
    }

    public void MoveToPoem(View view) {
        Intent intent=new Intent(this,Poem.class);
        startActivity(intent);
    }
}