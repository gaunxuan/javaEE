package club.banyuan.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/15 3:02 下午
 */

@Getter
@Setter
@ToString
public class Admin {
    private Integer id;
    private String username;
    private String password;

    @Value("admin")
    private String rolename;

    public Admin() {
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
