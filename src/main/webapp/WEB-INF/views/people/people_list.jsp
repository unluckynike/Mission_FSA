<%--
  Created by IntelliJ IDEA.
  User: zhouhailin
  Date: 2021/4/7
  Time: 6:13 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"/>
<title>智慧项目管理系统</title>
<link rel="icon" href="favicon.ico" type="image/ico">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/materialdesignicons.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.min.css">
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
                        <div class="alert alert-success" role="alert">项目总人数</div>
                        <form action="${pageContext.request.contextPath }/fas/setpeople" method="post">
                            <div class="form-group">
                                <label for="peoplecount">总人数</label>
                                <input class="form-control" name="peoplecount" id="peoplecount" placeholder="输入项目名总人数">
                            </div>
                            <button type="submit" id="confrm" class="btn btn-primary">确认</button>
                            <button type="reset" class="btn btn-default" target-form="add-form">撤销</button>
                            <button type="button" class="btn btn-default" onclick="javascript:history.back(-1);return false;">返 回</button>
                        </form>
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
