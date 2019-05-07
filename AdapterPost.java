package com.words.english.english100;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterPost extends ArrayAdapter<Post> {
    public AdapterPost(Context context, List<Post> object) {
        super(context, 0,object);
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.post_row,parent,false);
        }
        TextView title = (TextView)convertView.findViewById(R.id.title);
        TextView decription = (TextView)convertView.findViewById(R.id.description);
        TextView count = (TextView)convertView.findViewById(R.id.count);
        TextView speak = (TextView)convertView.findViewById(R.id.speak);
        Post p = getItem(position);
        title.setText(p.getTitle());
        decription.setText(p.getDescriprion());
        count.setText(p.getCount());
        speak.setText(p.getSpeak());
        return convertView ;
    }
}
