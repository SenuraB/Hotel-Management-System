package com.example.linkedinlerning.controllers;

import com.example.linkedinlerning.data.entity.Room;
import com.example.linkedinlerning.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

public class RoomsController {
    // RoomController Class
    @RestController
    @RequestMapping("/rooms")
    public class RoomController{
        @Autowired
        private RoomRepository roomRepository;

        @GetMapping
        public Iterator<Room> getRooms(){
            return (Iterator<Room>) this.roomRepository.findAll();
        }
    }
}
