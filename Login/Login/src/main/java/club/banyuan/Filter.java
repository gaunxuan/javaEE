package club.banyuan;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/25 11:03 上午
 */
@WebFilter(filterName = "Filter", urlPatterns = "/*")
public class Filter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        final ServletContext servletContext = request.getServletContext();
        final String time = (String) servletContext.getAttribute("time");
        System.out.println(time);
        final String requestURI = request.getRequestURI();
        if (requestURI.endsWith("index.jsp") || requestURI.endsWith("login")) {
            chain.doFilter(req, resp);
            return;
        }
        final HttpSession session = request.getSession();
        if (session.getAttribute("username") != null) {
            chain.doFilter(req, resp);
            return;
        }
        response.sendRedirect("/Login/index.jsp");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
