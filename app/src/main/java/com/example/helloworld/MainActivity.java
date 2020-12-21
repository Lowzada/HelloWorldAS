package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Used for debugging messages");
        Log.e(TAG, "Used for error messages");
        Log.i(TAG, "Used for information");
        Log.v(TAG, "Used for verbose messages");
        Log.w(TAG, "Used for warnings");
        Log.wtf(TAG, "Used to report a condition that should never have happened");


    }

    protected void onStart() {
        super.onStart();

    }

    protected void onStop() {
        super.onStop();

    }

    protected void onDestroy() {
        super.onDestroy();

    }

    protected void onPause() {
        super.onPause();

    }

    protected void onResume() {
        super.onResume();

    }

    protected void onRestart() {
        super.onRestart();
    }
}