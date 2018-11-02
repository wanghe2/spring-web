package service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements Hello {

    @Override
    public void sayhello(){
        System.err.println("good good study");
        System.err.println("day  day  up");
    }
}

