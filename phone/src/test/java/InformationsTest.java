import com.mapper.InformationsMapper;
import com.pojo.Informations;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class InformationsTest {


    @Test
    public void  testQueryAll(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        InformationsMapper mapper = sqlSession.getMapper(InformationsMapper.class);
        List<Informations> informationsList = mapper.queryAll();
        informationsList.forEach(informations -> System.out.println(informations));
    }


    @Test
    public void testQueryDetailById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        InformationsMapper mapper = sqlSession.getMapper(InformationsMapper.class);
        Informations informations = mapper.queryDetailById(3L);
        System.out.println(informations);
    }
    //结果
    //Informations{id=3, title='推荐一个好用的软件', content='推荐一个好用的软件', replyCount=0, viewCount=0, reportTime=Wed Jul 03 00:00:00 CST 2024, lastPostTime=Wed Jul 03 00:00:00 CST 2024,
    // repliesList=[replies{id=3, content='iphone', replyTime=Wed Jul 31 09:05:03 CST 2024, infold=3}]}
}
