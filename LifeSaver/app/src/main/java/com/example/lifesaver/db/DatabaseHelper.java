package com.example.lifesaver.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "life_saver.db";
    private static final int DATABASE_VERSION = 1;


    // COLUMNS OF TABLE SAFETY_PLAN
    public static final String SAFETY_PLAN_TABLE = "SAFETY_PLAN";
    public static final String COLUMN_SAFETY_ID = "SAFETY_ID";
    public static final String COLUMN_SAFETY_RESPONSE = "SAFETY_RESPONSE";


    // COLUMNS OF TABLE 2

    // reason section table columns
    private static final String REASON_COLUMN_SECTION_ID = "REASON_SECTIONS_ID";
    public static final String REASON_COLUMN_SECTION_TITLE = "REASON_SECTIONS_TITLE";
    public static final String REASON_COLUMN_SECTION_ICON = "REASON_SECTIONS_ICON";
    public static final String REASON_TABLE_SECTIONS = "REASON_SECTIONS";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // Create TABLE SAFETY_PLAN
        String createSafetyStatement = "CREATE TABLE " + SAFETY_PLAN_TABLE + " (" + COLUMN_SAFETY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_SAFETY_RESPONSE + " TEXT)";

        db.execSQL(createSafetyStatement);

        // Create TABLE 2

        // reason section table
        String createSectionsReasonQuery = "CREATE TABLE " + REASON_TABLE_SECTIONS + " (" + REASON_COLUMN_SECTION_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + REASON_COLUMN_SECTION_TITLE + " TEXT, " + REASON_COLUMN_SECTION_ICON + " INTEGER)";

        db.execSQL(createSectionsReasonQuery);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }


}
