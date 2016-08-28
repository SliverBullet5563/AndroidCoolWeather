package com.vmt.androidcoolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by SilverBullet on 2016/8/28.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

        /*
        * Province表建表语句
        */
    public static final String CREAT_PROVINCE = "create table Province("
            + "id integer primary key autoincrement,"
            + "province_name text,"
            + "province_code text)";
        /*
        *   city表
        */
    public static final String CREAT_CITY = "create table City("
            + "id integer primary key autoincrement, "
            + "city_name text, "
            + "city_code text, "
            + "province_id integer)";

        /*
        *   country表
        */
    public static final String CREATE_COUNTRY = "create table Country"
                + "id integer primary key autoincrement, "
                + "country_name text, "
                + "country_code text, "
                + "city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAT_CITY);
        db.execSQL(CREATE_COUNTRY);
        db.execSQL(CREAT_PROVINCE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
