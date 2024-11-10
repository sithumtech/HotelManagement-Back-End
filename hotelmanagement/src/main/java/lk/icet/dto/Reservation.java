package lk.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservation {
    private Integer bookingId;
    private Integer guestId;
    private Integer roomNumber;
    private LocalDate checkingDate;
    private LocalDate checkOutDate;
    private Integer totalCost;

}

