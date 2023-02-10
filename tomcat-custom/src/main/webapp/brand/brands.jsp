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
    <title>所有品牌列表</title>
</head>
<body>
<a href="/tomcat-custom/brand/add.jsp">新增</a>
<table>
    <tr>
        <th>编号</th>
        <th>品牌名</th>
        <th>公司名</th>
        <th>描述</th>
        <th>排序</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
<c:forEach items="${brands}" var="brand" varStatus="order">
    <tr>
        <td>${order.count}</td>
        <td>${brand.brandName}</td>
        <td>${brand.companyName}</td>
        <td>${brand.description}</td>
        <td>${brand.ordered}</td>
        <td>
            <c:if test="${brand.status == 1}">启用</c:if>
            <c:if test="${brand.status == 0}">禁用</c:if>
        </td>
        <td>
            <a href="/tomcat-custom/updateBrandById?id=${brand.id}">修改</a> | <a href="#">删除</a>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
