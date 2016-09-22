package com.ypf.listviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ListView testListView;
    private Button simpleAdapter;
    private Button fruit;
    String[] data = {"test1", "test2", "test3"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testListView = (ListView)findViewById(R.id.listView1);
        simpleAdapter = (Button)findViewById(R.id.simple_bt);
        fruit = (Button)findViewById(R.id.fruit_bt);
        //adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        adapter = new ArrayAdapter<String>(this, R.layout.test_item, data);
        testListView.setAdapter(adapter);
        simpleAdapter.setOnClickListener(this);
        fruit.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.simple_bt:
               Intent intent1 = new Intent(MainActivity.this, SimpleAdapterActivity.class);
               startActivity(intent1);
               break;
           case R.id.fruit_bt:
               Intent intent2 = new Intent(MainActivity.this, FruitActivity.class);
               startActivity(intent2);
               break;
           default:
               break;
       }
    }
}
