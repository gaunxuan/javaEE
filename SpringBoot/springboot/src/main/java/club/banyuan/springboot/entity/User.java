package club.banyuan.springboot.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/15 9:40 上午
 */

@Getter
@Setter
@ToString
public class User {
    @Size(min = 3, max = 8)
    @NotBlank
    private String username;

    @Size(min = 8, max = 16)
    @NotBlank
    private String password;

    @Valid
    private Resume resume;
}
