package com.example.siddhant.bvportal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by siddhant on 8/3/16.
 */
public class NewsDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION=2;
    public static final String DATABASE_NAME = "News.db";

    public NewsDbHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db)
    {
        String sql = "CREATE TABLE " + DatabaseForNews.NewsEntry.TABLE_NAME + " (" +
                        DatabaseForNews.NewsEntry._ID + " INTEGER PRIMARY KEY," +
                        DatabaseForNews.NewsEntry.COLUMN_NAME_DATE + " TEXT" + "," +
                        DatabaseForNews.NewsEntry.COLUMN_NAME_TITLE + " TEXT" + "," +
                        DatabaseForNews.NewsEntry.COLUMN_NAME_NEWS_CONTENT + " TEXT" +
                        ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String str = "DROP TABLE IF EXISTS " + DatabaseForNews.NewsEntry.TABLE_NAME;
        db.execSQL(str);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        onUpgrade(db,oldVersion,newVersion);
    }
}
