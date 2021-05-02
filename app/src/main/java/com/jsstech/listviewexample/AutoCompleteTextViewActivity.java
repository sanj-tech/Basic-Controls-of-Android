package com.jsstech.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class AutoCompleteTextViewActivity extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;
    Button multiAutoCompleteTextV;
    String[] name={"item1","item2","item3","item4","item5","item6","items7","item8","item9"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);


        autoCompleteTextView=findViewById(R.id.autoComplete_TextView);
        multiAutoCompleteTextV=findViewById(R.id.multi_auto);

        multiAutoCompleteTextV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AutoCompleteTextViewActivity.this,MultiAutoCTV.class);
                startActivity(intent);
            }
        });


        ArrayAdapter arrayautocomlete=new ArrayAdapter(AutoCompleteTextViewActivity.this,R.layout.support_simple_spinner_dropdown_item,name);
        autoCompleteTextView.setAdapter(arrayautocomlete);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view,int i,long l) {
                Toast.makeText(AutoCompleteTextViewActivity.this,"You are selected  :" +name[i],Toast.LENGTH_LONG).show();
            }
        });


    }
}