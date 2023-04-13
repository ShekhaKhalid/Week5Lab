package com.example.week5lab;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String CUSTOMER_TABLE = "CUSTOMER_TABLE";
    public static final String column_ID = "ID";
    public static final String column_CUSTOMER_NAME = "CUSTOMER_NAME";
    public static final String column_CUSTOMER_AGE = "CUSTOMER_AGE";
    public static final String column_ACTIVE_CUSTOMER = "ACTIVE_CUSTOMER ";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "customer.db", null, 1);
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTableStatement = "CREATE TABLE " + CUSTOMER_TABLE + "(" + column_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + column_CUSTOMER_NAME + " TEXT, " + column_CUSTOMER_AGE + " INTEGER, " + column_ACTIVE_CUSTOMER + "BOOLEAN";
        sqLiteDatabase.execSQL(createTableStatement);

    }

    public boolean addOne(customerModel cm){
        SQLiteDatabase db= getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(column_ID, cm.getID());
        cv.put(column_CUSTOMER_NAME, cm.getName());
        cv.put(column_CUSTOMER_AGE, cm.getAge());
        cv.put(column_ACTIVE_CUSTOMER, cm.isActive());
        db.insert(CUSTOMER_TABLE, null, cv);
        long insert= db.insert(CUSTOMER_TABLE, null, cv);
        if(insert==-1)
            return false;
        boolean b = true;
        return b;

    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
