<%--
  Created by IntelliJ IDEA.
  User: jedidiahbowo
  Date: 4/8/20
  Time: 9:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>URL Rewrite</title>
</head>
<body>
    <form action='print?session=<%=session.getId()%>' method='post'>
        <input type='submit' value='Redirect me'>
    </form>
</body>
</html>
