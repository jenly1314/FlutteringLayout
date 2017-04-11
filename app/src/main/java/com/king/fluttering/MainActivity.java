package com.king.fluttering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.king.view.flutteringlayout.FlutteringLayout;

public class MainActivity extends AppCompatActivity {

    FlutteringLayout flutteringLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flutteringLayout = (FlutteringLayout) findViewById(R.id.flutteringLayout);

    }

    public void OnClick(View v){
        switch (v.getId()){
            case R.id.iv:
                flutteringLayout.addHeart();
                break;
        }
    }

}
