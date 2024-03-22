<%--
  Created by IntelliJ IDEA.
  User: 爱哭鬼瞿白白
  Date: 2024/3/18
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="register">
    username<input type="text" name="username"/><br/>
    password<input type="text" name="password"/><br/>
    email<input type="text" name="email"/><br/>
    gender:<input type="radio" name="gender" value="male">male <input type="radio" name="gender" value="female">female><br/>
    date of birth:<input type="text" name="birthday"/><br>
    <input type = "submit" value = "Register"/>
</form>

</body>
</html>
