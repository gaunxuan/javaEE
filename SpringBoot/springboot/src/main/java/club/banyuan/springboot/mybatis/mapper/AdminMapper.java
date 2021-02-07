package club.banyuan.springboot.mybatis.mapper;

import club.banyuan.springboot.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/15 3:13 下午
 */

@Component
@Mapper
public interface AdminMapper {
    List<Admin> findAdmins();
}
