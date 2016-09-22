package com.ypf.listviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elso on 2016/9/22.
 */
public class FruitActivity extends Activity {
    private ListView fruit_lv;
    private List<Fruit> fruitList = new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        fruit_lv = (ListView)findViewById(R.id.listView3);

        initFruits();
        FruitAdapter adapter = new FruitAdapter(FruitActivity.this, R.layout.fruit_item, fruitList);
        fruit_lv.setAdapter(adapter);
    }

    private void initFruits(){
        for(int i=0; i<=10; i++){
            Fruit test = new Fruit("This is "+i+" furit", R.mipmap.rocket);
            fruitList.add(test);
        }
    }
}
