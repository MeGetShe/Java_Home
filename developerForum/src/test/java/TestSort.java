import com.mapper.SortMapper;
import com.pojo.Sort;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestSort {

    @Test
    public void testQueryAllSort(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SortMapper mapper = sqlSession.getMapper(SortMapper.class);
        List<Sort> sortList = mapper.queryAllSort();
        sortList.forEach(sort -> System.out.println(sort));
    }
}
