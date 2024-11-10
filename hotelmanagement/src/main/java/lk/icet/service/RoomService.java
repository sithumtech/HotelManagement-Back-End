package lk.icet.service;

import lk.icet.dto.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAll();
    void addRoom(Room room);
    Room getRoombyNumber(Integer number);
}
