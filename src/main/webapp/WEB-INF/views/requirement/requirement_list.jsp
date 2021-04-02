<%--
  Created by IntelliJ IDEA.
  User: zhouhailin
  Date: 2021/4/2
  Time: 7:10 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
<title>需求（第一道工序)</title>
<link rel="icon" href="../favicon.ico" type="image/ico">
<link rel="stylesheet" type="text/css"  href="../css/bootstrap.min.css" >
<link rel="stylesheet" type="text/css"  href="../css/materialdesignicons.min.css" >
<link rel="stylesheet" type="text/css"  href="../css/style.min.css" >
</head>
<body>

<div class="lyear-layout-container">

<!--左侧导航-->
<aside class="lyear-layout-sidebar">

    <!-- logo -->
    <div id="logo" class="sidebar-header">
        <h4>基于FSA调度cms系统</h4>
    </div>
    <div class="lyear-layout-sidebar-scroll">

        <nav class="sidebar-main">
            <ul class="nav nav-drawer">
                <li class="nav-item"> <a href="#"><i class="mdi mdi-home"></i>后台首页</a> </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-palette"></i>需求</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="lyear_ui_buttons.html">需求input</a> </li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-format-align-justify"></i>编码</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="lyear_forms_elements.html">编码input</a> </li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav active open">
                    <a href="javascript:void(0)"><i class="mdi mdi-file-outline"></i>测试</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="lyear_pages_doc.html"></a> 测试input</li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-language-javascript"></i>编码</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="lyear_js_datepicker.html">编码input</a> </li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-access-point"></i>FSA调度结果</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="lyear_js_datepicker.html">result</a> </li>
                    </ul>
                </li>
            </ul>
        </nav>

        <div class="sidebar-footer">
            <p class="copyright">Copyright &copy; 2020. <a target="_blank" href="http://www.wulinzeng.vip">WuLiZeng</a> All rights reserved.</p>
        </div>
    </div>

</aside>
<!--End 左侧导航-->

<!--头部信息-->
<header class="lyear-layout-header">

    <nav class="navbar navbar-default">
        <div class="topbar">

            <div class="topbar-left">
                <div class="lyear-aside-toggler">
                    <span class="lyear-toggler-bar"></span>
                    <span class="lyear-toggler-bar"></span>
                    <span class="lyear-toggler-bar"></span>
                </div>
                <span class="navbar-page-title"> FSA - 调度 </span>
            </div>

            <ul class="topbar-right">
                <li class="dropdown dropdown-profile">
                    <a href="javascript:void(0)" data-toggle="dropdown">
                        <img class="img-avatar img-avatar-48 m-r-10" src="../images/users/avatar.jpg" alt="FSA调度" />
                        <span>WuLiZeng <span class="caret"></span></span>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-right">
                        <li> <a href="#"><i class="mdi mdi-account"></i> 个人信息</a> </li>
                        <li> <a href="#"><i class="mdi mdi-lock-outline"></i> 修改密码</a> </li>
                        <li> <a href="javascript:void(0)"><i class="mdi mdi-delete"></i> 清空缓存</a></li>
                        <li class="divider"></li>
                        <li> <a href="#"><i class="mdi mdi-logout-variant"></i> 退出登录</a> </li>
                    </ul>
                </li>

            </ul>

        </div>
    </nav>

</header>
<!--End 头部信息-->




</div>

<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/perfect-scrollbar.min.js"></script>
<!--标签插件-->
<script src="../js/jquery-tags-input/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="../js/main.min.js"></script>

</body>
</html>
