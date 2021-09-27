package com.example.linkedinlerning.data.repository;

import com.example.linkedinlerning.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> { //class, data type with big L

}
