<%--
  Created by IntelliJ IDEA.
  User: zhouhailin
  Date: 2021/4/3
  Time: 9:43 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
    <title>FSA</title>
    <link rel="icon" href="../favicon.ico" type="image/ico">
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/materialdesignicons.min.css" rel="stylesheet">
    <link href="../css/style.min.css" rel="stylesheet">
</head>
<body>

<!--左侧导航-->
<aside class="lyear-layout-sidebar">

    <!-- logo -->
    <div id="logo" class="sidebar-header">
        <h4>基于FSA调度cms系统</h4>
    </div>
    <div class="lyear-layout-sidebar-scroll">

        <nav class="sidebar-main">
            <ul class="nav nav-drawer">
                <li class="nav-item"> <a href="../system/gowelcome"><i class="mdi mdi-home"></i>后台首页</a> </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-palette"></i>需求</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="../requirement/go">需求input</a></li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-format-align-justify"></i>编码</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="lyear_forms_elements.html">编码input</a></li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav active open">
                    <a href="javascript:void(0)"><i class="mdi mdi-file-outline"></i>测试</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="lyear_pages_doc.html"></a>测试input</li>
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

 <jsp:include page="footer.jsp"></jsp:include>
    </div>

</aside>
<!--End 左侧导航-->

<!--头部信息-->
<jsp:include page="header.jsp"></jsp:include>
<!--End 头部信息-->


<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/perfect-scrollbar.min.js"></script>
<!--标签插件-->
<script src="../js/jquery-tags-input/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="../js/main.min.js"></script>

</body>
</html>
