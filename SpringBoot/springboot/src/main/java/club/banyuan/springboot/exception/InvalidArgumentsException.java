package club.banyuan.springboot.exception;

import lombok.Getter;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/15 10:32 上午
 */

@Getter
public class InvalidArgumentsException extends Exception {
    private BindingResult bindingResult;

    public InvalidArgumentsException() {
    }

    public InvalidArgumentsException(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }

}
