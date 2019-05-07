package com.words.english.english100;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.Locale;

public class ChangeWords extends AppCompatActivity {
    ArrayList<Post> item ;
    int i ;
    String title ;
    TextToSpeech tts;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_words);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, "ca-app-pub-4722192482253222~9919100706");
        //-------
        Intent intent = getIntent();
        String count = intent.getStringExtra("count");
        i = Integer.parseInt(count) ;
        Bundle bundle = getIntent().getExtras();
         item = (ArrayList<Post>) bundle.getSerializable("test");
        TextView textView = (TextView)findViewById(R.id.word);
        textView.setText(item.get(i).getTitle());
        TextView textView2 = (TextView)findViewById(R.id.translate);
        textView2.setText(item.get(i).getDescriprion());
        TextView textView3 = (TextView)findViewById(R.id.speak);
        textView3.setText(item.get(i).getSpeak());
        //----- sound
        title =item.get(i).getTitle() ;
    }

    public void increseNumber (View view){
        if(i < item.size()-1){
            ++i;
            TextView textView = (TextView)findViewById(R.id.word);
            textView.setText(item.get(i).getTitle());
            TextView textView2 = (TextView)findViewById(R.id.translate);
            textView2.setText(item.get(i).getDescriprion());
            TextView textView3 = (TextView)findViewById(R.id.speak);
            textView3.setText(item.get(i).getSpeak());
            title =item.get(i).getTitle() ;
        }else {
            i = 0 ;
            TextView textView = (TextView)findViewById(R.id.word);
            textView.setText(item.get(i).getTitle());
            TextView textView2 = (TextView)findViewById(R.id.translate);
            textView2.setText(item.get(i).getDescriprion());
            TextView textView3 = (TextView)findViewById(R.id.speak);
            textView3.setText(item.get(i).getSpeak());
            title =item.get(i).getTitle() ;
        }


    }

    public void decreseNumber (View view){
        if (i >0){
            --i;
            TextView textView = (TextView)findViewById(R.id.word);
            textView.setText(item.get(i).getTitle());
            TextView textView2 = (TextView)findViewById(R.id.translate);
            textView2.setText(item.get(i).getDescriprion());
            TextView textView3 = (TextView)findViewById(R.id.speak);
            textView3.setText(item.get(i).getSpeak());
            title =item.get(i).getTitle() ;
        }else {
            i =  item.size()-1;
            TextView textView = (TextView)findViewById(R.id.word);
            textView.setText(item.get(i).getTitle());
            TextView textView2 = (TextView)findViewById(R.id.translate);
            textView2.setText(item.get(i).getDescriprion());
            TextView textView3 = (TextView)findViewById(R.id.speak);
            textView3.setText(item.get(i).getSpeak());
            title =item.get(i).getTitle() ;
        }


    }

    public void soundWord (View view){
        tts=new TextToSpeech(ChangeWords.this, new TextToSpeech.OnInitListener() {

            @Override
            public void onInit(int status) {
                // TODO Auto-generated method stub
                if(status == TextToSpeech.SUCCESS){
                    int result=tts.setLanguage(Locale.US);
                    if(result==TextToSpeech.LANG_MISSING_DATA ||
                            result==TextToSpeech.LANG_NOT_SUPPORTED){
                        Log.e("error", "This Language is not supported");
                        tts.speak("hello", TextToSpeech.QUEUE_FLUSH, null);
                    }
                    else{
                        tts.speak(title, TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
                else
                    Log.e("error", "Initilization Failed!");
            }
        });
    }

}
