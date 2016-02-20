package com.example.bugpoppy.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

//Explicit

    private ListView trafficListView;
    private Button aboutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget คือการผูกตัวแปล
        bindwidget();

    }// main method

    private void bindwidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutButton = findViewById(R.id.button);

    } //bindwidget
}// main class
