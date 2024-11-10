package lk.icet.controller;

import lk.icet.dto.Employee;
import lk.icet.dto.LoginRequest;
import lk.icet.dto.Reservation;
import lk.icet.service.EmployeeService;
import lk.icet.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
@RequiredArgsConstructor
public class EmployeeController {
    final EmployeeService service;

    @PostMapping("/add-employee")
    @ResponseStatus(HttpStatus.CREATED)
    public void addemployee(@RequestBody Employee employee){
        service.addEmployee(employee);
    }

    @PutMapping("/update-employee")
    public void updateemployee(@RequestBody Employee employee){
        service.addEmployee(employee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        service.deleteEmployee(id);
    }


}
