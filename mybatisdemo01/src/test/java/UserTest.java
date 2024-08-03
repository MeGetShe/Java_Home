import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.UserMapper;
import com.pojo.User;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class UserTest {
    @Test
    public void testQueryCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer count = mapper.queryCount();
        System.out.println("用户记录数:" + count);
    }

    @Test
    public void testQueryAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        PageHelper.startPage(2,3);
        List<User> userList = mapper.queryAllUser();
        PageInfo<User> pageInfo = new PageInfo<>(userList, 3);
        SqlSessionUtil.closeSqlSession(sqlSession);
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void testQueryByName() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.queryByName("李");
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void testQueryByNameAndRole() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.queryByNameAndRoleParam("杨",3);
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void testQueryByNameAndRoleName() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.queryByNameAndRoleName("杨",3);
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void testUpdateUserPassword() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer count = mapper.updateUserPassword(2L, "1234567");
        System.out.println(count);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null,"001","李雷","1234567",1,new Date(),"123","北京",1,1L,null,1L,null);
        Integer count = mapper.insertUser(user);
        System.out.println(count);
    }

    @Test
    public void testQueryUserAndRoleByUserName(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.queryUserAndRoleByUserName("张");
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void testQueryUserByRoleIdAndUserName(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User();
        user1.setUserRole(3);
        user1.setUserName("张");
        List<User> userList = mapper.queryUserByRoleIdAndUserName(user1);
        userList.forEach(user -> System.out.println(user.getId()+"\t"+user.getUserName()));
    }

    @Test
    public void testUpdateUserSet(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User();
        user1.setId(16L);
        user1.setUserName("韩梅梅");
        user1.setUserCode("hmm");
        user1.setUserPassword("100861");
        Integer count = mapper.updateUserSet(user1);
        System.out.println(count);
    }

    @Test
    public void testUpdateUserTrim(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User();
        user1.setId(16L);
        user1.setUserName("韩梅梅");
        user1.setUserCode("hmm");
        user1.setUserPassword("100860");
        Integer count = mapper.updateUserTrim(user1);
        System.out.println(count);
    }

    @Test
    public void testQQueryUserForeachArray(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Long[] roleIds={1L,3L};
        List<User> userList = mapper.queryUserForeachArray(roleIds);
        userList.forEach(user -> System.out.println(user.getId()+"\t"+user.getUserName()));
    }

    @Test
    public void testQQueryUserForeachMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Long[] roleIds={1L,3L};
        HashMap<String, Object> map = new HashMap<>();
        map.put("rids",roleIds);
        List<User> userList = mapper.queryUserForeachMap(map);
        userList.forEach(user -> System.out.println(user.getId()+"\t"+user.getUserName()));
    }
}
