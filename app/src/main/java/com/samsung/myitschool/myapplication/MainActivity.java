package com.samsung.myitschool.myapplication;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View v) {
        // test
        TextView tv = findViewById(R.id.textView4);
        tv.setText("Hello world!");
        tv.setTextColor(Color.BLUE);
        ConstraintLayout r = findViewById(R.id.root);
        r.setBackgroundColor(Color.parseColor("#ff0000"));

    }

}
