package com.example.movie;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieService {

    @GET("/")
    Call<MovieResponse> getMovies();
}
