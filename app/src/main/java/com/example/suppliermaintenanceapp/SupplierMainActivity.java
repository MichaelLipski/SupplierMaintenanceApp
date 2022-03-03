package com.example.suppliermaintenanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class SupplierMainActivity extends AppCompatActivity {
    DataSource dataSource;
    ListView lvSuppliers;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier_main);

        lvSuppliers = findViewById(R.id.lvSuppliers);
        btnAdd = findViewById(R.id.btnAdd);
        dataSource = new DataSource(this);

        lvSuppliers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), SupplierDetailActivity.class);
                intent.putExtra("supplier", (Supplier)lvSuppliers.getAdapter().getItem(position));
                intent.putExtra("mode", "update");
                startActivity(intent);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SupplierDetailActivity.class);
                intent.putExtra("mode", "insert");
                startActivity(intent);
            }
        });
        loadData();
    }

    private void loadData() {
        ArrayAdapter<Supplier> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataSource.getAllSuppliers());
        lvSuppliers.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        loadData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadData();
    }
}