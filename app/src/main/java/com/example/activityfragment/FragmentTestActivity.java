package com.example.activityfragment;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class FragmentTestActivity extends AppCompatActivity {
    private final static String TAG = "FragmentTestActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Activity--onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Activity--onStart()");
    }
}
