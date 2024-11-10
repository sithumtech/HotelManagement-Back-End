package lk.icet.service;

import lk.icet.dto.Guest;

import java.util.List;

public interface GuestService {
    void addGuest(Guest guest);
    List<Guest> getAll();
    Guest getGuestbyid(Integer id);
    void deleteEmployee(Integer id);
}
