package com.example.siddhant.bvportal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class EventsDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION=2;
    public static final String DATABASE_NAME = "Events.db";

    public EventsDbHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db)
    {
        String sql = "CREATE TABLE " + DatabaseForNews.EventsEntry.TABLE_NAME + " (" +
                DatabaseForNews.EventsEntry._ID + " INTEGER PRIMARY KEY," +
                DatabaseForNews.EventsEntry.COLUMN_NAME_DATE + " TEXT" + "," +
                DatabaseForNews.EventsEntry.COLUMN_NAME_TITLE + " TEXT" + "," +
                DatabaseForNews.EventsEntry.COLUMN_NAME_EVENTS_CONTENT + " TEXT" +
                ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String str = "DROP TABLE IF EXISTS " + DatabaseForNews.EventsEntry.TABLE_NAME;
        db.execSQL(str);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        onUpgrade(db,oldVersion,newVersion);
    }
}
