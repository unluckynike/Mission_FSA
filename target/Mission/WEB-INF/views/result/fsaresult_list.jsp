<%--
  Created by IntelliJ IDEA.
  User: zhouhailin
  Date: 2021/4/3
  Time: 1:53 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
    <title>FSA 调度结果</title>
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
 <p> FSA  调度算法结果</p>
        <div class="row">
            <div class="col-lg-12">
                <div class="card">
                    <div class="card-body">

                        <div class="masonry-grid" data-provide="photoswipe">

                            <a class="masonry-item" href="#">
<%--                                <img src="${pageContext.request.contextPath}/src/main/webapp/images/gallery/n.jpg" alt="The selected child description">--%>
                                <img src="../images/gallery/n.jpg" alt="The selected child description">
                            </a>

                            <a class="masonry-item" href="#">
                                <img src="../images/gallery/5.jpg" alt="The selected child description">
                            </a>

                            <a class="masonry-item" href="#">
                                    <img src="../images/gallery/2.jpg" alt="The selected child description">
                            </a>

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
