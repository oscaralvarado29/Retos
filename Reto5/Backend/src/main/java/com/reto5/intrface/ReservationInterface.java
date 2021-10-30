package com.reto3.intrface;

import com.reto3.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationInterface extends CrudRepository<Reservation,Integer> {
}
