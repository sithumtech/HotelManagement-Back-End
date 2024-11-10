package lk.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Guest {
    private Integer guestId;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String bookingHistory;
    private String paymentDetail;
    private String currentBookingDetail;


}
