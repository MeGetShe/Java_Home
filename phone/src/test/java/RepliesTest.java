import com.mapper.InformationsMapper;
import com.mapper.RepliesMapper;
import com.pojo.Replies;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

public class RepliesTest {


    @Test
    public void testInsertReply(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        RepliesMapper mapper = sqlSession.getMapper(RepliesMapper.class);
        Replies replies = new Replies(1L,"java",new Date(),1L);
        Integer count = mapper.insertReply(replies);
        System.out.println(count);


    }
}
