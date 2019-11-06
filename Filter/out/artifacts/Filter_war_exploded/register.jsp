<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/8/15
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="UploadServlet" method="post" enctype="multipart/form-data">
        用户名:<input type="text" name="username"><br>
        图片:<input type="file" name="file"><br>
        <input type="submit" value="注册">
    </form>
</body>
</html>
