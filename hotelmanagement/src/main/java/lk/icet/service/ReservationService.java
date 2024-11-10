package lk.icet.service;

import lk.icet.dto.Guest;
import lk.icet.dto.Reservation;

import java.util.List;

public interface ReservationService {
    void addReservation(Reservation reservation);
    List<Reservation> getAll();
    void deletereservation(Integer id);
}
