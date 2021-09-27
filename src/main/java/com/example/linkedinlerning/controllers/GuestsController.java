package com.example.linkedinlerning.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

public class GuestsController {
    // GuestController Class
    @RestController
    @RequestMapping("/guest")
    public class GuestController{
        @Autowired
        private GuestRepository guestRepository;

        @GetMapping
        public Iterator<Guest> getGuests(){
            return (Iterator<Guest>) this.guestRepository.findAll();
        }
    }
}
