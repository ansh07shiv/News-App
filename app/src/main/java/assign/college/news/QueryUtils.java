package assign.college.news;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by ansh0 on 21-03-2018.
 */

public class QueryUtils {

    //private static final String SAMPLE_JSON_RESPONSE ="{\"status\":\"ok\",\"totalResults\":10,\"articles\":[{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Austin bombings suspect dead - US media\",\"description\":\"The suspect in a series of parcel bombings in Texas is dead after a police operation, media say.\",\"url\":\"http://www.bbc.co.uk/news/world-us-canada-43484386\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/7A23/production/_97176213_breaking_news_bigger.png\",\"publishedAt\":\"2018-03-21T08:49:37Z\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"'Dozens dead' in Kabul suicide attack\",\"description\":\"At least 26 people were killed in a suspected suicide bomb attack near a shrine in the Afghan capital.\",\"url\":\"http://www.bbc.co.uk/news/world-asia-43484206\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/7A23/production/_97176213_breaking_news_bigger.png\",\"publishedAt\":\"2018-03-21T08:28:46Z\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Kidnapped schoolgirls 'freed in Nigeria'\",\"description\":\"Nigerian village stunned as many of 110 schoolgirls kidnapped by Islamist militants in February are freed - reports\",\"url\":\"http://www.bbc.co.uk/news/world-africa-43484146\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/7A23/production/_97176213_breaking_news_bigger.png\",\"publishedAt\":\"2018-03-21T08:14:08Z\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Sanctions did not spur talks, says N Korea\",\"description\":\"The editorial is state media's first response since Trump accepted an invitation to meet Kim Jong-un.\",\"url\":\"http://www.bbc.co.uk/news/world-asia-43482051\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/13330/production/_100504687_gettyimages-929484888.jpg\",\"publishedAt\":\"2018-03-21T06:07:46Z\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Facebook data row academic 'is scapegoat'\",\"description\":\"Dr Aleksandr Kogan says he is \\\"stunned\\\" by allegations made against him by Facebook and Cambridge Analytica.\",\"url\":\"http://www.bbc.co.uk/news/uk-43480978\",\"urlToImage\":\"https://ichef-1.bbci.co.uk/news/1024/branded_news/11C24/production/_100504727_hi045659043.jpg\",\"publishedAt\":\"2018-03-21T06:00:12Z\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Israel hit Syria 'nuclear reactor' in 2007\",\"description\":\"The Israeli military formally admits the strike for the first time as documents are declassified.\",\"url\":\"http://www.bbc.co.uk/news/world-middle-east-43481803\",\"urlToImage\":\"https://ichef-1.bbci.co.uk/news/1024/branded_news/592E/production/_100503822_529cfaef-f972-4190-ba89-280c8893fde1.jpg\",\"publishedAt\":\"2018-03-21T05:35:16Z\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Ocean plastic could treble in decade\",\"description\":\"But there are opportunities to cash in on the \\\"ocean economy\\\", a major report for the UK government says.\",\"url\":\"http://www.bbc.co.uk/news/science-environment-43477233\",\"urlToImage\":\"https://ichef-1.bbci.co.uk/news/1024/branded_news/107A1/production/_100498476_mediaitem100498475.jpg\",\"publishedAt\":\"2018-03-21T01:21:51Z\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Living under siege with eight children\",\"description\":\"As Syrian government forces bombard rebel-held Eastern Ghouta, a mother of eight shares her experiences.\",\"url\":\"http://www.bbc.co.uk/news/world-middle-east-43477372\",\"urlToImage\":\"https://ichef-1.bbci.co.uk/news/1024/branded_news/B86A/production/_100501274_p061rt0c.jpg\",\"publishedAt\":\"2018-03-21T00:43:38Z\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"US officer charged in unarmed woman 'murder'\",\"description\":\"Justine Damond's death in Minneapolis caused an outcry in both the US and Australia.\",\"url\":\"http://www.bbc.co.uk/news/world-australia-43480859\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/102B6/production/_100503266_f1ecffb5-57dd-464a-9f08-328d1aa5d2e3.jpg\",\"publishedAt\":\"2018-03-21T00:20:15Z\"},{\"source\":{\"id\":\"bbc-news\",\"name\":\"BBC News\"},\"author\":\"BBC News\",\"title\":\"Family of Down's boy sues Boy Scouts\",\"description\":\"The boy's father accuses the organisation of discrimination against those with mental disabilities.\",\"url\":\"http://www.bbc.co.uk/news/world-us-canada-43469886\",\"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/B0A3/production/_100491254_gettyimages-482584828.jpg\",\"publishedAt\":\"2018-03-20T12:47:31Z\"}]}";

    private QueryUtils()
    {

    }

    private static String makeHttpRequest(URL url) throws IOException
    {
        String jsonResponse = "";

        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);

            urlConnection.connect();
            inputStream = urlConnection.getInputStream();
            jsonResponse = readFromStream(inputStream);

        }catch (Exception e)
        {
            Log.d(TAG, "makeHttpRequest: Exception" + e);
        }finally {
            if (urlConnection != null)
            {
                urlConnection.disconnect();
            }
            if (inputStream != null)
            {
                inputStream.close();
            }
        }
        return jsonResponse;
    }

    private static String readFromStream(InputStream inputStream) throws IOException
    {
        StringBuilder output = new StringBuilder();
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            while (line != null) {
                output.append(line);
                line = reader.readLine();
            }
        }
        return output.toString();
    }

    private static URL createUrl(String stringUrl) {
        URL url = null;
        try {
            url = new URL(stringUrl);
        } catch (MalformedURLException e) {
            Log.e(TAG, "Problem building the URL ", e);
        }
        return url;
    }

    public static ArrayList<Item> extractNews(String requestUrl)
    {
        URL url = createUrl(requestUrl);
        String jsonResponse = null;
        try{
            jsonResponse = makeHttpRequest(url);
        }catch (Exception e)
        {
            Log.d(TAG, "extract News: "+e);
        }

        ArrayList<Item> news = extractFeaturesFromJason(jsonResponse);
        return news;
    }

    public static ArrayList<Item> extractFeaturesFromJason(String jsonResponse)
    {
        ArrayList<Item> news = new ArrayList<>();

        try
        {
            JSONObject root = new JSONObject(jsonResponse);

            JSONArray articles = root.optJSONArray("articles");
            for(int i=0; i<articles.length(); i++)
            {
                JSONObject newsFeatures = articles.optJSONObject(i);
                JSONObject sourceObject = newsFeatures.optJSONObject("source");

                String author = sourceObject.getString("name");
                Log.d(TAG, "Author:  "+author);
                String title = newsFeatures.getString("title");
                String description = newsFeatures.getString("description");
                String Url = newsFeatures.getString("url");
                Log.d("Image URl", Url);

                String dateTime = newsFeatures.getString("publishedAt");
                String date = dateTime.substring(0, 9);
                String time = dateTime.substring(11,18);
                String finalDate = date + "  " + time;

                news.add(new Item(title, description, author, Url, finalDate));

            }
        } catch (JSONException e) {
            Log.e("QueryUtils", "Problem Parsing the Data");
        }
        return news;
    }

}
