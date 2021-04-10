<%--
  Created by IntelliJ IDEA.
  User: zhouhailin
  Date: 2021/4/3
  Time: 11:39 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<aside class="lyear-layout-sidebar">

    <!-- logo -->
    <div id="logo" class="sidebar-header">
        <%--        <h2 class="list-group-item-heading" >软件项目智慧调度及管理系统</h2>--%>
        <a href="${pageContext.request.contextPath }/system/gowelcome"><img src="../images/title.jpg"/></a>
    </div>
    <div class="lyear-layout-sidebar-scroll">

        <nav class="sidebar-main">
            <ul class="nav nav-drawer">
                <li class="nav-item"><a href="${pageContext.request.contextPath }/system/gowelcome"><i
                        class="mdi mdi-home"></i>后台首页</a></li>
                <li class="nav-item"><a href="${pageContext.request.contextPath }/fas/gopeople"><i
                        class="mdi mdi-account"></i>总人数</a></li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-palette"></i>1.需求</a>
                    <ul class="nav nav-subnav">
                        <li><a href="${pageContext.request.contextPath }/fas/gorequirement">录入需求</a></li>
                        <li><a href="${pageContext.request.contextPath }/fas/queryrequirement">查询需求</a></li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-creation"></i>2.设计</a>
                    <ul class="nav nav-subnav">
                        <li><a href="${pageContext.request.contextPath }/fas/godesign">录入设计</a></li>
                        <li><a href="${pageContext.request.contextPath }/fas/querydesign">查询设计</a></li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-apple-keyboard-command"></i>3.编码</a>
                    <ul class="nav nav-subnav">
                        <li><a href="${pageContext.request.contextPath }/fas/goencode">录入编码</a></li>
                        <li><a href="${pageContext.request.contextPath }/fas/queryencode">查询编码</a></li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-format-align-justify"></i>4.测试</a>
                    <ul class="nav nav-subnav">
                        <li><a href="${pageContext.request.contextPath }/fas/goexam">录入测试</a></li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-ungroup"></i>5.发布</a>
                    <ul class="nav nav-subnav">
                        <li><a href="${pageContext.request.contextPath }/fas/gopublish">录入发布</a></li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-chart-timeline"></i>6.维护</a>
                    <ul class="nav nav-subnav">
                        <li><a href="${pageContext.request.contextPath }/fas/gomaintenance">录入维护</a></li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-access-point"></i>调度结果</a>
                    <ul class="nav nav-subnav">
                        <li><a href="${pageContext.request.contextPath }/fas/fsaresult">结果</a></li>
                    </ul>
                </li>
            </ul>
        </nav>

        <jsp:include page="../system/footer.jsp"></jsp:include>
    </div>

</aside>
