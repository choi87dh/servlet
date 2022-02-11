package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        System.out.println("전체 파라미터 조회  - 시작");

        request.getParameterNames().asIterator()
                        .forEachRemaining(paramName -> System.out.println(paramName +  "="  + request.getParameter(paramName)));

        System.out.println("전체 파라미터 조회  - 끝");
        System.out.println();

        System.out.println("single paramter - start");
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        System.out.println(username);
        System.out.println(age);
        System.out.println();




    }
}
