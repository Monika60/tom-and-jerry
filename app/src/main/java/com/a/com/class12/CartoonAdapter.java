package com.a.com.class12;

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

public class CartoonAdapter extends ArrayAdapter<Cartoon> {
    private Context context;
    private ArrayList<Cartoon> cartoons;

    public CartoonAdapter(@NonNull Context context, ArrayList<Cartoon> cartoons) {
        super(context, 0, cartoons);
        this.context = context;
        this.cartoons = cartoons;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        Cartoon cartoon = cartoons.get(position);

        if (row != null) {
            ImageView imageView = row.findViewById(R.id.imageView);
            imageView.setImageResource(cartoon.getImage());

            TextView textViewName = row.findViewById(R.id.textView_Name);
            textViewName.setText(cartoon.getName());

            TextView textViewAbout = row.findViewById(R.id.textView_about);
            textViewAbout.setText(cartoon.getAbout());
        }
        return row;
    }
}
