package com.example.linkedinlerning.data.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="RESERVATION")

public class Reservation {
    @Id
    // create entities
    @Column(name ="RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationIdId;

    @Column(name ="ROOM_ID")
    private long roomId;

    @Column(name ="GUEST_ID")
    private long guestId;

    @Column(name ="RES_DATE")
    private Date reservationDate;


    // getters and setters
    public long getReservationIdId() {
        return reservationIdId;
    }

    public void setReservationIdId(long reservationIdId) {
        this.reservationIdId = reservationIdId;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
