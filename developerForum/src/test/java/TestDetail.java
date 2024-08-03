import com.mapper.DetailMapper;
import com.pojo.Detail;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class TestDetail {

    @Test
    public void testQueryAllDetail(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DetailMapper mapper = sqlSession.getMapper(DetailMapper.class);
        List<Detail> detailList = mapper.queryAllDetail();
        detailList.forEach(detail -> System.out.println(detail));
    }

    @Test
    public void testDeleteDetail(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DetailMapper mapper = sqlSession.getMapper(DetailMapper.class);
        Integer count = mapper.deleteDetail(8L);
        System.out.println(count);
    }

    @Test
    public void testInsertDetail(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DetailMapper mapper = sqlSession.getMapper(DetailMapper.class);
        Detail detail = new Detail();
        detail.setSortId(3L);
        detail.setTitle("PYTHON");
        detail.setDetail("PYTHON");
        detail.setAuthor("田七");
        detail.setCreateDate(new Date());
        detail.setReplyCount(15);
        Integer count = mapper.insertDetail(detail);
        System.out.println(count);
    }
}
