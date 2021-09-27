package com.example.linkedinlerning.controllers;

import com.example.linkedinlerning.data.entity.Reservation;
import com.example.linkedinlerning.data.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

public class ReservationsController {
    @RestController
    @RequestMapping("/reservation")
    public class ReservationController{
        @Autowired
        private ReservationRepository reservationRepository;

        @GetMapping
        public Iterator<Reservation> getReservations(){
            return (Iterator<Reservation>) this.reservationRepository.findAll();
        }
    }
}
