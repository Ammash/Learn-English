package com.words.english.english100;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.words.english.english100.R;

import java.util.ArrayList;
import java.util.Scanner;

import Quizes.Quiz2;

public class Quiz extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, "ca-app-pub-4722192482253222~9919100706");
    }

    public void choose(View view) {
        TextView textView = (TextView)findViewById(R.id.result);
        String btn ;
        btn = ((Button)view).getText().toString();
        if (btn.equals("أيضا")){
            textView.setText("أجابة صحيحة");
            Intent intent = new Intent(this,Quiz2.class);
            startActivity(intent);
            finish();
        }else {
            textView.setText("أجابة خاطئة");
        }



    }
}
