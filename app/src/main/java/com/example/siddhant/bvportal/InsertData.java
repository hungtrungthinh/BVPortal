package com.example.siddhant.bvportal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class InsertData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void InsertNews(View view)
    {
        Intent i = new Intent(this,InsertNews.class);
        startActivity(i);
    }

    public void insertEvents(View view)
    {
        Intent i = new Intent(this,InsertEvent.class);
        startActivity(i);
    }

    public void alterDirectory(View view)
    {
        Intent i = new Intent(this,InsertNumber.class);
        startActivity(i);
    }

   /* public void rNews(View view)
    {
        Intent i = new Intent(this,RemoveNews.class);
        startActivity(i);
    }

    public void rEvent(View view)
    {
        Intent i = new Intent(this,RemoveEvents.class);
        startActivity(i);
    }*/

}
