package com.faizan.HotelService.services;

import com.faizan.HotelService.entites.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Optional<Hotel> get(String id);
}
