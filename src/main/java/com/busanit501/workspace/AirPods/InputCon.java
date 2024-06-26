package com.busanit501.workspace.AirPods;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InputCon", urlPatterns = "/AirPods")
public class InputCon extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/AirPods/Airpods.jsp");
        requestDispatcher.forward(req,resp);
    }
}
