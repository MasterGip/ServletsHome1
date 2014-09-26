package ru.kfu.itis;

import javax.servlet.http.HttpServlet;
import java.io.*;

/**
 * Created by mg on 26.09.14.
 */
public class HardNumberRegistrationServlet extends HttpServlet {
    private void addStudent(String surname, String name, String fathersName, int mounthOfBirth,
                            int yearOfBirth, String homeAddress, String language){
        File students = new File("students.xml");

        try {
            BufferedReader br = new BufferedReader(new FileReader(students));
            if(br.readLine().equals(null)){
                PrintWriter pw = new PrintWriter(students);
                pw.println("<xml version=\"1.0\">");
            }

        } catch (IOException e) {

        }

    }
}
