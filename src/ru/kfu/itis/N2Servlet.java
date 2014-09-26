package ru.kfu.itis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by mg on 24.09.14.
 */
public class N2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");

        PrintWriter pw = resp.getWriter();
        if(req.getParameter("name").equals("")){
            pw.println("<p>Имя не введено!</p>");
        }else{
            pw.println("<p>Привет, " + req.getParameter("name") + "!</p>");
        }
        pw.println("<p>Сменить имя</p>");
        pw.println("<form action = \"http://localhost:8080/N2Servlet\">");
        pw.println("<input type = \"text\" name = \"name\">");
        pw.println("<input type = \"submit\" value = \"OK\">");
        pw.println("</form>");
        pw.close();
    }
}
