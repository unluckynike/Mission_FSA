<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhouhailin
  Date: 2021/4/9
  Time: 8:50 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
    <title>编码</title>
    <link rel="icon" href="favicon.ico" type="image/ico">
    <link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath }/css/bootstrap.min.css" >
    <link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath }/css/materialdesignicons.min.css" >
    <link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath }/css/style.min.css" >
</head>
<body>

<div class="lyear-layout-container">

    <!--左侧导航-->
    <jsp:include page="../system/sidebar.jsp"></jsp:include>
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
                        <div class="card-toolbar clearfix">
                            <div class="toolbar-btn-action">
                                <a class="btn btn-warning m-r-5" href="#!"><i class="mdi mdi-block-helper"></i> 设计列表</a>
                            </div>
                        </div>
                        <div class="card-body">

                            <div class="table-responsive">
                                <table class="table table-bordered">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>项目编号</th>
                                        <th>人员编号</th>
                                        <th>工时</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                            <c:forEach items="${encodes}" var="encode" varStatus="vs">
                                    <tbody>
                                    <tr>
                                        <td>${encode.id }</td>
                                        <td>${encode.projectname }</td>
                                        <td>${encode.personname }</td>
                                        <td>${encode.worktime }</td>
                                        <td>
                                            <div class="btn-group">
                                                <a class="btn btn-xs btn-default" href="${pageContext.request.contextPath }/fas/editencode?id=${encode.id }" title="编辑" data-toggle="tooltip"><i class="mdi mdi-pencil"></i></a>
<%--                                                <a class="btn btn-xs btn-default" href="#!" title="查看" data-toggle="tooltip"><i class="mdi mdi-eye"></i></a>--%>
                                                <a class="btn btn-xs btn-default" href="${pageContext.request.contextPath }/fas/deleteencode?id=${encode.id }" title="删除" data-toggle="tooltip"><i class="mdi mdi-window-close"></i></a>
                                            </div>
                                        </td>
                                    </tr>
                                    </tbody>
                             </c:forEach>
                                </table>
                            </div>

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

</body>
</html>

