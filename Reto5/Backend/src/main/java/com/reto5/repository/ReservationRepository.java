package com.reto3.repository;

import java.util.List;
import java.util.Optional;

import com.reto3.intrface.ReservationInterface;
import com.reto3.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Oscar Alvarado
 */
@Repository
public class ReservationRepository {
    @Autowired
    private ReservationInterface reservationInterface;

    /**
     * Select
     * @return
     */
    public List<Reservation> getAll(){
        return (List<Reservation>) reservationInterface.findAll();
    }

    /**
     * Select by id
     * @param id
     * @return
     */
    public Optional<Reservation> getReservation(int id){
        return reservationInterface.findById(id);
    }

    /**
     * Insert
     * @param reservation
     * @return
     */
    public Reservation save(Reservation reservation){
        return reservationInterface.save(reservation);
    }

    /**
     * Delete
     * @param reservation
     */
    public void delete(Reservation reservation){
        reservationInterface.delete(reservation);
    }
}
