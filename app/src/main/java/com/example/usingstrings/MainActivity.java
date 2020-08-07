package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    TextView txtMsg2= findViewById(R.id.TvMsg2);
    txtMsg2.setText(R.string.Msg2);

        Log.i("Lifecycle","onCreate() Invoked");

    }
    public void onStart()
    {
        super.onStart();
        Log.i("Lifecycle","onStart() Invoked");
    }

    public void onRestart()
    {
        super.onRestart();
        Log.i("Lifecycle","onRestart() Invoked");
    }

    public void onResume()
    {
        super.onResume();
        Log.i("Lifecycle","onResume() Invoked");
    }


}