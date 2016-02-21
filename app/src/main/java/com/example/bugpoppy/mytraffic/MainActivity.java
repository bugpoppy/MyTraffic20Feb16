package com.example.bugpoppy.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

     //button controler
        buttonController();
    }// main method

    private void buttonController() {
       aboutButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //sound effect
               MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.dog);
               mediaPlayer.start();

               //web view
               Intent intent = new Intent(Intent.ACTION_VIEW);
               intent.setData(Uri.parse("https://youtu.be/Jy35oa5oFoY"));
               startActivity(intent);
           }
       });

    } //buttontroller

    private void bindwidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutButton = (Button) findViewById(R.id.button);

    } //bindwidget
}// main class
