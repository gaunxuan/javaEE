package club.banyuan.springboot.controller;

import club.banyuan.springboot.entity.User;
import club.banyuan.springboot.exception.InvalidArgumentsException;
import club.banyuan.springboot.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/14 9:42 上午
 */


@Controller
public class IndexController {
    @GetMapping("index/test")
    @ResponseBody
    public String IndexTest() {
        return "test";
    }

    @GetMapping("user/test")
    @ResponseBody
    public Object UserTest(@Validated User user, BindingResult bindingResult) throws InvalidArgumentsException {
        if (bindingResult.hasErrors()) {
            throw new InvalidArgumentsException(bindingResult);
        }
        return user.toString();
    }

    @ExceptionHandler(InvalidArgumentsException.class)
    @ResponseBody
    public Map InvalidArgumentExcetrionHandler(InvalidArgumentsException invalidArgumentsException) {
        BindingResult bindingResult = invalidArgumentsException.getBindingResult();
        Map map = new HashMap();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        for (FieldError fieldError : fieldErrors) {
            map.put(fieldError, fieldError.getDefaultMessage());
        }
        return map;
    }

    @GetMapping("exception/test")
    public String ExceptionTest() throws MyException {
        throw new MyException();
    }
}
