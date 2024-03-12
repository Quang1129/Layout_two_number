package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import  android.widget.Button;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText editTextViewA;
    private EditText editTextViewB;

    private Button addButton;
    private Button minusButton;
    private Button multiButton;
    private Button divideButton;

    private ListView listViewHistory;
    private ArrayList<String> arrayList;
    private ArrayAdapter arrayAdapter;

    private Double a;
    private Double b;
    private Double result;

    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        khai báo
        editTextViewA = findViewById(R.id.edit_text_view_a);
        editTextViewB = findViewById(R.id.edit_text_view_b);

        addButton = findViewById(R.id.add_button);
        minusButton = findViewById(R.id.minus_button);
        multiButton = findViewById(R.id.multi_button);
        divideButton = findViewById(R.id.divide_button);

        listViewHistory = findViewById(R.id.list_view_history);
        arrayList = new ArrayList<String>();
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listViewHistory.setAdapter(arrayAdapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextViewA.getText().toString().isEmpty() == false && editTextViewB.getText().toString().isEmpty() == false) {
                    a = Double.parseDouble(editTextViewA.getText().toString());
                    b = Double.parseDouble(editTextViewB.getText().toString());

                    result = a + b;
                    arrayList.add(a + " + " + b + " = " + result);
                    arrayAdapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter both number!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextViewA.getText().toString().isEmpty() == false && editTextViewB.getText().toString().isEmpty() == false) {
                    a = Double.parseDouble(editTextViewA.getText().toString());
                    b = Double.parseDouble(editTextViewB.getText().toString());

                    result = a - b;
                    arrayList.add(a + " - " + b + " = " + result);
                    arrayAdapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter both number!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextViewA.getText().toString().isEmpty() == false && editTextViewB.getText().toString().isEmpty() == false) {
                    a = Double.parseDouble(editTextViewA.getText().toString());
                    b = Double.parseDouble(editTextViewB.getText().toString());

                    result = a * b;
                    arrayList.add(a + " x " + b + " = " + result);
                    arrayAdapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter both number!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextViewA.getText().toString().isEmpty() == false && editTextViewB.getText().toString().isEmpty() == false) {
                    a = Double.parseDouble(editTextViewA.getText().toString());
                    b = Double.parseDouble(editTextViewB.getText().toString());

                    result = a / b;
                    arrayList.add(a + " / " + b + " = " + result);
                    arrayAdapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter both number!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}