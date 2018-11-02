package servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.win.wang.service.HelloService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@Component

public class Helloservlet extends HttpServlet{

    private static void sayhello(){
        HelloService service=new HelloService();
        String data=service.say();
        System.err.println(data);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Test test=(Test) context.getBean("test");
        test.say();
        doPost(request,response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String param=request.getParameter("good");
        sayhello();
        PrintWriter out=response.getWriter();
        out.write(param+"  ,I will give you a spring");
        out.close();

    }

}
