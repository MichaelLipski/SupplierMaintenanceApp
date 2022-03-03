package com.example.suppliermaintenanceapp;

import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DataSource {
    private Context context;
    private SQLiteDatabase db;
    private DBHelper helper;

    public DataSource(Context context) {
        this.context = context;
        helper = new DBHelper(context);
        db = helper.getWritableDatabase();
    }

    public Supplier getSupplier(int supplierId)
    {
        String sql = "select * from Suppliers where SupplierId=?";
        String [] args = { supplierId + "" };
        Cursor cursor = db.rawQuery(sql, args);
        cursor.moveToNext();
        return new Supplier(cursor.getInt(0), cursor.getString(1));
    }

    public ArrayList<Supplier> getAllSuppliers() {
        ArrayList<Supplier> list = new ArrayList<>();
        String [] columns = {"SupplierId", "SupName"};
        Cursor cursor = db.query("Suppliers", columns, null, null, null, null, null);
        while (cursor.moveToNext())
        {
            list.add(new Supplier(cursor.getInt(0), cursor.getString(1)));
        }
        return list;
    }

    public int updateSupplier(Supplier supplier) {
        ContentValues cv = new ContentValues();
        cv.put("SupplierId", supplier.getSupplierId());
        cv.put("SupName", supplier.getSupplierName());
        String [] args = { supplier.getSupplierId() + ""};
        String where = "SupplierId=?";
        return db.update("Suppliers", cv, where, args);
    }

    public long insertSupplier(Supplier supplier) {
        ContentValues cv = new ContentValues();
        cv.put("SupplierId", supplier.getSupplierId());
        cv.put("SupName", supplier.getSupplierName());
        return db.insert("Suppliers", null, cv);
    }

    public int deleteSupplier(int supplierId) {
        String [] args = { supplierId + "" };
        String where = "SupplierId=?";
        return db.delete("Suppliers", where, args);
    }

}
