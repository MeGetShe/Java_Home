import com.pojo.User;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestUser {


    @Test
    public void testInsertUser(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = new User();
        user.setCardId("132655199910190934");
        user.setName("陈刚");
        user.setGender(0);
        user.setCreateTime(new Date());
        user.setPassword("123456");
        user.setStatus(1);
        Integer count= userService.insertUser(user);
        System.out.println(count);
    }
}
