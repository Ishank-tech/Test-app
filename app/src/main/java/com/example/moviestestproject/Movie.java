package com.example.moviestestproject;

public class Movie {

    private String title, poster, overview;
    private  double rating;

    public Movie(String title, String poster, String overview, Double rating){
        this.title = title;
        this.poster = poster;
        this.overview = overview;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getPoster() {
        return poster;
    }

    public String getOverview() {
        return overview;
    }

    public double getRating() {
        return rating;
    }
}
