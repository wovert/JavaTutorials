<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Brands Index Page</title>
</head>
<body>
    <h1>添加品牌</h1>
  <form action="/tomcat-custom/updateBrand" method="post">
    <div>
        <input type="hidden" name="id" value="${brand.id}">
        <label for="brand_name">品牌名称:<input type="text" value="${brand.brandName}" id="brand_name" name="brand_name" /></label><br>
        <label for="company_name">企业名称:<input type="text" value="${brand.companyName}" id="company_name" name="company_name" /></label><br>
        <label for="ordered">排序:<input type="text" value="${brand.ordered}" id="ordered" name="ordered" /></label><br>
        <label for="description">描述信息:<input type="text" value="${brand.description}" id="description" name="description" /></label><br>
        <label for="status">状态:
            <c:if test="${brand.status == 0}">
                <input type="radio" name="status" value="1"  />启用
                <input type="radio" name="status" checked value="0" id="status"  />禁用
            </c:if>
            <c:if test="${brand.status == 1}">
                <input type="radio" name="status" checked value="1"  />启用
                <input type="radio" name="status"  value="0"  id="status2" />禁用
            </c:if>

        </label><br>
        <button type="submit">修改</button>
    </div>
  </form>
</body>
</html>