package assign.college.news;

/**
 * Created by ansh0 on 21-03-2018.
 */

public class Item {
    public String mtitle;
    public String mdescription;
    public String mauthor;
    public String mUrl;
    public String mdateTime;


    public Item(String title, String description, String author, String imageUrl, String dateTime)
    {
        mtitle = title;
        mdescription = description;
        mauthor = author;
        mUrl = imageUrl;
        mdateTime = dateTime;
    }

    public String getTitle()
    {
        return mtitle;
    }

    public String getDescription()
    {
        return mdescription;
    }

    public String getAuthor()
    {
        return mauthor;
    }

    public String getUrl()
    {
        return mUrl;
    }
    public String getdateTime()
    {
        return mdateTime;
    }
}
