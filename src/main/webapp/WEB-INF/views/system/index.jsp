<%--
  Created by IntelliJ IDEA.
  User: zhouhailin
  Date: 2021/4/2
  Time: 7:10 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
<title>登录页面 </title>
<link rel="icon" href="../favicon.ico" type="image/ico">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/materialdesignicons.min.css" rel="stylesheet">
<link href="../css/style.min.css" rel="stylesheet">
<style>
    body {
        background-color: #fff;
    }
    .lyear-login-box {
        position: relative;
        overflow-x: hidden;
        width: 100%;
        height: 100%;
        -webkit-transition: 0.5s;
        -o-transition: 0.5s;
        transition: 0.5s;
    }
    .lyear-login-left {
        width: 50%;
        top: 0;
        left: 0;
        bottom: 0;
        position: fixed;
        height: 100%;
        z-index: 555;
        background-size: cover;
        background-repeat: no-repeat;
        background-position: center center;
    }
    .lyear-overlay {
        position: absolute;
        top: 0;
        bottom: 0;
        left: 0;
        right: 0;
        z-index: 10;
        background: rgba(0, 0, 0, 0.5);
    }
    .lyear-logo {
        margin-bottom: 50px;
    }
    .lyear-featured {
        z-index: 12;
        position: absolute;
        bottom: 0;
        padding: 30px;
        width: 100%;
    }
    .lyear-featured h4 {
        color: #fff;
        line-height: 32px;
    }
    .lyear-featured h4 small {
        color: #fff;
        display: block;
        text-align: right;
        margin-top: 15px;
    }
    .lyear-login-right {
        margin-left: 50%;
        position: relative;
        z-index: 999;
        padding: 100px;
        background-color: #fff;
    }
    @media screen and (max-width: 1024px) {
        .lyear-login-right {
            padding: 50px;
        }
    }
    @media screen and (max-width: 820px) {
        .lyear-login-left {
            width: 100%;
            position: relative;
            z-index: 999;
            height: 300px;
        }
        .lyear-login-right {
            margin-left: 0;
        }
    }
    @media screen and (max-width: 480px) {
        .lyear-login-right {
            padding: 50px;
        }
    }
    @media screen and (max-width: 320px) {
        .lyear-login-right {
            padding: 30px;
        }
    }
</style>
</head>

<body>
<div class="lyear-login-box">
    <div class="lyear-login-left" style="background-image: url(../images/discuss.jpg)">
        <div class="lyear-overlay"></div>
        <div class="lyear-featured">
            <h4>愿你有好运气，如果没有，愿你在不幸中学会慈悲；愿你被很多人爱，如果没有，愿你在寂寞中学会宽容。<small> - 刘瑜《愿你慢慢长大》</small></h4>
        </div>
    </div>
    <div class="lyear-login-right">

        <div class="lyear-logo text-center">
           <h2>基于遗传算法的软件项目智慧调度系统</h2>
        </div>
        <form action="../system/login" method="post">
            <div class="form-group">
                <label for="username">用户名</label>
                <input type="text" class="form-control" name="username" id="username" placeholder="请输入您的用户名">
            </div>

            <div class="form-group">
                <label for="password">密码</label>
                <input type="password" class="form-control" name="password" id="password" placeholder="请输入您的密码">
            </div>
            <div class="form-group">
                <button class="btn btn-block btn-primary" type="submit">立即登录</button>
            </div>
        </form>
        <jsp:include page="footer.jsp"></jsp:include>
    </div>
</div>
<br>
<a href="../system/gowelcome">gowelcome</a>

<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
</body>
</html>
