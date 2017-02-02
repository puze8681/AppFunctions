package com.example.parktaejun.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by parktaejun on 2017. 2. 3..
 */

public class ImageAdapter extends ArrayAdapter<String> {

    ImageAdapter(Context context, String items[]) {
        super(context, R.layout.image_layout, items);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater imageinflater = LayoutInflater.from(getContext());
        View view = imageinflater.inflate(R.layout.image_layout, parent, false);
        String item = getItem(position);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        textView.setText(item);
        imageView.setImageResource(R.mipmap.ic_launcher);

        return view;
    }
}
