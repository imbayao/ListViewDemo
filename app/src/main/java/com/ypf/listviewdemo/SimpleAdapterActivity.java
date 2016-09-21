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

    int images[] = {R.mipmap.rocket, R.mipmap.rocket, R.mipmap.rocket, R.mipmap.rocket, R.mipmap.rocket};
    List<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>();

    String[] from = new String[]{"itemImage", "itemTitle", "itemText"}; //与动态数组中的Key对应
    int[] to = new int[]{R.id.itemImage, R.id.itemTitle, R.id.itemText};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpleadapter);

        simpleAdapterView = (ListView)findViewById(R.id.listView2);

        //创建动态数据
        for(int i=0; i<5; i++){
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("itemImage", images[i]);
            map.put("itemTitle", "This is Title"+i);
            map.put("itemText", "this is Text"+i);
            data.add(map);
        }

        //从动态数据data中，取出form数组Key对应的value的值，填充到to数组中对应的控件中
        SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.simpleadapter_item, from, to);
        simpleAdapterView.setAdapter(adapter);
    }
}
