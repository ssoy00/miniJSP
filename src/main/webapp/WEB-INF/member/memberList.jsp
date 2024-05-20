<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 24. 5. 16.
  Time: 오후 3:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP-Model2(MVC)-memberList</title>
</head>
<body>
<h1><%= "임시 memberList 화면. 임시 메인" %>
</h1>

<h1>JSTL 이용해서 반복문 출력해보기1.단순 반복문</h1>
<ul>
    <c:forEach var="dto" items="${list}">
        <li>
                ${dto}
        </li>
    </c:forEach>
</ul>
</body>
</html>
