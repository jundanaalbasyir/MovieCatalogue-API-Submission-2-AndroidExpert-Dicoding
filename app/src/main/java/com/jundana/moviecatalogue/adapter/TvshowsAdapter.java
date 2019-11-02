package com.jundana.moviecatalogue.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.jundana.moviecatalogue.R;
import com.jundana.moviecatalogue.TvshowDetailActivity;
import com.jundana.moviecatalogue.model.Tvshow;

import java.util.ArrayList;
import java.util.List;

import static com.jundana.moviecatalogue.helper.UtilsApi.PHOTO_URL;

public class TvshowsAdapter extends RecyclerView.Adapter<TvshowsAdapter.ListViewHolder> {
    public static final String DATA_TVSHOW_PARCELABLE = "data_tvshow";

    private Context mCtx;
    private List<Tvshow> listTvShow;

    public TvshowsAdapter(Context context, ArrayList<Tvshow> list) {
        this.mCtx = context;
        this.listTvShow = list;
    }

    @NonNull
    @Override
    public TvshowsAdapter.ListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new TvshowsAdapter.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TvshowsAdapter.ListViewHolder listViewHolder, int position) {
        Tvshow tvshows = listTvShow.get(position);
        Glide.with(listViewHolder.itemView.getContext())
                .load(PHOTO_URL + tvshows.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(listViewHolder.imgPhoto);
        listViewHolder.tvItemName.setText(tvshows.getTvShowName());
        listViewHolder.tvItemDetail.setText(tvshows.getTvShowDetail());
    }

    @Override
    public int getItemCount() {
        return listTvShow.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvItemName, tvItemDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvItemName = itemView.findViewById(R.id.tv_item_name);
            tvItemDetail = itemView.findViewById(R.id.tv_item_detail);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Tvshow tvshow = listTvShow.get(position);
            tvshow.setId(tvshow.getId());
            tvshow.setTvShowName(tvshow.getTvShowName());
            tvshow.setTvShowDetail(tvshow.getTvShowDetail());
            Intent intent = new Intent(mCtx, TvshowDetailActivity.class);
            intent.putExtra(DATA_TVSHOW_PARCELABLE, tvshow);
            mCtx.startActivity(intent);
        }
    }
}