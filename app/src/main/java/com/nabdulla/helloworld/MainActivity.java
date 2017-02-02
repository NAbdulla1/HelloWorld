package com.nabdulla.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    int inc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView);
        btn = (Button)findViewById(R.id.button);
        inc = 0;
    }

    public void btnClick(View v){
        inc += 10;
        tv.setText("" + inc);
        inc %= 10;
    }
}
