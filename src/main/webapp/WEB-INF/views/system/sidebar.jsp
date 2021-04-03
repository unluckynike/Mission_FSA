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
        <h4>基于FSA调度cms系统</h4>
    </div>
    <div class="lyear-layout-sidebar-scroll">

        <nav class="sidebar-main">
            <ul class="nav nav-drawer">
                <li class="nav-item"> <a href="../system/gowelcome"><i class="mdi mdi-home"></i>后台首页</a> </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-palette"></i>需求</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="../requirement/gorequirement">需求input</a> </li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-format-align-justify"></i>编码</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="../enconding/goencoding">编码input</a> </li>
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
