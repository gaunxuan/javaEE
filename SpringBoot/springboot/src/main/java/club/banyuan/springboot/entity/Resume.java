package club.banyuan.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/15 9:51 上午
 */
@Setter
@Getter
@ToString
public class Resume {
    @NotBlank
    private String phone;
}
