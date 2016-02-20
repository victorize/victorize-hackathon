package com.noirdev.austin.the3dease;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Austin on 2/20/2016.
*/
public class CustomAdapter extends ArrayAdapter<Item> {

    public CustomAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public CustomAdapter(Context context, int resource, Item [] items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.layout_list_image, null);
        }

        Item p = getItem(position);

        if (p != null) {
            ImageView img = (ImageView) v.findViewById(R.id.imageView);
            TextView title = (TextView) v.findViewById(R.id.title);
            TextView desc = (TextView) v.findViewById(R.id.desc);

            if (title != null) {
                title.setText(p.getTitle());
            }

            if (desc != null) {
                desc.setText(p.getDesc());
            }

            if (img != null) {
                img.setImageURI(Uri.parse(p.getImg()));
            }
        }

        return v;
    }

}
