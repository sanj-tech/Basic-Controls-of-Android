package com.jsstech.listviewexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MenuExample extends AppCompatActivity {

private Button spinnerBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_example);
        spinnerBt=findViewById(R.id.bt_spinner);
        spinnerBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuExample.this,SpinnerActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_item,menu);

     //  getMenuInflater().inflate(R.menu.menu_item,menu);
       return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this,"item 1 clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.item2:
                Toast.makeText(this,"item 2 clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.item3:
                Toast.makeText(this,"item 3 clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.item4:
                Toast.makeText(this,"item 4 clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.item5:
                Toast.makeText(this,"item 5 clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.subMenu:
                Toast.makeText(this,"sub menu clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.subMenu1:
                Toast.makeText(this,"sub menu 1 clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.itemoption:
                Toast.makeText(this,"searchclicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.itemoption1:
                Toast.makeText(this,"smile clicked",Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }
}