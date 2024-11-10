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
public class Payment {
    private Integer paymentId;
    private Integer bookingId;
    private String paymentMethod;
    private Integer ammountPaid;
    private LocalDate paymentDate;
}
