package com.words.english.english100;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.io.Serializable;
import java.util.ArrayList;

public class Words extends AppCompatActivity {
    private ListView listView ;
    private ArrayList<Post> finalPosts;
    private ArrayList<Post> posts;
    private AdapterPost adapterPost;
    private ArrayList<String>arrayList;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        listView = (ListView)findViewById(R.id.list1);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, "ca-app-pub-4722192482253222~9919100706");
        posts = new ArrayList<>();
        posts.add(new Post("a","أداة تعريف","اي"));
        posts.add(new Post("about","حول","اباوت"));
        posts.add(new Post("all","الكل","او-ل"));
        posts.add(new Post("also","أيضا","اولسو"));
        posts.add(new Post("and","و","اند"));
        posts.add(new Post("as","مثل","أّز"));
        posts.add(new Post("at","في","أّت"));
        posts.add(new Post("be","يكون","بي"));
        posts.add(new Post("because","لان","بيكوز"));
        posts.add(new Post("but","لكن","بت"));
        posts.add(new Post("by","بواسطة","باي"));
        posts.add(new Post("can","يستطيع","كان"));
        posts.add(new Post("come","تأتي","كم"));
        posts.add(new Post("could","استطاع","كود"));
        posts.add(new Post("day","يوم","داي"));
        posts.add(new Post("do","فعل","دو"));
        posts.add(new Post("even","حتى في","ايفن"));
        posts.add(new Post("find","تجد","فايند"));
        posts.add(new Post("first","أول","فيرست"));
        posts.add(new Post("for","من , على , عن","فور"));
        posts.add(new Post("from","من عند","فروم"));
        posts.add(new Post("get","احصل على","قت"));
        posts.add(new Post("give","يعطي","قيف"));
        posts.add(new Post("go","اذهب","قو"));
        posts.add(new Post("have","يملك","هاف"));
        posts.add(new Post("he","هو","هي"));
        posts.add(new Post("her","لها","هر"));
        posts.add(new Post("here","هنا","هير"));
        posts.add(new Post("him","له","هـ-م"));
        posts.add(new Post("his","خاصته","هز"));
        posts.add(new Post("how","ماذا","هاو"));
        posts.add(new Post("i","انا","اّي"));
        posts.add(new Post("if","إذا","اف"));
        posts.add(new Post("in","في","ان"));
        posts.add(new Post("into","في الداخل","انتو"));
        posts.add(new Post("it","هذا لغير العاقل","ات"));
        posts.add(new Post("its","انها لغير العاقل","اتس"));
        posts.add(new Post("just","مجرد","جست"));
        posts.add(new Post("know","أعرف","نوى"));
        posts.add(new Post("like","مثل","لايك"));
        posts.add(new Post("look","نظرة","لوك"));
        posts.add(new Post("make","يصنع","ميك"));
        posts.add(new Post("man","رجل","مان"));
        posts.add(new Post("many","كثير","مني"));
        posts.add(new Post("me","أنا","مي"));
        posts.add(new Post("more","أكثر من","مور"));
        posts.add(new Post("my","لي","ماي"));
        posts.add(new Post("new","جديد","نيو"));
        posts.add(new Post("no","لا","نو"));
        posts.add(new Post("not","ليس","نّت"));
        posts.add(new Post("now","الان","ناو"));
        posts.add(new Post("of","من","اوف"));
        posts.add(new Post("on","على","اون"));
        posts.add(new Post("one","واحد","ون"));
        posts.add(new Post("only","فقط","اونلي"));
        posts.add(new Post("or","أو","اور"));
        posts.add(new Post("other","أخر","اذر"));
        posts.add(new Post("our","لنا","اور"));
        posts.add(new Post("out","خارج","اوت"));
        posts.add(new Post("people","ناس","بيبل"));
        posts.add(new Post("say","قل","سيّ"));
        posts.add(new Post("see","نرا","سي"));
        posts.add(new Post("she","هي","شي"));
        posts.add(new Post("so","وبالتالي","سو"));
        posts.add(new Post("some","بعض","سم"));
        posts.add(new Post("take","يأخذ","تيك"));
        posts.add(new Post("tell","يخبر","تل"));
        posts.add(new Post("than","من","ذان"));
        posts.add(new Post("that","أن","ذات"));
        posts.add(new Post("the","ال","ذا"));
        posts.add(new Post("their","هم","ذير"));
        posts.add(new Post("them","معهم","ذيم"));
        posts.add(new Post("then","ثم","ذين"));
        posts.add(new Post("there","هناك","ذير"));
        posts.add(new Post("these","هؤلاء","ذيس"));
        posts.add(new Post("they","هم","ذي"));
        posts.add(new Post("thing","شيء","ثينق"));
        posts.add(new Post("think","يفكر","ثينك"));
        posts.add(new Post("this","هذا","ذس"));
        posts.add(new Post("those","أولئك","ذوس"));
        posts.add(new Post("time","وقت","تايم"));
        posts.add(new Post("to","الى","تو"));
        posts.add(new Post("two","اثنان","تو"));
        posts.add(new Post("up","فوق","اب"));
        posts.add(new Post("use","استعمال","يوز"));
        posts.add(new Post("very","جدا","فيري"));
        posts.add(new Post("want","تريد","وونت"));
        posts.add(new Post("way","طريق","واي"));
        posts.add(new Post("we","نحن","وي"));
        posts.add(new Post("well","حسنا","ويل"));
        posts.add(new Post("what","ماذا","وات"));
        posts.add(new Post("when","متى","وين"));
        posts.add(new Post("which","التي","ويج"));
        posts.add(new Post("who","من الذي","هوو"));
        posts.add(new Post("will","سوف","ويل"));
        posts.add(new Post("with","مع","ويذ"));
        posts.add(new Post("would","سيكون","وود"));
        posts.add(new Post("year","عام","اير"));
        posts.add(new Post("you","أنت","يو"));
        posts.add(new Post("your","لك","يور"));
        arrayList = new ArrayList<>();
        for (int i = 0; i < posts.size(); i++) {
            arrayList.add(1+i+"");
        }
        finalPosts = new ArrayList<>();
        for (int i = 0; i < posts.size(); i++) {
            finalPosts.add(new Post(posts.get(i).getTitle(),posts.get(i).getDescriprion(),arrayList.get(i),posts.get(i).getSpeak()));
        }
        adapterPost = new AdapterPost(this,finalPosts);
        listView.setAdapter(adapterPost);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Words.this,ChangeWords.class);
                intent.putExtra("title",posts.get(position).getTitle());
                intent.putExtra("des",posts.get(position).getDescriprion());
                intent.putExtra("speak",posts.get(position).getSpeak());
                intent.putExtra("count",position+"");
                Bundle bundle=new Bundle();
                bundle.putSerializable("test",posts);
                intent.putExtras(bundle);
                startActivity(intent);



            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout relativeLayout;
        relativeLayout =(RelativeLayout)findViewById(R.id.relativelayout);
        switch (item.getItemId()){
            case R.id.id_search :
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.healthycolor));
                break;
            case R.id.id_share :
                Intent intent = new Intent(this,ChangeWords.class);
                intent.putExtra("title",posts.get(0).getTitle());
                intent.putExtra("des",posts.get(0).getDescriprion());
                intent.putExtra("speak",posts.get(0).getSpeak());
                intent.putExtra("count",0+"");
                Bundle bundle=new Bundle();
                bundle.putSerializable("test",posts);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
        }


        return true;
    }
}
