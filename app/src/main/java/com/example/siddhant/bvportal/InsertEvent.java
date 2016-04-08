package com.example.siddhant.bvportal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class InsertEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_event);
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
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        EventsDbHelper mDbHelper = new EventsDbHelper(this);
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        /*String selection = DatabaseForNews.EventsEntry._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(1)};
        db.delete(DatabaseForNews.EventsEntry.TABLE_NAME, selection, selectionArgs);*/

        String date = "04/06/2016";
        String title = "INTERNATIONAL CONFERENCE ON GLOBAL ENVIRONMENTAL ISSUES";
        String content = "The National Green Tribunal, New Delhi is organizing an international conference on global environmental issues during 4-6th March 2016.";
        ContentValues values = new ContentValues();
        values.put(DatabaseForNews.EventsEntry.COLUMN_NAME_DATE,date);
        values.put(DatabaseForNews.EventsEntry.COLUMN_NAME_EVENTS_CONTENT,content);
        values.put(DatabaseForNews.EventsEntry.COLUMN_NAME_TITLE,title);

        long newRowId;
        newRowId = db.insert(
                DatabaseForNews.EventsEntry.TABLE_NAME,
                null,
                values);

        date = "8/3/2016";
        title = "INTERNATIONAL WOMEN'S DAY";
        content = "the Directorate of Students' Welfare is organizing an interaction session of the Delhi Police with the students/faculty/officers/officials of the University on the occasion of International Women's Day on 8th March, 2016 at 4:00 P.M in the \"D Block Seminar Hall\" of the college.\n";
        values = new ContentValues();
        values.put(DatabaseForNews.EventsEntry.COLUMN_NAME_DATE,date);
        values.put(DatabaseForNews.EventsEntry.COLUMN_NAME_EVENTS_CONTENT,content);
        values.put(DatabaseForNews.EventsEntry.COLUMN_NAME_TITLE,title);

        newRowId = db.insert(
                DatabaseForNews.EventsEntry.TABLE_NAME,
                null,
                values);

        date = "09/03/2016";
        title = "BOOK BANK DAY";
        content = "Starting from today, all the students can return and receive books from the book bank for the next 2 weeks";
        values = new ContentValues();
        values.put(DatabaseForNews.EventsEntry.COLUMN_NAME_DATE,date);
        values.put(DatabaseForNews.EventsEntry.COLUMN_NAME_EVENTS_CONTENT,content);
        values.put(DatabaseForNews.EventsEntry.COLUMN_NAME_TITLE,title);

        newRowId = db.insert(
                DatabaseForNews.EventsEntry.TABLE_NAME,
                null,
                values);

        date = "20/03/2016";
        title = "ALUMNI MEET";
        content = "The college is organizing an Alumni Meet on 20th March, 2016 from 11:00 A.M to 4:00 P.M (Venue: D Block Seminar Hall). All affiliated members are invited for the same.";
        values = new ContentValues();
        values.put(DatabaseForNews.EventsEntry.COLUMN_NAME_DATE,date);
        values.put(DatabaseForNews.EventsEntry.COLUMN_NAME_EVENTS_CONTENT,content);
        values.put(DatabaseForNews.EventsEntry.COLUMN_NAME_TITLE,title);

        newRowId = db.insert(
                DatabaseForNews.EventsEntry.TABLE_NAME,
                null,
                values);

    }
}
