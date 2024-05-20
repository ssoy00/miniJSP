package com.busanit501.workspace.AirPods;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InputCon2", urlPatterns = "/AirPods-re")
public class InputCon2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String Apple = req.getParameter("Apple");

        if(Apple.equals("AirPodsMax")){
            resp.sendRedirect("/");
        } else {
            resp.sendRedirect("/AirPods-re");
        }
    }
}
