package com.ypf.listviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Elso on 2016/9/20.
 */
public class SimpleAdapterActivity extends Activity {
    private ListView simpleAdapterView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpleadapter);

        simpleAdapterView = (ListView)findViewById(R.id.listView2);
        int images[] = {R.mipmap.rocket, R.mipmap.rocket, R.mipmap.rocket, R.mipmap.rocket, R.mipmap.rocket};
        List<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>();

        String[] from = new String[]{"itemImage", "itemTitle", "itemText"};
        int[] to = new int[]{R.id.itemImage, R.id.itemTitle, R.id.itemText};

        //创建动态数据
        for(int i=0; i<5; i++){
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("itemImage", images[i]);
            map.put("itemTitle", "This is Title"+i);
            map.put("itemText", "this is Text"+i);
            data.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.activity_simpleadapter, from, to);
        simpleAdapterView.setAdapter(adapter);
    }
}
