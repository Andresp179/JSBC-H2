import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import exceptions.models.user;
import exceptions.repos.UserRepository;

@RunWith(SpringRunner.class)
public class ExceptionTest {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void givenValidInitData_whenCallingFindAll_thenReturnData() {
        List<user> users = userRepository.findAll();
        assertThat(users).hasSize(2);
    }

}
