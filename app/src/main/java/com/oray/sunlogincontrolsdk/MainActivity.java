package com.oray.sunlogincontrolsdk;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.oray.controlsdk.TestFunction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.get_function).setOnClickListener(v -> {
            Toast.makeText(this, TestFunction.getTestFunction(), Toast.LENGTH_SHORT).show();
        });
    }
}
