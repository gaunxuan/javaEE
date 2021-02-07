package club.banyuan;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/24 4:30 下午
 */
@WebServlet(name = "Login", urlPatterns = "/login")

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        final String username = request.getParameter("username");
        final String password = request.getParameter("password");
        if ("root".equals(username) && "123456".equals(password)) {
            final HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect(request.getContextPath() + "/pages/home.html");
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "账户密码错误");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
