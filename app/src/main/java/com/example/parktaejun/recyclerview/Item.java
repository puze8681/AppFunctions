package com.example.parktaejun.recyclerview;

/**
 * Created by parktaejun on 2017. 2. 10..
 */

public class Item {
    int image;
    String title;

    int getImage(){
        return this.image;
    }

    String getTitle(){
        return this.title;
    }

    Item(int image, String title){
        this.image = image;
        this.title = title;
    }
}
