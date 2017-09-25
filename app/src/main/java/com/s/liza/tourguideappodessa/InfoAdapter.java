package com.s.liza.tourguideappodessa;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class InfoAdapter extends ArrayAdapter<Info> {


    public InfoAdapter(Context context, int resources, List<Info> locationsList) {
        super(context, 0, locationsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Info currentLocation = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView nameLocationTextView = (TextView) listItemView.findViewById(R.id.nameTextView);
        nameLocationTextView.setText(currentLocation.getName());

        TextView descriptionLocationTextView = (TextView)
                listItemView.findViewById(R.id.descriptionTextView);
        descriptionLocationTextView.setText(currentLocation.getDesc());

        TextView addressLocationTextView = (TextView) listItemView.findViewById(R.id.addressTextView);
        addressLocationTextView.setText(currentLocation.getAddress());

        TextView phoneLocationTextView = (TextView) listItemView.findViewById(R.id.phoneTextView);
        phoneLocationTextView.setText(currentLocation.getTel());

        return listItemView;
    }
}
