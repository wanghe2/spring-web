package aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* service.Hello.sayhello(..))")
    public void sayadvice(){
    }

    @Before("sayadvice()")
    public void saybefore(){
        System.err.println("*********before  advice**************");
    }

    @After("sayadvice()")
    public void sayafter(){
        System.err.println("*********after  advice**************");
    }
}
