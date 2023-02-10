<%--
  Created by IntelliJ IDEA.
  User: wover
  Date: 2023/2/4
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${status == true}">
            <h1>启用</h1>
    </c:if>
    <c:if test="${status == false}">
        <h1>禁用</h1>
    </c:if>
    <table>


<c:forEach items="${brands}" var="brand" varStatus="order">
    <tr>
        <td>${order.index}</td>
        <td>${order.count}</td>
        <td>${brand.brandName}</td>
        <td>${brand.companyName}</td>
        <td>${brand.description}</td>
        <td>${brand.ordered}</td>
        <td>
            <c:if test="${brand.status == 1}">启用</c:if>
            <c:if test="${brand.status == 0}">禁用</c:if>
        </td>
    </tr>
</c:forEach>
    </table>

<c:forEach begin="0" end="10" step="1" var="i" varStatus="page">
    <a href="#">${i}</a>/<a href="#">${page.count}</a>
</c:forEach>
</body>
</html>
