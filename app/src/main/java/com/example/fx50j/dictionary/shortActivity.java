package com.example.fx50j.dictionary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by FX50J on 2016/5/7.
 */
public class shortActivity extends MainActivity {

    private Button bt;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.short_layout);
        bt= (Button)findViewById(R.id.bt_short);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(shortActivity.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}
