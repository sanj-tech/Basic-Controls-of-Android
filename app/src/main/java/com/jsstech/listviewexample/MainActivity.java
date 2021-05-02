package com.jsstech.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends AppCompatActivity {
   private ListView listView;
   Button btAuto;
   private AutoCompleteTextView autoCompleteTextView;
   String[] name={"item1","item2","item3","item4","item5","item6","items7","item8","item9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btAuto=findViewById(R.id.showAuto);


        listView=findViewById(R.id.list_View);



        btAuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,AutoCompleteTextViewActivity.class);
                startActivity(i);
            }
        });

        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,name);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view,int i,long l) {

                Toast.makeText(MainActivity.this,"you are selected.." +name[i],Toast.LENGTH_SHORT).show();


            }
        });

    }
}