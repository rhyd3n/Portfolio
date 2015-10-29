package com.example.n00b.portfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popMoviesApp(View view){
    //to do code
        Context context = getApplicationContext();
        CharSequence text = "This will launch Popular Movies App";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void scoresApp(View view){
        //to do code
        Context context = getApplicationContext();
        CharSequence text = "This will launch Scores App";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void libraryApp(View view){
        //to do code
        Context context = getApplicationContext();
        CharSequence text = "This will launch library App";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void buildApp(View view){
        //to do code
        Context context = getApplicationContext();
        CharSequence text = "This will launch builder App";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void baconReaderApp(View view){
        //to do code
        Context context = getApplicationContext();
        CharSequence text = "This will launch Bacon Reader App";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void myAppToast(View view){
        //this is a pop up dialog function
        Context context = getApplicationContext();
        CharSequence text = "This is Kriz's App";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }
}


