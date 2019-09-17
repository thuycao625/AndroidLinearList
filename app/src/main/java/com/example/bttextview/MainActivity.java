package com.example.bttextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] classname = new String[] {"Nam","Hoa","Thuy","Quynh","Mai"};
        LinearLayout main = findViewById(R.id.main_linear);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT,1f);
        for (int i = 0; i < classname.length; i++) {

            LinearLayout linear = new LinearLayout(MainActivity.this);
            linear.setOrientation(LinearLayout.HORIZONTAL);

            TextView tv = new TextView(MainActivity.this);
            Button bt = new Button(MainActivity.this);
            bt.setText("+");
            tv.setText(classname[i]);
            tv.setLayoutParams(params);

            linear.addView(tv);
            linear.addView(bt);
            main.addView(linear);

        }
    }
}