package com.example.myapplicationstate;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String msg = "Android : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "onCreate");
    }


    /** Chamado quando a activity está prestes
     a tornar-se visível. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "onStart");
    }


    /** Chamado quando a activity tornou-se
     visível.*/
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "onResume");
    }

    /** Chamado quando uma outra activity
     está tomando foco. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "onPause");
    }

    /** Chamado quando a activity não é
     mais visível.*/
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "onStop");
    }

    /** Chamado antes da activity ser
     destruída.*/
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "onDestroy()");
    }
}
