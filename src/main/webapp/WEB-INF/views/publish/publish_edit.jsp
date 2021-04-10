
<%--
  Created by IntelliJ IDEA.
  User: zhouhailin
  Date: 2021/4/9
  Time: 8:50 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"/>
    <title>发布</title>
    <link rel="icon" href="favicon.ico" type="image/ico">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/materialdesignicons.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.min.css">
</head>
<body>

<div class="lyear-layout-container">

    <!--左侧导航-->
    <jsp:include page="../system/sidebar.jsp"></jsp:include>
    <!--End 左侧导航-->

    <!--头部信息-->
    <jsp:include page="../system/header.jsp"></jsp:include>
    <!--End 头部信息-->
    <main class="lyear-layout-content">

        <div class="container-fluid">
            <div class="col-md-6">
                <c:forEach items="${publishInfor}" var="publish" varStatus="vs">
                <div class="card">
                    <div class="card-header"><h4>修改项目【 ${publish.projectname } 】</h4></div>
                    <c class="card-body">

                        <form class="form-horizontal" action="${pageContext.request.contextPath }/fas/doeditpublish?id=${publish.id}" method="post">
                            <div class="form-group">
                                <label class="col-md-3 control-label" for="projectname">项目编号</label>
                                <div class="col-md-7">
                                    <input class="form-control" type="text" id="projectname" name="projectname"
                                           value="${publish.projectname }">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-3 control-label" for="personname">人员编号</label>
                                <div class="col-md-7">
                                    <input class="form-control" type="text" id="personname" name="personname"
                                           value="${publish.personname }">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-3 control-label" for="worktime">工时</label>
                                <div class="col-md-7">
                                    <input class="form-control" type="text" id="worktime" name="worktime"
                                           value="${publish.worktime }">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-9 col-md-offset-3">

                                    <button type="submit" id="confrm" class="btn btn-primary">确认</button>
                                    <button type="reset" class="btn btn-default" target-form="add-form">撤销</button>
                                    <button type="button" class="btn btn-default" onclick="javascript:history.back(-1);return false;">返 回</button>

                                </div>
                            </div>
                        </form>
                        </c:forEach>
                </div>
            </div>

        </div>
</main>
</div>

<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/perfect-scrollbar.min.js"></script>
<!--标签插件-->
<script src="../js/jquery-tags-input/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="../js/main.min.js"></script>

</body>
</html>

