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

        final BaseAdapter adapter = new ColorsAdapter(MainActivity.this,colors);
        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String p = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, p, Toast.LENGTH_LONG).show();
                view.setBackgroundColor(Color.WHITE);
                layout.setBackgroundColor(Color.MAGENTA);
                if (p.matches("Red")) {
                    Toast.makeText(MainActivity.this, "Matches with red", Toast.LENGTH_LONG).show();

                } else if (p.matches("Orange")) {

                } //else if (color.matches("Yellow")) {
//                    myLayout.setBackgroundColor(Color.RED);
//                } else if (color.matches("Green")) {
//                    myLayout.setBackgroundColor(Color.RED);
//                }else if (color.matches("Blue")) {
//                    myLayout.setBackgroundColor(Color.RED);
//            }
               // myLayout.setBackgroundColor(Color.RED);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}