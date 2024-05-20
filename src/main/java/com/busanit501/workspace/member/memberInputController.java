package com.busanit501.workspace.member;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "memberInputController", urlPatterns = "/member/input")
public class memberInputController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // 기본, 뷰 jsp 파일로 전달하기.
    RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/member/memberInput.jsp");
    requestDispatcher.forward(req, resp);

  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // 입력 받은 메뉴를 , 데이터 베이스에 저장.
    String memberName = req.getParameter("memberName");
    String memberName2 = req.getParameter("memberName2");

    System.out.println("memberName: " + memberName + "memberName2: " + memberName2);
    // 단순, 메인 메뉴 로 이동.
    resp.sendRedirect("/member/list");
  }
}







