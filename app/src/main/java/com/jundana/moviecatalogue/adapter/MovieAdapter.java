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
import com.jundana.moviecatalogue.MovieDetailActivity;
import com.jundana.moviecatalogue.R;
import com.jundana.moviecatalogue.model.Movie;

import java.util.ArrayList;
import java.util.List;

import static com.jundana.moviecatalogue.helper.UtilsApi.PHOTO_URL;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ListViewHolder> {
    public static final String DATA_MOVIE_PARCELABLE = "data_movie";

    private Context mCtx;
    private List<Movie> listMovie;

    public MovieAdapter(Context context, ArrayList<Movie> list){
        this.mCtx = context;
        this.listMovie = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder listViewHolder, int position) {
        Movie movies = listMovie.get(position);
        Glide.with(listViewHolder.itemView.getContext())
                .load(PHOTO_URL + movies.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(listViewHolder.imgPhoto);
        listViewHolder.tvItemName.setText(movies.getMovieName());
        listViewHolder.tvItemDetail.setText(movies.getMovieDetail());
    }
    @Override
    public int getItemCount() {
        return listMovie.size();
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
            Movie movie = listMovie.get(position);
            movie.setId(movie.getId());
            movie.setMovieName(movie.getMovieName());
            movie.setMovieDetail(movie.getMovieDetail());
            Intent intent = new Intent(mCtx, MovieDetailActivity.class);
            intent.putExtra(DATA_MOVIE_PARCELABLE, movie);
            mCtx.startActivity(intent);
        }
    }
}
