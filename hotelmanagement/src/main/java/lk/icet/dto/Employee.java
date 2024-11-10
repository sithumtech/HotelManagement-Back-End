package lk.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Integer employeeId;
    private String name;
    private String assignedTask;
    private String employementStatus;
    private String phoneNumber;
    private String email;
    private String role;

}
