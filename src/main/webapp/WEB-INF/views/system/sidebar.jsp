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
        <h4 class="list-group-item-heading" >软件项目智慧调度系统</h4>
    </div>
    <div class="lyear-layout-sidebar-scroll">

        <nav class="sidebar-main">
            <ul class="nav nav-drawer">
                <li class="nav-item"> <a href="${pageContext.request.contextPath }/system/gowelcome"><i class="mdi mdi-home"></i>后台首页</a> </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-palette"></i>需求</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="${pageContext.request.contextPath }/fas/gorequirement">需求input</a> </li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-apple-keyboard-command"></i>编码</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="${pageContext.request.contextPath }/fas/goencode">编码input</a> </li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-format-align-justify"></i>测试</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="${pageContext.request.contextPath }/fas/goexam">测试input</a> </li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-language-javascript"></i>发布</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="${pageContext.request.contextPath }/fas/gopublish">发布input</a> </li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-access-point"></i>FSA调度结果</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="${pageContext.request.contextPath }/fas/fsaresult">result</a> </li>
                    </ul>
                </li>
            </ul>
        </nav>

        <jsp:include page="../system/footer.jsp"></jsp:include>
    </div>

</aside>
