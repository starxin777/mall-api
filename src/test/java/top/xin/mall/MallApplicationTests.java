package top.xin.mall;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan(basePackages = {"top.xin.mall.mapper"})
class MallApplicationTests {

    @Test
    void contextLoads() {
    }

}
