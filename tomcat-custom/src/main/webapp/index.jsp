<%--
  Created by IntelliJ IDEA.
  User: wover
  Date: 2023/2/4
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello Index Page</h1>
<%
    System.out.println("hello index page~");
    int i = 3;
%>
<%= "hello variables" + i%>
<%!
    String name = "张三";
    String show() {
        return name;
    }
%>
<%= name %>
<br/>
<%= show() %>
</body>
</html>
