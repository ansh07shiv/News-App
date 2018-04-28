package assign.college.news;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URL;
import java.util.ArrayList;

/**
 * Created by ansh0 on 21-03-2018.
 */

public class ItemAdapter extends ArrayAdapter<Item> {


    public ItemAdapter(Activity context, ArrayList<Item> words)
    {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final Item currentItem = getItem(position);

        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                   R.layout.list_item, parent, false
            );
        }


        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentItem.getTitle());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentItem.getDescription());

        TextView sourceTextView = (TextView) listItemView.findViewById(R.id.source_text_view);
        sourceTextView.setText(currentItem.getAuthor());

        TextView urlTextView = (TextView) listItemView.findViewById(R.id.url_text_view);
        urlTextView.setText(currentItem.getUrl());

        TextView dateTimeTextView = (TextView) listItemView.findViewById(R.id.published_text_view);
        dateTimeTextView.setText(currentItem.getdateTime());
        return listItemView;
    }


}
