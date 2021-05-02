package com.jsstech.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

public class MultiAutoCTV extends AppCompatActivity {
private MultiAutoCompleteTextView multiAutoCompleteTextView;
private Button displayMenuOption;


String[] message={"apple","banana","grapes","beetroot","guaua","orange","appricot","Balsam Apple","Bayberry"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_auto_c_t_v);



        displayMenuOption=findViewById(R.id.menu_ex);
        displayMenuOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MultiAutoCTV.this,MenuExample.class);
                startActivity(intent);
            }
        });

        multiAutoCompleteTextView=findViewById(R.id.multiAuto_CompleteTextView);

        ArrayAdapter arrayAdapter=new ArrayAdapter(MultiAutoCTV.this,R.layout.support_simple_spinner_dropdown_item,message);
      multiAutoCompleteTextView.setAdapter(arrayAdapter);

      multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());



    }
}