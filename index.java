package com.words.english.english100;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        ImageView image = (ImageView)findViewById(R.id.icon);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        image.startAnimation(animation1);
        //text-------------------------------------------------------------------
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/JF Flat regular.ttf");

        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade);
        TextView textView = (TextView) findViewById(R.id.txt1);
        textView.setTypeface(myTypeface);
        textView.setText("أهم 100 كلمة بالانجليزي");
        textView.startAnimation(animation2);


        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(index.this,Menu.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        thread.start();
    }
}
