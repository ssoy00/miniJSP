<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 24. 5. 16.
  Time: 오후 3:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP-Model2(MVC)-memberInput</title>
</head>
<body>
<h1><%= "임시 memberInput 화면." %>
</h1>
<form method="post" action="/member/input">
    <input type="text" name="member1" placeholder="이름1 입력해주세요">
    <input type="text" name="member2" placeholder="이름2 입력해주세요">
    <button type="submit">임시 member 등록</button>
</form>
</body>
</html>
