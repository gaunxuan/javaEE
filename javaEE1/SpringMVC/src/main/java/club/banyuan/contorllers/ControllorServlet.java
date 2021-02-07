package club.banyuan.contorllers;

import club.banyuan.entily.Admin;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/11 10:41 上午
 */
@RestController
public class ControllorServlet {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/get")
    @PostMapping("/post")
    @DeleteMapping("/delete")
    @ResponseBody
    public String test() {
        return "test";
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable Integer id,
                          @RequestParam(name = "user", required = false) String username,
                          @RequestParam(name = "pwd", required = false) String password) {
        StringBuilder res = new StringBuilder();
        res.append("id:").append(id);
        res.append("username:").append(username);
        res.append("password:").append(password);
        return res.toString();
    }

    @GetMapping("/user/{id}/entity")
    public String getUser(@PathVariable Integer id, Admin admin) {
        return admin.toString();
    }

    @GetMapping("/user/{id}/entity2")
    public Admin getUser2(@PathVariable Integer id) {
        Admin admin = new Admin();
        admin.setId(id);
        return admin;
    }

    @PostMapping("/user/post")
    public String postUser(@RequestBody Admin admin) {
        return admin.toString();
    }

    @GetMapping("/user2/{username:[a-zA-Z]+}")
    public String getUsername(@PathVariable String username) {
        return username;
    }
}
