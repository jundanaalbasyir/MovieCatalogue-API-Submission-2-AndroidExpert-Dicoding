package com.jundana.moviecatalogue.helper;

public class UtilsApi {
    static final String BASE_URL_API = "https://api.themoviedb.org";

    public static final String api_key = "0ddff5a4cb3456b6523de69139a534b0";
    public static final String PHOTO_URL = "https://image.tmdb.org/t/p/w185/";

    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient().create(BaseApiService.class);
    }
}
