import com.mapper.RoleMapper;
import com.pojo.Role;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class RoleTest {


    @Test
    public void testSaveRole() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        Role role = new Role(null, "lilei", "系统管理员", 1L, new Date(), 1L, new Date());
        Integer count = mapper.saveRole(role);
        System.out.println(count);
        System.out.println(role);
    }

    @Test
    public void testUpdateById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        Role role = new Role();
        role.setId(4L);
        role.setRoleCode("nimeishiba");
        role.setRoleName("yangmi");
        Integer count = mapper.updateById(role);
        System.out.println(count);
    }

    @Test
    public void testDeleteById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        Integer count = mapper.deleteById(4L);
        if (count > 0) {
            sqlSession.commit();
            System.out.println(count);
        }else {
            sqlSession.rollback();
        }
    }
    @Test
    public void testQueryByRoleName(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        List<Role> roleList = mapper.queryByRoleName("管理员");
        roleList.forEach(role -> System.out.println(role));
    }

    @Test
    public  void testqueryRoleAndUserByRoleName(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        List<Role> roleList = mapper.queryRoleAndUserByRoleName("员");
        roleList.forEach(role -> System.out.println(role));
    }
}
