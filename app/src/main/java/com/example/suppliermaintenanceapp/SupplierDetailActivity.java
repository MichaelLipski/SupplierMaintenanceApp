package com.example.suppliermaintenanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SupplierDetailActivity extends AppCompatActivity {
    EditText etSupplierId, etSupplierName;
    Button btnSave, btnDelete;
    DataSource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier_detail);

        etSupplierId = findViewById(R.id.etSupplierId);
        etSupplierName = findViewById(R.id.etSupplierName);
        btnSave = findViewById(R.id.btnSave);
        btnDelete = findViewById(R.id.btnDelete);

        Intent intent = getIntent();
        String mode = intent.getStringExtra("mode");
        dataSource = new DataSource(this);
        if (mode.equals("update"))
        {
            Supplier supplier = (Supplier) intent.getSerializableExtra("supplier");
            etSupplierId.setText(supplier.getSupplierId() + "");
            etSupplierName.setText(supplier.getSupplierName());
        }

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mode.equals("update"))
                {
                    Supplier supplier = new Supplier(Integer.parseInt(etSupplierId.getText().toString()), etSupplierName.getText().toString());
                    dataSource.updateSupplier(supplier);
                }
                else
                {
                    Supplier supplier = new Supplier(Integer.parseInt(etSupplierId.getText().toString()),
                            etSupplierName.getText().toString());
                    dataSource.insertSupplier(supplier);
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mode.equals("update"))
                {
                    dataSource.deleteSupplier(Integer.parseInt(etSupplierId.getText().toString()));
                }
            }
        });

    }
}