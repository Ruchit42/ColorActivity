package edu.temple.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 Spinner spinner1;
 View layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         spinner1 = findViewById(R.id.spinner);

        layout = findViewById(R.id.layOut);
         ArrayList<String> colors = new ArrayList<String>();
         colors.add("Red");
         colors.add("Blue");
         colors.add("Green");
         colors.add("Pink");
        colors.add("Gray");
        colors.add("White");
        colors.add("Yellow");
        colors.add("Cyan");

        final BaseAdapter adapter = new ColorsAdapter(MainActivity.this,colors);
        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String p = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, p, Toast.LENGTH_SHORT).show();
                view.setBackgroundColor(Color.WHITE);

               // layout.setBackgroundColor();
                if (p.matches("Red")) {

                    layout.setBackgroundColor(Color.RED);

                } else if (p.matches("Blue")) {
                    layout.setBackgroundColor(Color.BLUE);
                } else if (p.matches("Green")) {
                    layout.setBackgroundColor(Color.GREEN);
                } else if (p.matches("Pink")) {
                    layout.setBackgroundColor(Color.MAGENTA);
                }else if (p.matches("Gray")) {
                    layout.setBackgroundColor(Color.GRAY);
            } else if (p.matches("White")){
                    layout.setBackgroundColor(Color.WHITE);
                }else if (p.matches("Yellow")){
                    layout.setBackgroundColor(Color.YELLOW);
                }else if (p.matches("Cyan")){
                    layout.setBackgroundColor(Color.CYAN);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}