package com.words.english.english100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class Tips extends AppCompatActivity {
    private ListView listView ;
    private ArrayList<PostTips> posts;
    private AdapterPostTips adapterPost;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        listView = (ListView)findViewById(R.id.list1);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, "ca-app-pub-4722192482253222~9919100706");
        posts = new ArrayList<>();
        posts.add(new PostTips("1","كتابة المفردات في مفكّرة بشكل مرتّب."));
        posts.add(new PostTips("2","إعادة النظر إلى الكلمات مرة أخرى بعد 24 ساعةً، ثم بعد أسبوع،"));
        posts.add(new PostTips("3","قراءة الكلمات مراراً وتكراراً، فذلك يساعد على تذكرها بشكل أسهل."));
        posts.add(new PostTips("4","استخدام الكلمات الجديدة، فالشخص بحاجة إلى استخدام الكلمة الجديدة حوالي عشر مرّات لكي يتم حفظها."));
        posts.add(new PostTips("5","ممارسة ألعاب ألغاز الكلمات، مثل لعبة الكلمات المتقاطعة، ولعبة إعادة ترتيب الأحرف لتكوين كلمات (بالانجليزية: Anagrams)، ولعبة البحث عن الكلمات."));
        posts.add(new PostTips("6","إنشاء بطاقات مكتوب عليها الكلمات الجديدة، وأخذها لقراءتها في الحافلة أو عند انتظار صديق."));
        posts.add(new PostTips("7","يفضّل تعلّم الكلمات مع صديق، لأن ذلك يجعل التّعلم ممتعاً وأسهل."));
        posts.add(new PostTips("8","تعلم طريقة استخدام القاموس، و معرفة ما هي المعلومات التي تكون بجوار الكلمة الموجودة في القاموس، ومعرفة أنواع القواميس المختلفة."));
        posts.add(new PostTips("9","تعلّم كلمات جديدة كلّ يوم، فثمانية كلمات هو عدد مناسب بشكل يومي. "));
        adapterPost = new AdapterPostTips(this,posts);
        listView.setAdapter(adapterPost);
    }
}
