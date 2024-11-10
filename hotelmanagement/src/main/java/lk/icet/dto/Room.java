package lk.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Room {
    private Integer roomNumber;
    private Integer booking_id;
    private String roomType;
    private String availabilityStatus;
    private String roomCondition;
    private Double pricePerNight;



}
