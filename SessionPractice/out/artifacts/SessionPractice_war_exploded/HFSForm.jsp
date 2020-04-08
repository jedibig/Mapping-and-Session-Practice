<%--
  Created by IntelliJ IDEA.
  User: jedidiahbowo
  Date: 4/8/20
  Time: 9:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hidden Fields</title>
</head>
<body>
    <form action='print' method='post'>
        <input type='submit' value='Redirect me'>
        <input type='hidden' name='session' value='<%=session.getId()%>'>
    </form>
</body>
</html>
