package com.ypf.listviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView testListView;
    private Button simpleAdapter;
    String[] data = {"test1", "test2", "test3"};
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testListView = (ListView)findViewById(R.id.listView1);
        simpleAdapter = (Button)findViewById(R.id.simple_bt);

        //adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        adapter = new ArrayAdapter<String>(this, R.layout.test_item, data);
        testListView.setAdapter(adapter);

        simpleAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SimpleAdapterActivity.class);
                startActivity(intent);
            }
        });

    }
}
