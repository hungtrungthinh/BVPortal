package com.example.siddhant.bvportal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class News extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        NewsDbHelper mDbHelper = new NewsDbHelper(this);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        String[] projection = {
                DatabaseForNews.NewsEntry._ID,
                DatabaseForNews.NewsEntry.COLUMN_NAME_DATE,
                DatabaseForNews.NewsEntry.COLUMN_NAME_TITLE,
                DatabaseForNews.NewsEntry.COLUMN_NAME_NEWS_CONTENT
        };

        String sortOrder = DatabaseForNews.NewsEntry.COLUMN_NAME_DATE + " DESC";

        Cursor c = db.query(
                DatabaseForNews.NewsEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                sortOrder
        );

        //c.moveToFirst();
        String str="";
        for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
        {
                str += c.getString(c.getColumnIndexOrThrow(DatabaseForNews.NewsEntry.COLUMN_NAME_DATE));
                str += "\n\n";
                str += c.getString(c.getColumnIndexOrThrow(DatabaseForNews.NewsEntry.COLUMN_NAME_TITLE));
                str += "\n\n";
                str += c.getString(c.getColumnIndexOrThrow(DatabaseForNews.NewsEntry.COLUMN_NAME_NEWS_CONTENT));
                str += "\n\n\n\n";
        }
        c.close();
        //if(itemId==1)
          //  Toast.makeText(getApplicationContext(),"Hello World",Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(),(char)itemId,Toast.LENGTH_LONG).show();

        TextView text = (TextView)findViewById(R.id.tv);
        text.setTypeface(null, Typeface.BOLD);
        text.setText(str);
    }
}