import com.github.pagehelper.PageInfo;
import com.pojo.SmbmsBill;
import com.pojo.User;
import com.service.SmbmsBillService;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {

    @Test
    public void testServiceQueryAll(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        List<User> userList = userService.queryAll();
        userList.forEach(user -> System.out.println(user.getUserName()));
    }

    @Test
    public void testPage(){
        Integer pageNo=1;
        Integer pageSize=3;
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        PageInfo<User> pageInfo = userService.queryUserPage(pageNo, pageSize);
        System.out.println(pageInfo.getPageNum());
        System.out.println(pageInfo.getPages()+"页");
        System.out.println(pageInfo.getTotal()+"记录");
        System.out.println("上一页"+pageInfo.getPrePage());
        System.out.println("下一页"+pageInfo.getNextPage());
        List<User> list = pageInfo.getList();
        list.forEach(user -> System.out.println(user));
    }


    @Test
    public void testBillPagebyCodeAndName(){
        Integer pageNo=1;
        Integer pageSize=3;
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        SmbmsBillService billService = (SmbmsBillService) context.getBean("smbmsBillService");
        PageInfo<SmbmsBill> pageInfo = billService.queryBillByCodeAndName(pageNo,pageSize);
        System.out.println(pageInfo.getPageNum());
        System.out.println(pageInfo.getPages()+"页");
        System.out.println(pageInfo.getTotal()+"记录");
        System.out.println("上一页"+pageInfo.getPrePage());
        System.out.println("下一页"+pageInfo.getNextPage());
        List<SmbmsBill> list = pageInfo.getList();
        list.forEach(user -> System.out.println(user));
    }
}
