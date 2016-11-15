<%@ page language="java" pageEncoding="UTF-8" session="true" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
    <title>Personal cabinet</title>
</head>

<body>
<h1>Entrance</h1>
<%--<form action="${pageContext.servletContext.contextPath}/service/enter" method="GET">--%>
<form action="/service/enter" method="GET">
    <table border = "0">

        <tr>
            <td><b>login</b></td>
            <td><input type = "text" name = "login" value = ""/></td>
        </tr>

        <tr>
            <td><b>password</b></td>
            <td><input type = "text" name = "password" value = ""/></td>
        </tr>

        <tr>
            <td colspan = "2"><input type = "submit" value = "Enter"/></td>
        </tr>
    </table>
</form>
</body>
</html>