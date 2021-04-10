<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhouhailin
  Date: 2021/4/3
  Time: 1:33 下午
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
            <div class="col-lg-8">
                <div class="card">
                    <div class="card-body">
                        <div class="alert alert-success" role="alert">编码</div>
                        <form method="post" action="${pageContext.request.contextPath }/fas/addencode" class="site-form" accept-charset="UTF-8">
                            <div class="form-group">
                                <label for="projectname">项目编号</label>
                                <input  class="form-control" name="projectname" id="projectname" placeholder="输入项目名">
                            </div>
                            <div class="form-group">
                                <label for="personname">人员编号</label>
                                <input  class="form-control" name="personname" id="personname" placeholder="输入项目人员">
                            </div>
                            <div class="form-group">
                                <label for="worktime">工时</label>
                                <input  class="form-control" name="worktime" id="worktime" placeholder="请按小时为单位输入人员工时">
                            </div>
                            <button type="submit" id="confrm" class="btn btn-primary">确认</button>
                            <button type="reset" class="btn btn-default" target-form="add-form">撤销</button>
                            <button type="button" class="btn btn-default" onclick="javascript:history.back(-1);return false;">返 回</button>
                        </form>

                    </div>
                </div>
            </div>

            <div class="col-sm-6 col-lg-3">
                <div class="card">
                    <div class="card-header bg-success">
                        <h4>总人数</h4>
                        <ul class="card-actions">
                        </ul>
                    </div>
                    <div class="card-body">
                        <input class="form-control" type="text" id="example-disabled-input" name="example-disabled-input" placeholder="${peopelCount}" disabled>
                    </div>
                </div>
            </div>

            <div class="col-sm-6 col-lg-3">
                <div class="card">
                    <div class="card-header bg-success">
                        <button class="btn btn-success">编码列表</button>
                        <ul class="card-actions">
                        </ul>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered">
                                <thead>
                                <tr>
                                    <th>项目编号</th>
                                    <th>人员编号</th>
                                    <th>工时</th>
                                </tr>
                                </thead>
                                <c:forEach items="${encodes}" var="encode" varStatus="vs">
                                    <tbody>
                                    <tr>
                                        <td>${encode.projectname }</td>
                                        <td>${encode.personname }</td>
                                        <td>${encode.worktime }</td>
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

<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/perfect-scrollbar.min.js"></script>
<!--标签插件-->
<script src="../js/jquery-tags-input/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="../js/main.min.js"></script>

</body>
</html>
