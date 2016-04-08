package com.example.siddhant.bvportal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class PhoneDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION=2;
    public static final String DATABASE_NAME = "Events.db";

    public PhoneDbHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db)
    {
        String sql = "CREATE TABLE " + DatabaseForNews.PhoneEntry.TABLE_NAME + " (" +
                DatabaseForNews.PhoneEntry._ID + " INTEGER PRIMARY KEY," +
                DatabaseForNews.PhoneEntry.COLUMN_NAME_NAME + " TEXT" + "," +
                DatabaseForNews.PhoneEntry.COLUMN_NAME_NUMBER + " TEXT"  +
                ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String str = "DROP TABLE IF EXISTS " + DatabaseForNews.PhoneEntry.TABLE_NAME;
        db.execSQL(str);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        onUpgrade(db,oldVersion,newVersion);
    }
}

