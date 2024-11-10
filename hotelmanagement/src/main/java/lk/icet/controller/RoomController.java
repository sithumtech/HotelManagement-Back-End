package lk.icet.controller;

import lk.icet.dto.Room;
import lk.icet.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
@RequiredArgsConstructor
public class RoomController {
   final RoomService roomService;

    @PostMapping("/add-room")
    @ResponseStatus(HttpStatus.CREATED)
    public void addRoom(@RequestBody Room room){
        roomService.addRoom(room);
    }

    @PutMapping("/update-roomcodition")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateRoom(@RequestBody Room room){
        roomService.addRoom(room);
    }


    @GetMapping("/getall-room")
    public List<Room> getall(){
        return roomService.getAll();
    }

    @GetMapping("get-room-bynumber/{number}")
    public Room getRoomByNumber(@PathVariable Integer number){
        return roomService.getRoombyNumber(number);
    }




}
