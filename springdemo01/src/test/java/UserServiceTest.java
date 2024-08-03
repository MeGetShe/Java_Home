import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.pojo.User;
import com.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    @Test
    public void testUserSave(){
        User user = new User();
        UserServiceImpl userService = new UserServiceImpl();
        userService.save(user);
    }


    @Test
    public void testUser(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        User user = new User();
        user.setUsername("");
        user.setId(1L);
        System.out.println(userService.save(user));

    }
}
