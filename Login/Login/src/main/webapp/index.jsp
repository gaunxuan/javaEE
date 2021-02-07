<%@ page import="club.banyuan.User" %>
<%@ page language="java" pageEncoding="utf-8" %>
<html>
<body>
<h2>Hello World!</h2>

<form method="post" action="login">
    <div>
        <label>username:</label>
        <input type="text" name="username"/>
    </div>
    <div>
        <label>password:</label>
        <input type="password" name="password"/>
    </div>
    <div>
        <input type="submit" name="ok" value="login"/>
    </div>

</form>

<%

    for (int i = 0; i < 10; i++) {
%>
<div>Hello,world</div>
<%
    }
%>


<%--<%--%>
<%--    User user = new User("root","123456");--%>
<%--%>--%>
<%--<div>Username:<%=user.getUsername()%></div>--%>
<%--<div>Password:<%=user.getPassword()%></div>--%>


<jsp:useBean id="user" class="club.banyuan.User"/>
<jsp:setProperty name="user" property="username" param="user"/>
<jsp:setProperty name="user" property="password" param="pwd"/>
<div>Username
    <jsp:getProperty name="user" property="username"/>
</div>
<div>password
    <jsp:getProperty name="user" property="password"/>
</div>
</body>
</html>
