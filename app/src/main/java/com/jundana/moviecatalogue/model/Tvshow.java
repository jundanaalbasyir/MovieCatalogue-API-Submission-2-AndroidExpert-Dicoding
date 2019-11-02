package com.jundana.moviecatalogue.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Tvshow implements Parcelable {
    private int photo;
    private String tvShowName;
    private String tvShowDetail;

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getTvShowName() {
        return tvShowName;
    }

    public void setTvShowName(String tvshowName) {
        this.tvShowName = tvshowName;
    }

    public String getTvShowDetail() {
        return tvShowDetail;
    }

    public void setTvShowDetail(String tvshowDetail) {
        this.tvShowDetail = tvshowDetail;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.photo);
        dest.writeString(this.tvShowName);
        dest.writeString(this.tvShowDetail);
    }

    public Tvshow() {

    }

    private Tvshow(Parcel in) {
        this.photo = in.readInt();
        this.tvShowName = in.readString();
        this.tvShowDetail = in.readString();
    }

    public static final Parcelable.Creator<Tvshow> CREATOR = new Parcelable.Creator<Tvshow>() {
        @Override
        public Tvshow createFromParcel(Parcel source) {
            return new Tvshow(source);
        }

        @Override
        public Tvshow[] newArray(int size) {
            return new Tvshow[size];
        }
    };
}
