<%--
  Created by IntelliJ IDEA.
  User: zhouhailin
  Date: 2021/4/3
  Time: 4:50 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
    <title>错误页面</title>
    <link rel="icon" href="favicon.ico" type="image/ico">
    <link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath }/css/bootstrap.min.css" >
    <link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath }/css/materialdesignicons.min.css" >
    <link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath }/css/style.min.css" >
    <style>
        body{
            background-color: #fff;
        }
        .error-page {
            height: 100%;
            position: fixed;
            width: 100%;
        }
        .error-body {
            padding-top: 5%;
        }
        .error-body h1 {
            font-size: 210px;
            font-weight: 700;
            text-shadow: 4px 4px 0 #f5f6fa, 6px 6px 0 #33cabb;
            line-height: 210px;
            color: #33cabb;
        }
        .error-body h4 {
            margin: 30px 0px;
        }
    </style>
</head>

<body>
<section class="error-page">
    <div class="error-box">
        <div class="error-body text-center">
            <h1>404</h1>
            <h4>很抱歉，但是那个页面看起来已经不存在了。</h4>
            <button onclick="javascript:history.back(-1);return false;" class="btn btn-primary ">返回</button>
        </div>
    </div>
</section>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript">;</script>
</body>
</html>
