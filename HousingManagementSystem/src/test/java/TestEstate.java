import com.dto.PageDto;
import com.github.pagehelper.PageInfo;
import com.pojo.RealEstate;
import com.service.RealEstateService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestEstate {

    @Test
    public void testQueryAll() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        RealEstateService estateService = context.getBean("realEstateService", RealEstateService.class);
        PageDto pageDto = new PageDto();
        pageDto.setPageNum(1);
        pageDto.setPageSize(3);
        PageInfo<RealEstate> pageInfo = estateService.queryAll(pageDto);
        System.out.println("共" + pageInfo.getPages() + "页");
        System.out.println(pageDto.getPageNum() + "/" + pageInfo.getPages());
        List<RealEstate> list = pageInfo.getList();
        System.out.println("记录:");
        list.forEach(realEstate -> System.out.println(realEstate));
    }

    @Test
    public void testQueryByName() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        RealEstateService estateService = context.getBean("realEstateService", RealEstateService.class);
        PageDto pageDto = new PageDto();
        pageDto.setPageNum(1);
        pageDto.setPageSize(3);
        PageInfo<RealEstate> pageInfo = estateService.queryByName(pageDto, "雨");
        System.out.println("共" + pageInfo.getPages() + "页");
        System.out.println(pageDto.getPageNum() + "/" + pageInfo.getPages());
        List<RealEstate> list = pageInfo.getList();
        System.out.println("记录:");
        list.forEach(realEstate -> System.out.println(realEstate));
    }

    @Test
    public void testQueryByCardId() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        RealEstateService estateService = context.getBean("realEstateService", RealEstateService.class);
        PageDto pageDto = new PageDto();
        pageDto.setPageNum(1);
        pageDto.setPageSize(3);
        PageInfo<RealEstate> pageInfo = estateService.queryByCardId(pageDto,"312205197809191036");
        System.out.println("共" + pageInfo.getPages() + "页");
        System.out.println(pageDto.getPageNum() + "/" + pageInfo.getPages());
        List<RealEstate> list = pageInfo.getList();
        System.out.println("记录:");
        list.forEach(realEstate -> System.out.println(realEstate));
    }
}
