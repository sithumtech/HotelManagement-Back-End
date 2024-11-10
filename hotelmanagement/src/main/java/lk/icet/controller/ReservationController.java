package lk.icet.controller;

import lk.icet.dto.Guest;
import lk.icet.dto.Reservation;
import lk.icet.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/reservation")
public class ReservationController {
    final ReservationService service;

    @PostMapping("/add-reservation")
    @ResponseStatus(HttpStatus.CREATED)
    public void addreservation(@RequestBody Reservation reservation){
        service.addReservation(reservation);
    }
    @GetMapping("/getall-bookings")
    public List<Reservation> getall(){
        return service.getAll();
    }
    @DeleteMapping("/deleteReservation/{id}")
    public void deleteReservation(@PathVariable Integer id){
        service.deletereservation(id);
    }
}
