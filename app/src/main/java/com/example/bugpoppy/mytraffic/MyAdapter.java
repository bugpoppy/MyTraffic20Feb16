package com.example.bugpoppy.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 21/2/2559.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context context;
    private int[] iconInts;
    private String[] titleStrings, detailshortStrings;

    public MyAdapter(Context context, int[] iconInts, String[] titleStrings, String[] detailshortStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailshortStrings = detailshortStrings;
    }  //constructor

    @Override
    public int getCount() {
        return titleStrings.length;//ทำให้นับจำนวนตามที่มี
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.my_listview, parent,false);

        //about Icon เกี่ยวกับรูปภาพ
        ImageView iconImageView = (ImageView) view.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[position]);

        //about Title เกี่ยวกับไตเติล
        TextView titTextView = (TextView) view.findViewById(R.id.textView2);
        titTextView.setText(titleStrings[position]);

        //about Datail
        TextView detailTextView = (TextView) view.findViewById(R.id.textView3);
        detailTextView.setText(detailshortStrings[position]);

        return view;
    }
}//main class
