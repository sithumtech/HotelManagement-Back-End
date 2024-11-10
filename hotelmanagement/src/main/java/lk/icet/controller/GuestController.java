package lk.icet.controller;

import lk.icet.dto.Guest;
import lk.icet.dto.Room;
import lk.icet.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guest")
@RequiredArgsConstructor
@CrossOrigin
public class GuestController {
    final GuestService service;

    @PostMapping("/add-guest")
    @ResponseStatus(HttpStatus.CREATED)
    public void addGuest(@RequestBody Guest guest){
        service.addGuest(guest);
    }
    @GetMapping("/getall-guest")
    public List<Guest> getall(){
        return service.getAll();
    }
    @GetMapping("get-gest-byID/{id}")
    public Guest getGuestById(@PathVariable Integer id){
        return service.getGuestbyid(id);
    }
    @DeleteMapping("delete-guest/{id}")
    public void deleteGuest(@PathVariable Integer id){
        service.deleteEmployee(id);
    }

    @PutMapping("/update-guest")
    public void updateGuest(@RequestBody Guest guest){
        service.addGuest(guest);
    }
    
}
