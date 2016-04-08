package com.example.siddhant.bvportal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Directory extends AppCompatActivity {

    Cursor c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        PhoneDbHelper mDbHelper = new PhoneDbHelper(this);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        String[] projection = {
                DatabaseForNews.PhoneEntry._ID,
                DatabaseForNews.PhoneEntry.COLUMN_NAME_NAME,
                DatabaseForNews.PhoneEntry.COLUMN_NAME_NUMBER,
        };

        String sortOrder = DatabaseForNews.PhoneEntry.COLUMN_NAME_NAME + " DESC";

        c = db.query(
                DatabaseForNews.PhoneEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                sortOrder
        );
    }

    public void find(View view)
    {
        EditText ed = (EditText) findViewById(R.id.et);
        String str = ed.getText().toString();

        String name;
        String number = "NO NUMBER";
        for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
            name = c.getString(c.getColumnIndexOrThrow(DatabaseForNews.PhoneEntry.COLUMN_NAME_NAME));
            if (str.equals(name)) {
                number = c.getString(c.getColumnIndexOrThrow(DatabaseForNews.PhoneEntry.COLUMN_NAME_NUMBER));
                break;
            }
        }
        TextView text;
        text = (TextView) findViewById(R.id.nameD);
        text.setText(str);
        text = (TextView) findViewById(R.id.numberD);
        text.setText(number);

    }
}
