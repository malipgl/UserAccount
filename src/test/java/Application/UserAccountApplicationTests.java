package Application;

import Application.User.Controller.UserRestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserAccountApplicationTests {

	@Autowired
	private UserRestController userRestController;

	@Test
	void contextLoads() {
		assertThat(userRestController).isNotNull();
	}

}
