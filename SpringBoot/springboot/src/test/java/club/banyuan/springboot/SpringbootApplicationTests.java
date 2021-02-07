package club.banyuan.springboot;

import club.banyuan.springboot.entity.Admin;
import club.banyuan.springboot.mybatis.mapper.AdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private AdminMapper adminMapper;

    @Test
    void contextLoads() {
        System.out.println(dataSource.toString());
    }

    @Test
    void testMybatis() {
        List<Admin> admins = adminMapper.findAdmins();
        System.out.println(admins);
    }
}
