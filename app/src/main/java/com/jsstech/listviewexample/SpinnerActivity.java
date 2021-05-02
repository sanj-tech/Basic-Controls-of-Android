package com.jsstech.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spinners;
    String[] course={"web design","Java","O.S","Android"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinners=findViewById(R.id.spinner1);

        ArrayAdapter adapter=new ArrayAdapter(SpinnerActivity.this,R.layout.support_simple_spinner_dropdown_item,course);
        spinners.setAdapter(adapter);

        spinners.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView,View view,int i,long l) {
                Toast.makeText(SpinnerActivity.this," You are selected  :" +course[i],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}