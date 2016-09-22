package com.ypf.listviewdemo;

/**
 * Created by Elso on 2016/9/22.
 */
public class Fruit {
    private  String name;
    private  int imageID;
    public Fruit(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName() {
        return name;
    }
    public int getImageID() {
        return imageID;
    }
}
