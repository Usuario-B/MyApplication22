package com.example.paco.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    final String ETIQUETA = "ETIQUETA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( ETIQUETA, "En onCreate()");
    }
    @Override
    protected void onStart( ) { super.onStart(); Log.d( ETIQUETA, "En onStart()" ); System.out.println("ETIQUETA.....................");  }
    @Override
    protected void onRestart( ) {super.onRestart(); Log.d( ETIQUETA, "En onRestart()" ); }
    @Override
    protected void onResume( ) { super.onResume();Log.d( ETIQUETA, "En onResume()" ); }
    @Override
    protected void onPause( ) { super.onPause(); Log.d( ETIQUETA, "En onPause()" ); }
    @Override
    protected void onStop( ) { super.onStop();Log.d( ETIQUETA, "En onStop()" ); }
    @Override
    protected void onDestroy( ) { super.onDestroy(); Log.d( ETIQUETA, "En onDestroy()" ); }
}
