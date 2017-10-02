package com.s.liza.tourguideappodessa;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class InfoAdapter extends ArrayAdapter<Info> {


    public InfoAdapter(Context context, List<Info> info) {
        super(context, 0, info);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Info currentLocation = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.photoImageView);
        imageView.setImageResource(currentLocation.getImageResourceId());
        imageView.setVisibility(View.VISIBLE);

        TextView nameLocationTextView = (TextView) listItemView.findViewById(R.id.nameTextView);
        nameLocationTextView.setText(currentLocation.getName());

        TextView descriptionLocationTextView = (TextView)
                listItemView.findViewById(R.id.descriptionTextView);
        descriptionLocationTextView.setText(currentLocation.getDesc());

        TextView addressLocationTextView = (TextView) listItemView.findViewById(R.id.addressTextView);
        addressLocationTextView.setText(currentLocation.getAddress());

        TextView workHoursLocationTextView = (TextView) listItemView.findViewById(R.id.workHoursTextView);
        workHoursLocationTextView.setText(currentLocation.getWorkHours());

        TextView phoneLocationTextView = (TextView) listItemView.findViewById(R.id.phoneTextView);
        phoneLocationTextView.setText(currentLocation.getTel());

        TextView siteLocationTextView = (TextView) listItemView.findViewById(R.id.siteTextView);
        siteLocationTextView.setText(currentLocation.getSite());

        return listItemView;
    }
}
