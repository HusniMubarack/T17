package com.example.husnimubarack.t17;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Husni Mubarack on 28-Aug-17.
 */

public class DrawerAdapter extends ArrayAdapter<DrawerListItem> {
    public DrawerAdapter(@NonNull Context context, ArrayList<DrawerListItem> objects) {
        super(context,0,objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        DrawerListItem currentItem = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.drawer_listitem, parent, false);
        }
        TextView listItemName = (TextView) listItemView.findViewById(R.id.item_name) ;
        listItemName.setText(currentItem.getmListItemName());


        ImageView itemImage = (ImageView) listItemView.findViewById(R.id.item_icon);
        if (currentItem.isHaveImage()) {
            itemImage.setImageResource(currentItem.getmImageId());
            itemImage.setVisibility(View.VISIBLE);
        } else {
            itemImage.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
