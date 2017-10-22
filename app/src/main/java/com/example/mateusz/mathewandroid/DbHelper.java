package com.example.mateusz.mathewandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by Mateusz on 2017-10-22.
 */

public final class DbHelper {
    private DbHelper() {}

    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";

        private static final String SQL_CREATE_ENTRIES = "CREATE TABLE " + FeedEntry.TABLE_NAME + " (" + FeedEntry._ID + "INTEGER PRIMARY KEY," + FeedEntry.COLUMN_NAME_TITLE + " TEXT," + FeedEntry.COLUMN_NAME_SUBTITLE + " TEXT)";
        private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS" + FeedEntry.TABLE_NAME;
    }
}
