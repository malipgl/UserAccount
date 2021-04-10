package UserTest.CreateFactory;

import Application.User.CreateDTO.UserAccountCreateDTO;
import Application.User.DTO.UserAccountDTO;
import Application.User.Entity.UserAccount;
import Application.User.UpdateDTO.UserAccountUpdateDTO;

public class EntityFactory {
    public static UserAccount userAccount(){
        UserAccount userAccount = new UserAccount();
        userAccount.setDepartment("department");
        userAccount.setName("name");
        userAccount.setEmail("account@gmail.com");
        userAccount.setCountry("country");
        userAccount.setPhone(5063166881L);
        userAccount.setAddress("address");
        userAccount.setId(1L);
        return userAccount;
    }

    public static UserAccountCreateDTO userAccountCreateDTO(){
        UserAccountCreateDTO userAccountDTO = new UserAccountCreateDTO();
        userAccountDTO.setDepartment("department");
        userAccountDTO.setName("name");
        userAccountDTO.setEmail("userAccount@gmail.com");
        userAccountDTO.setCountry("TR");
        userAccountDTO.setPhone(5063166881L);
        userAccountDTO.setAddress("address");
        userAccountDTO.setId(1L);
        return userAccountDTO;
    }

    public static UserAccountUpdateDTO userAccountUpdateDTO(){
        UserAccountUpdateDTO userAccountDTO = new UserAccountUpdateDTO();
        userAccountDTO.setDepartment("updatedDepartment");
        userAccountDTO.setName("updatedName");
        userAccountDTO.setEmail("updatedUserAccount@gmail.com");
        userAccountDTO.setCountry("updatedCountry");
        userAccountDTO.setPhone(5063166881L);
        userAccountDTO.setAddress("updatedAddress");
        userAccountDTO.setId(1L);
        return userAccountDTO;
    }

    public static UserAccountDTO userAccountDTO(){
        UserAccountDTO userAccountDTO = new UserAccountDTO();
        userAccountDTO.setDepartment("updatedDepartment");
        userAccountDTO.setName("updatedName");
        userAccountDTO.setEmail("updatedUserAccount@gmail.com");
        userAccountDTO.setCountry("updatedCountry");
        userAccountDTO.setPhone(5063166881L);
        userAccountDTO.setAddress("updatedAddress");
        userAccountDTO.setId(1L);
        return userAccountDTO;
    }
}
