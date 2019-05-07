package com.words.english.english100;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterPostTips extends ArrayAdapter<PostTips> {
    public AdapterPostTips(Context context, List<PostTips> object) {
        super(context, 0,object);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.post_row_tips,parent,false);
        }
        TextView title = (TextView)convertView.findViewById(R.id.title);
        TextView count = (TextView)convertView.findViewById(R.id.count);
        PostTips p = getItem(position);
        title.setText(p.getTitle());
        count.setText(p.getCount());
        return convertView ;
    }
}