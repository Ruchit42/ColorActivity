package edu.temple.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsAdapter extends BaseAdapter {

    Context context;
    ArrayList colors;

    public ColorsAdapter(Context context, ArrayList<String> colors){
        this.context = context;
        this.colors = colors ;
    }
    @Override
    public int getCount() {
        return colors.size();
    }

    @Override
    public Object getItem(int position) {
        return colors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView textView  =new TextView  (context);
        textView.setPadding(50, 50, 50, 50);
        textView.setTextSize(25);
            if (position == 0) {
                textView.setBackgroundColor(Color.RED);
            } else if (position == 1) {
                textView.setBackgroundColor(Color.BLUE);
            } else if (position ==2){
                textView.setBackgroundColor(Color.GREEN);
            }else if (position ==3 ){
                textView.setBackgroundColor(Color.MAGENTA);
            } else if (position ==4 ){
                textView.setBackgroundColor(Color.GRAY);
            }else if (position ==5){
                textView.setBackgroundColor(Color.WHITE);
            }else if (position == 6 ){
                textView.setBackgroundColor(Color.YELLOW);
            } else if (position ==7 ){
                textView.setBackgroundColor(Color.CYAN);
            }
            textView.setText(getItem(position).toString());

        return textView;
    }
}
