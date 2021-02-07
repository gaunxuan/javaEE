package club.banyuan.springboot.aspect;

import club.banyuan.springboot.entity.User;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.Signature;
//import org.aspectj.lang.reflect.MethodSignature;

//import java.lang.reflect.Method;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/18 2:07 下午
 */

@Component
@Aspect
public class UserAscept {

    @Pointcut("execution(* club.banyuan.springboot.controller..*(..))")
    public void PointCut() {

    }

//    @Before("execution( String club.banyuan.springboot.controller.IndexController.IndexTest() )")
//    public void BeforeIndexTest(){
//        System.out.println("before aspect");
//    }
//
//    @AfterThrowing("execution( * club.banyuan.springboot.controller.IndexController.UserTest(..))")
//    public void AfterThrowingUserTest(){
//        System.out.println("AfterThrowingUserTest");
//    }
//
//    @Before("execution(* club.banyuan.springboot.controller..*(..))")
//    public void BeforeAll(){
//        System.out.println("before all aspect");
//    }
//
//    @Around("PointCut()")
//    public Object AroundAll(ProceedingJoinPoint joinPoint) throws Throwable {
//        long startTime = System.currentTimeMillis();
//        Object proceed = joinPoint.proceed();
//        long endTime = System.currentTimeMillis();
//        long consumeTime = endTime-startTime;
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        Method method = methodSignature.getMethod();
//        System.out.println(method.getName()+" consume " + consumeTime);
//        return proceed;
//    }

    @Pointcut("execution(* club.banyuan.springboot.controller..*(..)) && args(user,*)")
    private void PointCut2(User user) {

    }

    @AfterReturning(pointcut = "PointCut()", returning = "str")
    public void AfterReturningString(String str) {
        System.out.println("AfterReturningString" + str);
    }

    @Before("execution(* club.banyuan.springboot.controller..*(..)) && args(user,..)")
    public void BeforeArgs(User user) {
        System.out.println("BeforeArgs" + user);
    }

    @Before(value = "PointCut2(user)", argNames = "user")
    public void BeforeArgsPointCut2(User user) {
        System.out.println("BeforeArgsPointCut2" + user);
    }

}
