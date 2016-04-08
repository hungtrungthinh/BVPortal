package com.example.siddhant.bvportal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class InsertNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        NewsDbHelper mDbHelper = new NewsDbHelper(this);
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        /*String selection = DatabaseForNews.NewsEntry._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(1)};
        db.delete(DatabaseForNews.NewsEntry.TABLE_NAME,selection,selectionArgs);*/

        String date = "01/01/2016";
        String title = "REVISION OF COMPLAINT FORM";
        String content = " The complaint form for Air Conditioners, refrigerators, photocopier machines and furniture items has been revised. Therefore, all departments/schools are hereby requested to provide their complaints, if any, on the revised complaint form from now onwards and submit the same to General Administration Branch.";
        ContentValues values = new ContentValues();
        values.put(DatabaseForNews.NewsEntry.COLUMN_NAME_DATE,date);
        values.put(DatabaseForNews.NewsEntry.COLUMN_NAME_NEWS_CONTENT,content);
        values.put(DatabaseForNews.NewsEntry.COLUMN_NAME_TITLE,title);

        long newRowId;
        newRowId = db.insert(
                DatabaseForNews.NewsEntry.TABLE_NAME,
                null,
                values);

        date = "01/03/2016";
        title = "REVISED FEE STRUCTURE";
        content = "It has been brought to the notice of the University that some institutions affiliated to the GGSIPU require a revised fee structure. The University is in the process of notifying it, meanwhile no college should initiate any action for charging of enhanced fees from the students.";
        values = new ContentValues();
        values.put(DatabaseForNews.NewsEntry.COLUMN_NAME_DATE,date);
        values.put(DatabaseForNews.NewsEntry.COLUMN_NAME_NEWS_CONTENT,content);
        values.put(DatabaseForNews.NewsEntry.COLUMN_NAME_TITLE,title);

        newRowId = db.insert(
                DatabaseForNews.NewsEntry.TABLE_NAME,
                null,
                values);

        date = "02/03/2016";
        title = "THE UNIVERSITY ACADEMIC AUDIT CELL";
        content = "The University Academic Audit Cell is to play a supportive / proactive role in improving the quality and standard of the education in the affiliated institutes.";
        values = new ContentValues();
        values.put(DatabaseForNews.NewsEntry.COLUMN_NAME_DATE,date);
        values.put(DatabaseForNews.NewsEntry.COLUMN_NAME_NEWS_CONTENT,content);
        values.put(DatabaseForNews.NewsEntry.COLUMN_NAME_TITLE,title);

        newRowId = db.insert(
                DatabaseForNews.NewsEntry.TABLE_NAME,
                null,
                values);

    }

}
