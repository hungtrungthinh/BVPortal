package com.example.siddhant.bvportal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class InsertNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_number);
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

        PhoneDbHelper mDbHelper = new PhoneDbHelper(this);
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        /*String selection = DatabaseForNews.PhoneEntry._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(1)};
        db.delete(DatabaseForNews.PhoneEntry.TABLE_NAME, selection, selectionArgs);*/

        String name = "Siddhant Shekhar";
        String number = "9871464690";
        ContentValues values = new ContentValues();
        values.put(DatabaseForNews.PhoneEntry.COLUMN_NAME_NAME,name);
        values.put(DatabaseForNews.PhoneEntry.COLUMN_NAME_NUMBER,number);
        long newRowId;
        newRowId = db.insert(
                DatabaseForNews.PhoneEntry.TABLE_NAME,
                null,
                values);

        name = "Aabhas Sinha";
        number = "8130375272";
        values = new ContentValues();
        values.put(DatabaseForNews.PhoneEntry.COLUMN_NAME_NAME,name);
        values.put(DatabaseForNews.PhoneEntry.COLUMN_NAME_NUMBER,number);
        newRowId = db.insert(
                DatabaseForNews.PhoneEntry.TABLE_NAME,
                null,
                values);

        name = "Aditya Naugain";
        number = "9871577456";
        values = new ContentValues();
        values.put(DatabaseForNews.PhoneEntry.COLUMN_NAME_NAME,name);
        values.put(DatabaseForNews.PhoneEntry.COLUMN_NAME_NUMBER,number);
        newRowId = db.insert(
                DatabaseForNews.PhoneEntry.TABLE_NAME,
                null,
                values);
        name = "Rajat Mahey";
        number = "9818412903";
        values = new ContentValues();
        values.put(DatabaseForNews.PhoneEntry.COLUMN_NAME_NAME,name);
        values.put(DatabaseForNews.PhoneEntry.COLUMN_NAME_NUMBER,number);
        newRowId = db.insert(
                DatabaseForNews.PhoneEntry.TABLE_NAME,
                null,
                values);
        name = "Himanshu Tiwari";
        number = "8377885724";
        values = new ContentValues();
        values.put(DatabaseForNews.PhoneEntry.COLUMN_NAME_NAME,name);
        values.put(DatabaseForNews.PhoneEntry.COLUMN_NAME_NUMBER,number);
        newRowId = db.insert(
                DatabaseForNews.PhoneEntry.TABLE_NAME,
                null,
                values);
    }


}
