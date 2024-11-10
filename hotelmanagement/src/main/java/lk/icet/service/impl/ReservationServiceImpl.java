package lk.icet.service.impl;

import lk.icet.dto.Guest;
import lk.icet.dto.Reservation;
import lk.icet.entity.GuestEntity;
import lk.icet.entity.ReservationEntity;
import lk.icet.repository.ReservationRepository;
import lk.icet.repository.RoomRepository;
import lk.icet.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {
    final ReservationRepository repository;
    final ModelMapper mapper;
    @Override
    public void addReservation(Reservation reservation) {
        repository.save(mapper.map(reservation, ReservationEntity.class));
    }

    @Override
    public List<Reservation> getAll() {
        ArrayList<Reservation> reservationlist = new ArrayList<>();
        repository.findAll().forEach(entity -> {
            reservationlist.add(mapper.map(entity, Reservation.class));
        });
        return reservationlist;
    }

    @Override
    public void deletereservation(Integer id) {
        repository.deleteById(id);
    }
}
