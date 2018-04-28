package assign.college.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class FrontActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        Button breakingNews = (Button) findViewById(R.id.breaking_button);
        CardView cnbcCardView = (CardView) findViewById(R.id.cnbc_card_view);
        CardView theHinduCardView = (CardView) findViewById(R.id.the_hindu_card_view);
        CardView googleIndiaCardView = (CardView) findViewById(R.id.google_india_card_view);
        CardView toiCardView = (CardView) findViewById(R.id.toi_card_view);
        CardView bbcCardView = (CardView) findViewById(R.id.bbc_card_view);
        CardView ignCardView = (CardView) findViewById(R.id.ign_card_view);
        CardView wallStreetCardView = (CardView) findViewById(R.id.wall_street_card_view);
        CardView hackerNewsCardView = (CardView) findViewById(R.id.hacker_news_text_view);
        CardView techCrunchCardView = (CardView) findViewById(R.id.tech_crunch_card_view);
        CardView bbcSportCardView = (CardView) findViewById(R.id.bbc_sport_card_view);
        CardView mtvNewsCardView = (CardView) findViewById(R.id.mtv_news_card_view);
        CardView financialTimesCardView = (CardView) findViewById(R.id.financial_times_card_view);
        CardView newyorkMagazineCardView = (CardView) findViewById(R.id.new_york_magazine_card_view);
        CardView timeCardView = (CardView) findViewById(R.id.time_card_view);
        CardView bloombergCardView = (CardView) findViewById(R.id.bloomberg_card_view);
        CardView buzzfeedCardView = (CardView) findViewById(R.id.buzzfeed_card_view);
        CardView techRadarCardView = (CardView) findViewById(R.id.tech_radar_text_view);
        CardView theVergeCardView = (CardView) findViewById(R.id.the_verge_card_view);
        CardView espnCardView = (CardView) findViewById(R.id.espn_card_view);
        CardView theSportBibleCardView = (CardView) findViewById(R.id.the_sport_bible_card_view);
        CardView foxSportsCardView = (CardView) findViewById(R.id.fox_sport_card_view);
        CardView espnCricketCardView = (CardView) findViewById(R.id.espn_cricket_card_view);


        breakingNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?country=in&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                intent.putExtra("name", "Anshul");
                startActivity(intent);
            }
        });


        cnbcCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=cnbc&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        theHinduCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=the-hindu&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        googleIndiaCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=google-news-in&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        toiCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=the-times-of-india&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        bbcCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        wallStreetCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=the-wall-street-journal&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        ignCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=ign&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        hackerNewsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=hacker-news&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        techCrunchCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        bbcSportCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=bbc-sport&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        mtvNewsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=mtv-news&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        financialTimesCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=financial-times&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        newyorkMagazineCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=new-york-magazine&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        timeCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=time&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        bloombergCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=bloomberg&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        buzzfeedCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=buzzfeed&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        techRadarCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=techradar&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        theVergeCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=the-verge&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        espnCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=espn&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        theSportBibleCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=the-sport-bible&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        foxSportsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=fox-sports&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });

        espnCricketCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                intent.putExtra("url", "https://newsapi.org/v2/top-headlines?sources=espn-cric-info&apiKey=590b8b622fc944bfacf8c3afdf5dd01d");
                startActivity(intent);
            }
        });


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.settings_menu, menu);
        return true;
    }
}
