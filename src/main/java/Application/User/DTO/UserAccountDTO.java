package Application.User.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountDTO {
    private Long id;
    private String name;
    private Long phone;
    private String email;
    private String address;
    private String country;
    private String department;
}
