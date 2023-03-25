package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

/**
 * Paramiter 전송 기능
 */
@WebServlet(name = "requestParamServelt", urlPatterns = "/request-param")
public class RequestParamServelt extends HttpServlet {

    @Override
    protected void service(HttpServletRequest reqeust, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("[전체파라미터 조회] - start");
        System.out.println("RequestParamServelt.service");
        Enumeration<String> paramerters = reqeust.getParameterNames();
        reqeust.getParameterNames().asIterator()
                        .forEachRemaining(paramName -> System.out.println(paramName + " = " + reqeust.getParameter(paramName)));
        System.out.println("[전체파라미터 조회] - END");
    }
}
