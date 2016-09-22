package com.ypf.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Elso on 2016/9/22.
 */
public class FruitAdapter extends ArrayAdapter<Fruit> {
    //定义资源ID
    private int resourceId;
    //重写构造函数
    public FruitAdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        //传入的资源ID赋值给resourceId
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, null); //根据传入资源ID解析布局文件
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView)view.findViewById(R.id.furitImage);
            viewHolder.fruitName = (TextView)view.findViewById(R.id.fruitName);
            view.setTag(viewHolder);    //将viewHolder存储在View中
        }else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag(); //重新获取viewHolder
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageID());
        viewHolder.fruitName.setText(fruit.getName());
        //返回View
        return view;
    }
    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }
}
