package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.Hello;
import servlet.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class HelloController {

    @Autowired
    private Hello hello;

    @RequestMapping("/hello.do")
    public void sayHi(HttpServletRequest request, HttpServletResponse response) throws IOException {
        hello.sayhello();
        PrintWriter out=response.getWriter();
        out.write("hello world");
        out.close();
    }
}
