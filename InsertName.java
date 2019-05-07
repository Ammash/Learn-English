package com.words.english.english100;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class InsertName extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_name);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, "ca-app-pub-4722192482253222~9919100706");
    }

    public void  insertName (View view){
        EditText editText = (EditText) findViewById(R.id.edit);
        final String name = editText.getText().toString();
        Intent intent = new Intent(this , Degree.class);
        intent.putExtra("name",name);
        startActivity(intent);
        finish();
    }
}
