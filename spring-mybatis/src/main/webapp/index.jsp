<%--
  Created by IntelliJ IDEA.
  User: 29134
  Date: 2024/8/5
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.js"></script>
<%--    <script type="text/javascript" src="webjars/jquery/3.6.0/jquery.min.js"></script>--%>
    <script type="text/javascript">
        $(function (){
            $("#btn").click(function (){
                var url="test/getJson";

                $.get(url,function (data){
                    console.log(data);
                    $("p:first").append(data.id)
                    $("p:last").append(data.username)
                })
            })
        })
    </script>
</head>
<body>
<h1>首页</h1>
<div>
    <p>
        <a href="test/toLogin">到登录页面</a>
    </p>
</div>
<div>
    <input type="button" value="button" id="btn">
</div>
<div>
    <p>id:</p>
    <p>姓名:</p>
</div>
</body>
</html>
