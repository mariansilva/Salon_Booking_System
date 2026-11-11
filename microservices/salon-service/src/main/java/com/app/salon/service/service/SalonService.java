package com.app.salon.service.service;

import com.app.salon.service.model.Salon;
import com.app.salon.service.payload.dto.SalonDTO;
import com.app.salon.service.payload.dto.UserDTO;

import java.util.List;

public interface SalonService {

    Salon createSalon(SalonDTO salon, UserDTO user);

    Salon updateSalon(SalonDTO salon, UserDTO user, Long salonId);

    List<Salon> getAllSalons();

    Salon getSalonById(Long salonId);

    Salon getSalonByOwenerId(Long ownerId);

    List<Salon> searchSalonByCity(String city);
}
