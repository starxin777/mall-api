package top.xin.mall.mapper;

import top.xin.mall.entity.MallUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MallUserMapperText {
    @Resource
    private MallUserMapper mallUserMapper;
    @Test
    void selectByPrimaryKey() {
        MallUser mallUser = mallUserMapper.selectByPrimaryKey(1l);
        System.out.println(mallUser);
    }
    @Test
    void selectAll(){
        List<MallUser> mallUsers = mallUserMapper.selectAll();
        System.out.println(mallUsers);
    }

}
