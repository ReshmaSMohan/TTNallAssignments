<%--
  Created by IntelliJ IDEA.
  User: ttn
  Date: 16/3/19
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Question 7</title>
</head>
<body>
<h1>${heading}</h1>
<form method="post" <%--action="/formData"--%> action="student">
    <input name="firstname" type="text">
    <input name="lastname" type="text">
    <button type="submit">Submit</button>
</form>

</body>
</html>
