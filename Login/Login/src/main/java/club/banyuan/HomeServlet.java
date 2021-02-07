//package club.banyuan;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.*;
//
///**
// * @author edz
// * @version 1.0
// * @date 2020/12/24 4:43 下午
// */
//@WebServlet(name = "Home" ,urlPatterns = "/pages/home.html")
//public class HomeServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        final HttpSession session = request.getSession();
//        if (session.getAttribute("username")!=null){
//            System.out.println("用户登录成功");
//            response.setContentType("text/html; charset=UTF-8");
//            ServletContext context = getServletContext();
//
//            File file = new File(context.getRealPath("/")+"pages/home.html");
//            if (!file.exists()){
//                file.createNewFile();
//            }
//            InputStream in = new FileInputStream(file);
//            response.getOutputStream().write(in.readAllBytes());
//        }else {
//            System.out.println("用户未登录");
//            response.sendRedirect(request.getContextPath());
//        }
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request,response);
//    }
//}
