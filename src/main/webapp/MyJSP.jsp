<%--
  Created by IntelliJ IDEA.
  User: 爱哭鬼瞿白白
  Date: 2024/3/11
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<a>New User Registration！<br/></a>
<form method = "post">
    USERNAME:<input type = "text" name = "username"><br/>
    PASSWORD:<input type = "text" name = "password"><br/>
    EMAIL:<input type = "text" name = "email"><br/>
    <tr>
        <td>GENDER</td>
        <td>
            <input type = "radio" name = "gender" value = "male">男
            <input type = "radio" name = "gender" value = "female">女
        <br/></td>
    </tr>
    DATA OF BIRTH:<input type = "text" name = "data of birth"><br/>
    <input type = "submit" value = "REGISTER"/>
</form>

</body>
</html>
