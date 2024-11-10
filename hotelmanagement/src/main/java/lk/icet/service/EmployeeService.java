package lk.icet.service;

import lk.icet.dto.Employee;

public interface EmployeeService {
    void addEmployee(Employee employee);
    void deleteEmployee(Integer id);

}
