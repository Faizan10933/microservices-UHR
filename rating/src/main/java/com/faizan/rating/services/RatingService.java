package com.faizan.rating.services;

import com.faizan.rating.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RatingService {

    Rating create(Rating rating);

    List<Rating> getAllRatings();

    List<Rating> ratingsByUserId(String userId);

    List<Rating> ratingsByHotelId(String hotelId);


}
