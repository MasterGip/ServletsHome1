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
public class N5Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter pw = resp.getWriter();

        try {
            int a = Integer.parseInt(req.getParameter("a"));
            int b = Integer.parseInt(req.getParameter("b"));
            int c = Integer.parseInt(req.getParameter("c"));
            String[] decisions = Tools.solveAQuadraticEquationWithFactors(a,b,c);
            if(decisions.length == 1){
                pw.println("<p>x = " + decisions[0] + "</p>");
            }else{
                pw.println("<p>x<sub>1</sub> = " + decisions[0] + ", x<sub>2</sub> = " + decisions[1] + " </p>");
            }

        }catch(Exception e){
            pw.println("Ошибка! " + e.getMessage());
        }
        pw.close();
    }
}
