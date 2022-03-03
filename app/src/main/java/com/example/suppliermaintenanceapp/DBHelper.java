package com.example.suppliermaintenanceapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private static final String NAME = "TravelExpertsSqlLite.db";
    private static final int VERSION = 5;

    public DBHelper(@Nullable Context context) {super(context, NAME, null, VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Suppliers (" +
                "SupplierId INTEGER NOT NULL PRIMARY KEY," +
                "SupName VARCHAR(255)" +
                ")";
        db.execSQL(sql);
        sql = "insert into Suppliers values (60, 'BLUE SKY PARASAILING')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (69, 'NEW CONCEPTS - CANADA')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (80, 'CHAT / TRAVELINE')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (100, 'AVILA TOURS INC.')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (317, 'BLYTH & COMPANY TRAVEL')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (323, 'COMPAGNIA ITALIANA TURISM')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (796, 'CYPRUS AIRWAYS LTD')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (828, 'DER TRAVEL SERVICE LTD')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (845, 'DISCOVER THE WORLD MARKET')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (908, 'ELITE ORIENT TOURS INC.')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1005, 'ENCORE CRUISES')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1028, 'EUROP-AUTO-VACANCES/HOLIDAYS')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1040, 'EXECUTIVE SUITES')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1205, 'GOLDMAN MARKETING')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1406, 'EUROCRUISES INC.')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1416, 'THE HOLIDAY NETWORK')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1425, 'HOLLAND AMERICA LINE WESTOURS')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1542, 'INSIGHT VACATIONS CANADA')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1620, 'INTAIR VACATIONS')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1634, 'ISLANDS IN THE SUN CRUISE')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1685, 'GOWAY TRAVEL LTD')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1713, 'JETPACIFIC HOLIDAYS INC')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1766, 'KLM ROYAL DUTCH AIRLINES')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1859, 'LOTUS HOLIDAYS')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (1918, 'MARKET SQUARE TOURS')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (2140, 'NAGEL TOURS LTD')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (2386, 'PAVLIK TRAVEL GROUP')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (2466, 'PLANET FRANCE/PLANET EURO')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (2588, 'UNIQUE VACATIONS (CANADA)')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (2592, 'ESPRIT/SERVICENTRE HOLIDAYS')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (2827, 'SOUTH WIND TOURS LTD.')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (2938, 'SUN & LEISURE TRAVEL CORP')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (2987, 'TOURCAN VACATIONS INC')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (2998, 'ALIOTOURS')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (3119, 'MEDIAN AVIATION RESOURCES')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (3212, 'TREK HOLIDAYS')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (3273, 'MARKETING AHEAD')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (3376, 'MARTINAIR SERVICES')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (3549, 'BONANZA HOLIDAYS')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (3576, 'BLUE DANUBE HOLIDAYS')";
        db.execSQL(sql);
        sql = "insert into Suppliers values (3589, 'G.A.P. ADVENTURES INC.')";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table Suppliers");
        onCreate(db);
    }

}
