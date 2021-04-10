package UserTest.CommandServiceTest;

import Application.User.CommandService.UserCommandService;
import Application.User.CommandService.UserCommandServiceImpl;
import Application.User.DTO.UserAccountDTO;
import Application.User.Repository.UserAccountRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static UserTest.CreateFactory.EntityFactory.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserCommandServiceTests {
    static UserCommandService userCommandService;

    static UserAccountRepository userAccountRepository;

    @BeforeAll
    public static void setup(){
        userAccountRepository = Mockito.mock(UserAccountRepository.class);
        userCommandService = new UserCommandServiceImpl(userAccountRepository);
    }


    @Test
    public void createUserAccountTest(){
        UserAccountDTO userAccount = userCommandService.createUserAccount(userAccountCreateDTO());
        assertEquals("address",userAccount.getAddress());
        assertEquals("userAccount@gmail.com",userAccount.getEmail());

    }

    @Test
    public void updateUserAccountTest(){
        Mockito.when(userAccountRepository.findOneById(1L)).thenReturn(userAccount());
        UserAccountDTO updatedUserAccount = userCommandService.updateUserAccount(userAccountUpdateDTO());
        assertEquals("updatedUserAccount@gmail.com",updatedUserAccount.getEmail());
        assertEquals("updatedName",updatedUserAccount.getName());
    }

    @Test
    public void deleteUserAccount(){
        Mockito.when(userAccountRepository.findOneById(1L)).thenReturn(userAccount());
        boolean isDeleted = userCommandService.deleteUserAccount(1L);
        assertTrue(isDeleted);
    }

}
