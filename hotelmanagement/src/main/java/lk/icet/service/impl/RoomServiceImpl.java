package lk.icet.service.impl;

import lk.icet.dto.Room;
import lk.icet.entity.RoomEntity;
import lk.icet.repository.RoomRepository;
import lk.icet.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {
    final RoomRepository repository;
    final ModelMapper mapper;

    @Override
    public List<Room> getAll() {
        ArrayList<Room> roomlist = new ArrayList<>();
        repository.findAll().forEach(entity -> {
            roomlist.add(mapper.map(entity, Room.class));
        });
        return roomlist;
    }

    @Override
    public void addRoom(Room room) {
        repository.save(mapper.map(room, RoomEntity.class));
    }

    @Override
    public Room getRoombyNumber(Integer number) {
        Optional<RoomEntity> byId = repository.findById(number);
        return mapper.map(byId, Room.class);
    }
}
