<%--
  Created by IntelliJ IDEA.
  User: 29134
  Date: 2024/8/6
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
  <script src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.js"></script>
  <script>
    $(function (){
      $("#btn").click(function (){
        var param=$("#loginForm").serialize();
        var path=$("#path").val();
        var url="http://localhost:8080/spring/user/login";
        console.log(url);
        $.get(url,param,function (data){
          console.log("Jinru  AJAX")
          console.log(data)
        })
      })
    })
  </script>
</head>
<body>
<h2>用户登录</h2>
<div>
  <form id="loginForm">
    <input type="hidden" value="${pageContext.request.contextPath}" id="path">
    <p>
      用户名: <input type="text" name="userName">
    </p>
    <p>
      密码: <input type="password" name="password">
    </p>
    <p>
      <input type="button" value="登录" id="btn">
    </p>
  </form>
</div>
</body>
</html>
