package web;

import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author yml
 * Date on 2019/12/21  10:53
 */
@WebServlet(name = "CheckServlet1",value = "/check1")
public class CheckServlet1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        UserService service=new UserServiceImpl();
        User check = service.check(username);
        if (check!=null){
            response.getWriter().print("1");
        }else {
            response.getWriter().print("0");
        }
    }
}
