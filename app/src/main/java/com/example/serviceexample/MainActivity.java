package com.example.serviceexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startService, stopService;
    Button bf1,bf2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bf1=findViewById(R.id.bt_bf1);
        bf2=findViewById(R.id.bt_bf2);

        bf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragment = new BlankFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.add(R.id.fragment1,fragment,"");
                ft.commit();

            }
        });
        bf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment1 = new BlankFragment2();
                FragmentManager fragmentManager1 = getSupportFragmentManager();
                FragmentTransaction ft1 = fragmentManager1.beginTransaction();
                ft1.add(R.id.fragment2, fragment1, "");
                ft1.commit();
            }
        });



//        startService=findViewById(R.id.bt_start);
//        stopService=findViewById(R.id.bt_stop);

//        startService.setOnClickListener(new View.OnClickListener() {
//          @Override
//           public void onClick(View view) {
//               Intent intent = new Intent(MainActivity.this, ServiceDemo.class);
//               startService(intent);
//            }
//        });
//            stopService.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View view){
//                    Intent intent = new Intent(MainActivity.this, ServiceDemo.class);
//                    stopService(intent);
//
//                }
//
//        });
    }
}