package assign.college.news;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getName();
    private static final String REQUEST_URL = "https://newsapi.org/v2/top-headlines?country=in&apiKey=590b8b622fc944bfacf8c3afdf5dd01d";
    private ItemAdapter mAdapter;


    private class asyncTask extends AsyncTask<String, Void, ArrayList<Item>> {

        @Override
        protected ArrayList<Item> doInBackground(String... strings) {
            ArrayList<Item> result = QueryUtils.extractNews(strings[0]);

            return result;
        }

        @Override
        protected void onPostExecute(ArrayList<Item> items) {
            mAdapter.clear();
            if (items != null && !items.isEmpty()) {
                mAdapter.addAll(items);
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String REQUEST_URL = getIntent().getExtras().getString("url");
        asyncTask task = new asyncTask();
        task.execute(REQUEST_URL);
        mAdapter = new ItemAdapter(this, new ArrayList<Item>());
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item currentItem = mAdapter.getItem(position);
                Uri url = Uri.parse(currentItem.getUrl());

                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(websiteIntent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.settings_menu, menu);
        return true;
    }
}


