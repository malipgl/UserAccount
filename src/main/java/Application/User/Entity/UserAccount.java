package Application.User.Entity;

import Application.User.CreateDTO.UserAccountCreateDTO;
import Application.User.DTO.UserAccountDTO;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class UserAccount {
    @Id
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


    public UserAccount fromDTO(UserAccountCreateDTO createDTO){
        this.id = createDTO.getId();
        this.name = createDTO.getName();
        this.phone = createDTO.getPhone();
        this.email = createDTO.getEmail();
        this.address = createDTO.getAddress();
        this.country = createDTO.getCountry();
        this.department = createDTO.getDepartment();
        return this;
    }

    public UserAccountDTO toDTO() {
        UserAccountDTO userAccountDTO = new UserAccountDTO();
        userAccountDTO.setAddress(getAddress());
        userAccountDTO.setCountry(getCountry());
        userAccountDTO.setDepartment(getDepartment());
        userAccountDTO.setEmail(getEmail());
        userAccountDTO.setName(getName());
        userAccountDTO.setPhone(getPhone());
        userAccountDTO.setId(getId());

        return userAccountDTO;
    }
}
