package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import entity.Booking;
import lombok.Data;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long id;
    private String email;
    private String name;
    private String phonrNumber;
    private String role;
    private List<BookingDTO> booking = new ArrayList<>();
}
