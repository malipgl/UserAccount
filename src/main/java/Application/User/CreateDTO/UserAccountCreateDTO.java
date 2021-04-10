package Application.User.CreateDTO;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountCreateDTO {
    @NotNull
    private Long id;

    @Size(min = 3, max = 15)
    @NotNull
    private String name;

    @Min(99999999L)
    @Max(999999999999L)
    @NotNull
    private Long phone;

    @Size(max = 150)
    @NotNull
    private String email;

    @Size(max = 200)
    private String address;

    @Size(max = 56)
    @NotNull
    private String country;

    @Size(max = 50)
    @NotNull
    private String department;
}
