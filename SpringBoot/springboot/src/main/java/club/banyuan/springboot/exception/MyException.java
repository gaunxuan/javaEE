package club.banyuan.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/15 10:27 上午
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class MyException extends Exception {

}
