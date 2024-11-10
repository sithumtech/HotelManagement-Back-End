package lk.icet.service.impl;

import lk.icet.dto.Guest;
import lk.icet.dto.Room;
import lk.icet.entity.GuestEntity;
import lk.icet.entity.RoomEntity;
import lk.icet.repository.GuestRepository;
import lk.icet.repository.RoomRepository;
import lk.icet.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GusetImpl implements GuestService {
    final GuestRepository repository;
    final ModelMapper mapper;

    @Override
    public void addGuest(Guest guest) {
        repository.save(mapper.map(guest, GuestEntity.class));
    }

    @Override
    public List<Guest> getAll() {
        ArrayList<Guest> guestlist = new ArrayList<>();
        repository.findAll().forEach(entity -> {
            guestlist.add(mapper.map(entity, Guest.class));
        });
        return guestlist;
    }

    @Override
    public Guest getGuestbyid(Integer id) {
        Optional<GuestEntity> byId = repository.findById(id);
        return mapper.map(byId, Guest.class);
    }

    @Override
    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }
}
