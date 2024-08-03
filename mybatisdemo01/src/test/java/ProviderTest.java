import com.github.pagehelper.PageHelper;
import com.mapper.ProviderMapper;
import com.pojo.Provider;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ProviderTest {

    @Test
    public void testQueryByProNameToPage(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        PageHelper.startPage(2,5);
        List<Provider> list = mapper.queryByProNameToPage("有限公司");
        list.forEach(provider -> System.out.println(provider));
    }
}
