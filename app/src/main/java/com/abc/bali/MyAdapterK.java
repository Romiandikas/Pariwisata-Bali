package com.abc.bali;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyAdapterK extends RecyclerView.Adapter<PlaceViewHolderK> {

    private Context context;
    private int[] images;
    private String[] placeNames;
    private String[] placeGuide;

    MyAdapterK(Context context, int[] images, String[] placeNames, String[] placeGuide) {
        this.context = context;
        this.images = images;
        this.placeNames = placeNames;
        this.placeGuide = placeGuide;
    }

    @Override
    public PlaceViewHolderK onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_kuliner_row, parent, false);
        return new PlaceViewHolderK(view);
    }

    @Override
    public void onBindViewHolder(final PlaceViewHolderK holder, int position) {
        holder.placeName.setText(placeNames[position]);
        holder.place.setImageResource(images[position]);
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "Let's go for a trip to "
                        + placeNames[holder.getAdapterPosition()] +
                        "\nHere is the link to the full review: " + placeGuide[holder.
                        getAdapterPosition()]);
                intent.setType("text/plain");
                context.startActivity(Intent.createChooser(intent, "Send To"));
            }
        });
        holder.visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(placeGuide[holder.getAdapterPosition()]));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }
}

class PlaceViewHolderK extends RecyclerView.ViewHolder {

    ImageView place;
    TextView placeName;
    Button share;
    Button visit;

    PlaceViewHolderK(View itemView) {
        super(itemView);

        place = itemView.findViewById(R.id.ivPlace);
        placeName = itemView.findViewById(R.id.tvPlaceName);
        share = itemView.findViewById(R.id.btnShare);
        visit = itemView.findViewById(R.id.btnVisit);
    }
}
