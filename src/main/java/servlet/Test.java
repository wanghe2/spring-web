package servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import service.Hello;

@Component
public class Test {

    @Autowired
    private Hello hello;

    public void say(){
        System.err.println("this is a test class");
        hello.sayhello();
    }

}
