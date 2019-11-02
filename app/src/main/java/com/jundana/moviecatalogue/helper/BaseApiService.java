package com.jundana.moviecatalogue.helper;

import com.jundana.moviecatalogue.model.Movie;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BaseApiService {
    @GET("/3/movie/popular")
    Call<ResponseBody> getMovieRequest(@Query("api_key") String api_key);

    @GET("3/tv-show/popular")
    Call<Movie> getTvShowRequest(@Query("api_key") String api_key);

}