package com.jundana.moviecatalogue;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.jundana.moviecatalogue.model.Tvshow;

import java.util.Objects;

public class TvshowDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvshow_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        Tvshow getTvshow = intent.getParcelableExtra("MOVIE");
        String tvshowName = Objects.requireNonNull(getTvshow).getTvShowName();
        Objects.requireNonNull(getSupportActionBar()).setTitle(tvshowName);

        ImageView imgPhoto = findViewById(R.id.imageView);
        TextView tvItemDetail = findViewById(R.id.tv_item_detail);

        String tvshowDetail = getTvshow.getTvShowDetail();
        int photo = Objects.requireNonNull(getTvshow).getPhoto();
        Glide.with(this).load(photo).into(imgPhoto);
        tvItemDetail.setText(tvshowDetail);
    }
}
