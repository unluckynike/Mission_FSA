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
<jsp:include page="sidebar.jsp"></jsp:include>
<!--End 左侧导航-->

<!--头部信息-->
<jsp:include page="header.jsp"></jsp:include>
<!--End 头部信息-->

<!--页面主要内容-->
<main class="lyear-layout-content">

    <div class="container-fluid">

        <div class="row">

            <div class="col-lg-12">
                <div class="card">
                    <div class="card-header">
                        <h4>项目信息</h4>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                <tr>
                                    <th>#</th>
                                    <th>项目名称</th>
                                    <th>开始日期</th>
                                    <th>截止日期</th>
                                    <th>状态</th>
                                    <th>进度</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>设计新主题</td>
                                    <td>10/02/2020</td>
                                    <td>12/05/2020</td>
                                    <td><span class="label label-warning">待定</span></td>
                                    <td>
                                        <div class="progress progress-striped progress-sm">
                                            <div class="progress-bar progress-bar-warning" style="width: 45%;"></div>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>2</td>
                                    <td>网站重新设计</td>
                                    <td>01/03/2020</td>
                                    <td>12/04/2020</td>
                                    <td><span class="label label-success">进行中</span></td>
                                    <td>
                                        <div class="progress progress-striped progress-sm">
                                            <div class="progress-bar progress-bar-success" style="width: 30%;"></div>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>3</td>
                                    <td>模型设计</td>
                                    <td>10/10/2020</td>
                                    <td>12/11/2020</td>
                                    <td><span class="label label-warning">待定</span></td>
                                    <td>
                                        <div class="progress progress-striped progress-sm">
                                            <div class="progress-bar progress-bar-warning" style="width: 25%;"></div>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>4</td>
                                    <td>后台管理系统模板设计</td>
                                    <td>25/01/2020</td>
                                    <td>09/05/2020</td>
                                    <td><span class="label label-success">进行中</span></td>
                                    <td>
                                        <div class="progress progress-striped progress-sm">
                                            <div class="progress-bar progress-bar-success" style="width: 55%;"></div>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>5</td>
                                    <td>前端设计</td>
                                    <td>10/10/2020</td>
                                    <td>12/12/2020</td>
                                    <td><span class="label label-danger">未开始</span></td>
                                    <td>
                                        <div class="progress progress-striped progress-sm">
                                            <div class="progress-bar progress-bar-danger" style="width: 0%;"></div>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>6</td>
                                    <td>桌面软件测试</td>
                                    <td>10/01/2020</td>
                                    <td>29/03/2020</td>
                                    <td><span class="label label-success">进行中</span></td>
                                    <td>
                                        <div class="progress progress-striped progress-sm">
                                            <div class="progress-bar progress-bar-success" style="width: 75%;"></div>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>7</td>
                                    <td>APP改版开发</td>
                                    <td>25/02/2020</td>
                                    <td>12/05/2020</td>
                                    <td><span class="label label-danger">暂停</span></td>
                                    <td>
                                        <div class="progress progress-striped progress-sm">
                                            <div class="progress-bar progress-bar-danger" style="width: 15%;"></div>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>8</td>
                                    <td>Logo设计</td>
                                    <td>10/02/2020</td>
                                    <td>01/03/2020</td>
                                    <td><span class="label label-warning">完成</span></td>
                                    <td>
                                        <div class="progress progress-striped progress-sm">
                                            <div class="progress-bar progress-bar-success" style="width: 100%;"></div>
                                        </div>
                                    </td>
                                </tr>
                                </tbody>
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
