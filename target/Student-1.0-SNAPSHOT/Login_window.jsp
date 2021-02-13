<%--
  Created by IntelliJ IDEA.
  User: fangshicheng
  Date: 2021/2/13
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>log in</title>

</head>
<body>

    <form action="LogInServlet.java" method="post">
        Student ID: <input type="text" name="ID"/>
        Password : <input type="password" name="Password" />
        <input type="submit" id="submit" name="log in" />
    </form>

</body>
</html>
