<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Brands Index Page</title>
</head>
<body>
    <h1>添加品牌</h1>
  <form action="/tomcat-custom/addbrand" method="post">
    <div>
        <label for="brand_name">品牌名称:<input type="text" id="brand_name" name="brand_name" /></label><br>
        <label for="company_name">企业名称:<input type="text" id="company_name" name="company_name" /></label><br>
        <label for="ordered">排序:<input type="text" id="ordered" name="ordered" /></label><br>
        <label for="description">描述信息:<input type="text" id="description" name="description" /></label><br>
        <label for="status">状态:
            <input type="radio" name="status" value="1" id="status" />启用
            <input type="radio" name="status" value="0" id="status1" />禁用
        </label><br>
        <button type="submit">提交</button>
    </div>
  </form>
</body>
</html>