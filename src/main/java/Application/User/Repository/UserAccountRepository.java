package Application.User.Repository;

import Application.User.Entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository <UserAccount,Long> {
    UserAccount findOneById(Long id);
}
