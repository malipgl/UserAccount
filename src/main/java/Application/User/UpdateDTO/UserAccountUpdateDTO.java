package Application.User.UpdateDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountUpdateDTO {
    private Long id;
    private String name;
    private Long phone;
    private String email;
    private String address;
    private String country;
    private String department;
}
