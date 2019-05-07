package com.words.english.english100;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Menu extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void toWords (View view){
        Intent intent = new Intent(this,Words.class);
        startActivity(intent);
    }
    public void toQuiz (View view){
        Intent intent = new Intent(this,Quiz.class);
        startActivity(intent);
    }
    public void toTips (View view){
        Intent intent = new Intent(this,Tips.class);
        startActivity(intent);
    }
    public void toAboutMe (View view){
        Intent intent = new Intent(this,AboutMe.class);
        startActivity(intent);
    }
    public void toSpeakWords (View view){
        Intent intent = new Intent(this,SpeakWords.class);
        startActivity(intent);
    }
}
