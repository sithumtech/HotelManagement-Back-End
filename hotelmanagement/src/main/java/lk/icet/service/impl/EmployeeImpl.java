package lk.icet.service.impl;

import lk.icet.dto.Employee;
import lk.icet.entity.EmployeeEntity;
import lk.icet.entity.GuestEntity;
import lk.icet.repository.EmployeeRepository;
import lk.icet.repository.GuestRepository;
import lk.icet.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class EmployeeImpl implements EmployeeService {
    final EmployeeRepository repository;
    final ModelMapper mapper;
    @Override
    public void addEmployee(Employee employee) {
        repository.save(mapper.map(employee, EmployeeEntity.class));

    }

    @Override
    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }


}
