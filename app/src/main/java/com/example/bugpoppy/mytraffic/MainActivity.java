package com.example.bugpoppy.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        //ListView controller
        listViewController();

    }// main method

    private void listViewController() {

        //create ListView
        //Type1
        final int[] iconIts = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10,
                R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_15,
                R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20};

        //Type2
        final String[] titlStrings = new String[20];
        titlStrings[0] = "หัวข้อหลักที่ 1";
        titlStrings[1] = "หัวข้อหลักที่ 2";
        titlStrings[2] = "หัวข้อหลักที่ 3";
        titlStrings[3] = "หัวข้อหลักที่ 4";
        titlStrings[4] = "หัวข้อหลักที่ 5";
        titlStrings[5] = "หัวข้อหลักที่ 6";
        titlStrings[6] = "หัวข้อหลักที่ 7";
        titlStrings[7] = "หัวข้อหลักที่ 8";
        titlStrings[8] = "หัวข้อหลักที่ 9";
        titlStrings[9] = "หัวข้อหลักที่ 10";
        titlStrings[10] = "หัวข้อหลักที่ 11";
        titlStrings[11] = "หัวข้อหลักที่ 12";
        titlStrings[12] = "หัวข้อหลักที่ 13";
        titlStrings[13] = "หัวข้อหลักที่ 14";
        titlStrings[14] = "หัวข้อหลักที่ 15";
        titlStrings[15] = "หัวข้อหลักที่ 16";
        titlStrings[16] = "หัวข้อหลักที่ 17";
        titlStrings[17] = "หัวข้อหลักที่ 18";
        titlStrings[18] = "หัวข้อหลักที่ 19";
        titlStrings[19] = "หัวข้อหลักที่ 20";

        //Type3
        String[] detailshStrings = getResources().getStringArray(R.array.detail_short);

        //Sent Value to Adapter
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, iconIts, titlStrings, detailshStrings);
        trafficListView.setAdapter(myAdapter);

        //ListView Active
        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);

                intent.putExtra("Title", titlStrings);
                intent.putExtra("Image", iconIts);
                intent.putExtra("Index", position);

                startActivity(intent);
            }
        });
    }


    private void buttonController() {
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sound effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.dog);
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
