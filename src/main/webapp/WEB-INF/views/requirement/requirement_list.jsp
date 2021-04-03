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
                <li class="nav-item"> <a href="../system/gowelcome"><i class="mdi mdi-home"></i>后台首页</a> </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-palette"></i>需求</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="../requirement/requirement_list.jsp">需求input</a> </li>
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

        <jsp:include page="../system/footer.jsp"></jsp:include>
    </div>

</aside>
<!--End 左侧导航-->

<!--头部信息-->
<jsp:include page="../system/header.jsp"></jsp:include>
<!--End 头部信息-->

    <!--页面主要内容-->
    <main class="lyear-layout-content">

        <div class="container-fluid">

            <div class="row">
                <div class="col-lg-12">
                    <div class="card">
                        <div class="card-body">

                            <form method="post" action="../requirement/add" class="site-form" accept-charset="UTF-8">
                                <div class="form-group">
                                    <label for="projectname">项目名</label>
                                    <input  class="form-control" name="projectname" id="projectname" placeholder="输入项目名">
                                </div>
                                <div class="form-group">
                                    <label for="personname">人员姓名</label>
                                    <input  class="form-control" name="personname" id="personname" placeholder="输入项目人员">
                                </div>
                                <div class="form-group">
                                    <label for="worktingm">工时</label>
                                    <input  class="form-control" name="worktingm" id="worktingm" placeholder="请按小时为单位输入人员工时">
                                </div>
                                <button type="submit" id="confrm" class="btn btn-primary">确认</button>
                            </form>

                        </div>
                    </div>
                </div>

            </div>

        </div>

    </main>
    <!--End 页面主要内容-->


</div>

<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/perfect-scrollbar.min.js"></script>
<!--标签插件-->
<script src="../js/jquery-tags-input/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="../js/main.min.js"></script>

<%--<script>--%>

<%--    $(function(){--%>
<%--        $("#confrm").click(function() {--%>
<%--            $.ajax({--%>
<%--                url : "../requirement/add",--%>
<%--                type : "POST",--%>
<%--                dataType:"json",--%>
<%--                contentType : "application/json;charset=UTF-8",--%>
<%--                <!-- 向后端传输的数据 -->--%>
<%--                data : JSON.stringify({--%>
<%--                    projectname : $("#projectname").val(),--%>
<%--                    personname : $("#personname").val(),--%>
<%--                    worktingm : $("#worktingm").val(),--%>
<%--                }),--%>
<%--                success:function(result) {--%>
<%--                    <!-- 处理后端返回的数据 -->--%>
<%--                    var message= JSON.stringify(result);--%>
<%--                    console.log("mm:  "+message)--%>
<%--                },--%>
<%--                error:function(result){--%>
<%--                    console.log("faile ")--%>
<%--                }--%>
<%--            });--%>
<%--        });--%>
<%--    });--%>
<%--</script>--%>
</body>
</html>
