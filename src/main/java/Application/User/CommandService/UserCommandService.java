package Application.User.CommandService;

import Application.User.CreateDTO.UserAccountCreateDTO;
import Application.User.DTO.UserAccountDTO;
import Application.User.UpdateDTO.UserAccountUpdateDTO;

public interface UserCommandService {
    UserAccountDTO createUserAccount(UserAccountCreateDTO userAccountCreateDTO);

    boolean deleteUserAccount(Long id);

    UserAccountDTO updateUserAccount(UserAccountUpdateDTO userAccountUpdateDTO);
}
