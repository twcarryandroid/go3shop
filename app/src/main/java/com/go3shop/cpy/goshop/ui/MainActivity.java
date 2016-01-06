package com.go3shop.cpy.goshop.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.go3shop.cpy.goshop.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        if (true) {
            Intent s = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(s);
        } else if (false) {
            Intent s = new Intent(MainActivity.this, OrderActivity.class);
            startActivity(s);
        }
    }
}