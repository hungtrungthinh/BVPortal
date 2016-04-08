package com.example.siddhant.bvportal;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by siddhant on 9/3/16.
 */
public class RemoveNews {
    NewsDbHelper mDbHelper = new NewsDbHelper(null);
    SQLiteDatabase db = mDbHelper.getWritableDatabase();
    String selection = DatabaseForNews.NewsEntry._ID + " LIKE ?";
    String[] selectionArgs = {String.valueOf(1)};
    //db.delete(TABLE_NAME,selection,selectionArgs);
}
