package com.example.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvVersion;
    ArrayList<AndroidVersion> versionList;
    ArrayAdapter aaVersion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        lvVersion = findViewById(R.id.listView);

        versionList = new ArrayList<>();
        AndroidVersion ver1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion ver2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion ver3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");
        versionList.add(ver1);
        versionList.add(ver2);
        versionList.add(ver3);

        aaVersion = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, versionList);

        lvVersion.setAdapter(aaVersion);


    }

}

