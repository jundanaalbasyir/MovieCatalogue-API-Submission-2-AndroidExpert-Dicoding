package com.jundana.moviecatalogue.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jundana.moviecatalogue.R;
import com.jundana.moviecatalogue.adapter.TvshowsAdapter;
import com.jundana.moviecatalogue.helper.TvshowsData;
import com.jundana.moviecatalogue.model.Tvshow;

import java.util.ArrayList;

public class TvshowFragment extends Fragment {
    private RecyclerView rvTvshow;
    private ArrayList<Tvshow> list = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIntanceState) {
        View view = inflater.inflate(R.layout.fragment_tv_show, container, false);
        rvTvshow = view.findViewById(R.id.rv_tvshow);
        rvTvshow.setHasFixedSize(true);

        list.addAll(TvshowsData.getListData());
        showRecyclerList();
        return view;
    }

    private void showRecyclerList() {
        rvTvshow.setLayoutManager(new LinearLayoutManager(getContext()));
        TvshowsAdapter listTvshowAdapter = new TvshowsAdapter(getContext(), list);
        rvTvshow.setAdapter(listTvshowAdapter);
    }
}
