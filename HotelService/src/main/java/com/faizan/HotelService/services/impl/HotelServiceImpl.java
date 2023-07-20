package com.faizan.HotelService.services.impl;

import com.faizan.HotelService.entites.Hotel;
import com.faizan.HotelService.exception.ResourceNotFoundException;
import com.faizan.HotelService.repositories.HotelRepository;
import com.faizan.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {


    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
        String uid = UUID.randomUUID().toString();
        hotel.setId(uid);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Optional<Hotel> get(String id) {
        return Optional.ofNullable(hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("hotel with given id not found !!")));
    }


}
