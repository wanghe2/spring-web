import org.win.wang.service.HelloService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Helloservlet extends HttpServlet{
    public static void sayhello(){
        HelloService service=new HelloService();
        String data=service.say();
        System.err.println(data);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
