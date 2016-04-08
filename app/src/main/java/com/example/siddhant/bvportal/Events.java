package com.example.siddhant.bvportal;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;
import android.widget.Toast;

public class Events extends AppCompatActivity {

    int flag=0;
    public void find(int x, int y, int z)
    {
        String str= Integer.toString(x)+'/'+Integer.toString(y)+'/'+Integer.toString(z);
        EventsDbHelper mDbHelper = new EventsDbHelper(this);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        String[] projection = {
                DatabaseForNews.EventsEntry._ID,
                DatabaseForNews.EventsEntry.COLUMN_NAME_DATE,
                DatabaseForNews.EventsEntry.COLUMN_NAME_TITLE,
                DatabaseForNews.EventsEntry.COLUMN_NAME_EVENTS_CONTENT
        };

        String sortOrder = DatabaseForNews.EventsEntry.COLUMN_NAME_DATE + " DESC";

        Cursor c = db.query(
                DatabaseForNews.EventsEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                sortOrder
        );

        //c.moveToFirst();
        String str1;
        for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
        {
            str1 = c.getString(c.getColumnIndexOrThrow(DatabaseForNews.EventsEntry.COLUMN_NAME_DATE));
            if(str1.equals(str))
            {
                flag = 1;
                String ans="";
                ans += c.getString(c.getColumnIndexOrThrow(DatabaseForNews.EventsEntry.COLUMN_NAME_DATE));
                ans += "\n\n";
                ans += c.getString(c.getColumnIndexOrThrow(DatabaseForNews.EventsEntry.COLUMN_NAME_TITLE));
                ans += "\n\n";
                ans += c.getString(c.getColumnIndexOrThrow(DatabaseForNews.EventsEntry.COLUMN_NAME_EVENTS_CONTENT));
                ans += "\n\n\n\n";
                Intent i = new Intent(this,DisplayEvent.class);
                i.putExtra("ANSWER",ans);
                startActivity(i);
            }

        }
        c.close();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        CalendarView cal = (CalendarView)findViewById(R.id.cv);

        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "Selected Date is\n\n"
                                + dayOfMonth + " : " + month + " : " + year,
                        Toast.LENGTH_LONG).show();
                find(dayOfMonth,month,year);
            }
        });
    }
}
