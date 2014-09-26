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
public class N4Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        int btn_number = 1;
        if(req.getParameter("number") != null){
            try {
                btn_number = Integer.parseInt(req.getParameter("number")) + 1;
            }catch(Exception e){
                //Error
            }
        }
        PrintWriter pw = resp.getWriter();
        pw.println("<form action = \"http://localhost:8080/N4Servlet\">");
        pw.println("<input type = \"button\" name = \"number\" value = \"" + btn_number + "\">");
        pw.println("<button type = \"submit\" name = \"number\" value = \"" + btn_number + "\">OK</button>");
        pw.println("</form>");
        pw.close();
    }
}
