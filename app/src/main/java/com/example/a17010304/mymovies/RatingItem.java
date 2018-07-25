package com.example.a17010304.mymovies;

public class RatingItem {

    public String title;
    public String rating;
    public String desc;
    public String pg;

    public RatingItem(String title, String rating, String desc, String pg) {
        this.title = title;
        this.rating = rating;
        this.desc = desc;
        this.pg = pg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPg() {
        return pg;
    }

    public void setPg(String pg) {
        this.pg = pg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "RatingItem{" +
                "title='" + title + '\'' +
                ", Rating='" + rating + '\'' +
                ", pg='" + pg + '\'' +
                '}';
    }
}
