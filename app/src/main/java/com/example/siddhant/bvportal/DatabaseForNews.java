package com.example.siddhant.bvportal;

import android.provider.BaseColumns;

// database for all entries, not only for news

public class DatabaseForNews {
    public DatabaseForNews(){}

    public static abstract class NewsEntry implements BaseColumns {
        public static final String TABLE_NAME = "news";
        public static final String COLUMN_NAME_DATE = "newsdate";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_NEWS_CONTENT = "newscontent";
    }

    public static abstract class EventsEntry implements BaseColumns{
        public static final String TABLE_NAME = "events";
        public static final String COLUMN_NAME_DATE = "eventdate";
        public static final String COLUMN_NAME_TITLE = "eventtitle";
        public static final String COLUMN_NAME_EVENTS_CONTENT = "eventdetails";
    }

    public static abstract class PhoneEntry implements BaseColumns{
        public static final String TABLE_NAME = "phone";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_NUMBER = "number";
    }
}

