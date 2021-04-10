package Application.User.Controller;

import Application.User.CommandService.UserCommandService;
import Application.User.CommandService.UserCommandServiceImpl;
import Application.User.CreateDTO.UserAccountCreateDTO;
import Application.User.DTO.UserAccountDTO;
import Application.User.UpdateDTO.UserAccountUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@Transactional
public class UserRestController {

    @Autowired
    UserCommandService userCommandService;

    public UserRestController(UserCommandServiceImpl userCommandServiceImpl){
        this.userCommandService = userCommandServiceImpl;
    }

    @PostMapping(value = "/createUserAccount", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public UserAccountDTO createUserAccount(@RequestBody UserAccountCreateDTO userAccountCreateDTO){
       return userCommandService.createUserAccount(userAccountCreateDTO);
    }

    @DeleteMapping("/deleteUserAccount/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteUserAccount(@PathVariable Long id){
       return userCommandService.deleteUserAccount(id);
    }

    @PutMapping(value="/updateUserAccount" , consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public UserAccountDTO updateUserAccount(@RequestBody UserAccountUpdateDTO userAccountUpdateDTO){
        return userCommandService.updateUserAccount(userAccountUpdateDTO);
    }
}
