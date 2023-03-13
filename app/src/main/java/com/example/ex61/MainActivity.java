package com.example.ex61;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = (ToggleButton) findViewById(R.id.tb);
        sw = (Switch) findViewById(R.id.sw);
    }

    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }

    public void changeSit(View v){
        if(tb.isChecked() && sw.isChecked()){
            setActivityBackgroundColor(Color.parseColor("#2D2727"));
        }else if (!(tb.isChecked()) && sw.isChecked()){
            setActivityBackgroundColor(Color.parseColor("#413543"));
        }else if ((tb.isChecked()) && !(sw.isChecked())){
            setActivityBackgroundColor(Color.parseColor("#8F43EE"));
        }else if (!(tb.isChecked()) && !(sw.isChecked())){
            setActivityBackgroundColor(Color.parseColor("#F0EB8D"));
        }
    }
}