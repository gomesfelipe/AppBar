package br.com.appbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import org.askerov.dynamicgrid.BaseDynamicGridAdapter;
import org.askerov.dynamicgrid.example.R;

import java.util.ArrayList;
import java.util.List;


public class DynamicAdapter extends BaseDynamicGridAdapter {
    public DynamicAdapter(Context context, List<?> items, int columnCount) {
        super(context, items, columnCount);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CheeseViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_grid, null);
            holder = new CheeseViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (CheeseViewHolder) convertView.getTag();
        }
        holder.build(getItem(position).toString());
        return convertView;
    }

    private class CheeseViewHolder {
        private TextView titleText;
        private ImageView image;

        private CheeseViewHolder(View view) {
            titleText = (TextView) view.findViewById(R.id.item_title);
            image = (ImageView) view.findViewById(R.id.item_img);
        }

        void build(String title) {
            titleText.setText(title);
            if (title == " ") {
                image.setImageResource(R.drawable.ic_launcher);
            }
            else
                image.setImageResource(R.drawable.ic_client);
        }
    }
}