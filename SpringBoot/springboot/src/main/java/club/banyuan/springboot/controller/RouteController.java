package club.banyuan.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/14 11:08 上午
 */

@Controller
public class RouteController {

    // 需要配置文件
    // spring-boot-starter-thymeleaf
    @GetMapping("/route/test")
    public String RouteTest() {
        return "test";
    }

}
