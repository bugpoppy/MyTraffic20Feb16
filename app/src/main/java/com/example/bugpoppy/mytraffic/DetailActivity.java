package com.example.bugpoppy.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView trafficImageView;
    private Button preButton, backButton, nextButton;
    private int[] iconInts;
    private String[] titleStrings, detaillongStrings;
    private int myIndexAnInt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //bind widget
        bindWidget();

        //Show View
        showView();





    }//main method

    private void showView() {

        //Receive Value From Intent
        titleStrings = getIntent().getStringArrayExtra("Title");
        iconInts = getIntent().getIntArrayExtra("Image");
        myIndexAnInt = getIntent().getIntExtra("Index", 0);

        detaillongStrings = getResources().getStringArray(R.array.detail_long);

        changVilew(myIndexAnInt);
    }

    private void changVilew(int myIndexAnInt) {
        titleTextView.setText(titleStrings[myIndexAnInt]);
        trafficImageView.setImageResource(iconInts[myIndexAnInt]);
        detailTextView.setText(detaillongStrings[myIndexAnInt]);
    }

    private void bindWidget() {

        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);
        preButton = (Button) findViewById(R.id.button2);
        backButton = (Button) findViewById(R.id.button3);
        nextButton = (Button) findViewById(R.id.button4);

    }

}//main class

