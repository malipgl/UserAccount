package Application.User.CommandService;

import Application.User.CreateDTO.UserAccountCreateDTO;
import Application.User.DTO.UserAccountDTO;
import Application.User.Entity.UserAccount;
import Application.User.Repository.UserAccountRepository;
import Application.User.UpdateDTO.UserAccountUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserCommandServiceImpl implements UserCommandService {

    @Autowired
    UserAccountRepository userAccountRepository;

    public UserCommandServiceImpl(UserAccountRepository userAccountRepository){
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public UserAccountDTO createUserAccount(UserAccountCreateDTO userAccountCreateDTO){
        UserAccount userAccount = new UserAccount().fromDTO(userAccountCreateDTO);
        userAccountRepository.save(userAccount);
        return userAccount.toDTO();
    }

    @Override
    public boolean deleteUserAccount(Long id){
        boolean isUserAccountDeleted = false;
        isUserAccountDeleted = deleteUserAccountIfExists(id, isUserAccountDeleted);
        return isUserAccountDeleted;
    }

    @Override
    public UserAccountDTO updateUserAccount(UserAccountUpdateDTO userAccountUpdateDTO){
        UserAccountDTO userAccountDTO = new UserAccountDTO();
        try {
            userAccountDTO = updateUserAccountFromUpdateDTO(userAccountUpdateDTO);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return userAccountDTO;
    }

    private boolean deleteUserAccountIfExists(Long id, boolean isUserAccountDeleted) {
        UserAccount userAccount = userAccountRepository.findOneById(id);
        if(Objects.nonNull(userAccount)) {
            userAccountRepository.delete(userAccount);
            isUserAccountDeleted = !isUserAccountDeleted;
        }
        return isUserAccountDeleted;
    }



    private UserAccountDTO updateUserAccountFromUpdateDTO(UserAccountUpdateDTO userAccountUpdateDTO) {
        UserAccount userAccount = userAccountRepository.findOneById(userAccountUpdateDTO.getId());
        userAccount.setAddress(userAccountUpdateDTO.getAddress());
        userAccount.setCountry(userAccountUpdateDTO.getCountry());
        userAccount.setDepartment(userAccountUpdateDTO.getDepartment());
        userAccount.setName(userAccountUpdateDTO.getName());
        userAccount.setEmail(userAccountUpdateDTO.getEmail());
        userAccount.setDepartment(userAccountUpdateDTO.getDepartment());
        userAccountRepository.save(userAccount);
        return userAccount.toDTO();
    }

}
