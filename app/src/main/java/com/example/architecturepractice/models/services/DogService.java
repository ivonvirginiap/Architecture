package com.example.architecturepractice.models.services;

import com.example.architecturepractice.models.DogRandomResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DogService {

   @GET("breeds/image/random")
    Call<DogRandomResponse> fetchRandomDog();
}
