<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>进存销系统</title>
    <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
    <link rel="icon" href="../img/icon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- Fonts and icons -->
    <script src="../js/plugin/webfont/webfont.min.js"></script>

    <!-- CSS Files -->
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/azzara.min.css">

    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link rel="stylesheet" href="../css/demo.css">
</head>
<body>
<div class="wrapper">
    <!--
        Tip 1: You can change the background color of the main header using: data-background-color="blue | purple | light-blue | green | orange | red"
    -->
    <div class="main-header" data-background-color="purple">
        <!-- logo header -->
        <div class="logo-header">

            <a href="home" class="logo">
               <span style="color: cornsilk">销售系统</span>
            </a>
            <button class="navbar-toggler sidenav-toggler ml-auto" type="button" data-toggle="collapse" data-target="collapse" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon">
						<i class="fa fa-bars"></i>
					</span>
            </button>
            <button class="topbar-toggler more"><i class="fa fa-ellipsis-v"></i></button>
            <div class="navbar-minimize">
                <button class="btn btn-minimize btn-rounded">
                    <i class="fa fa-bars"></i>
                </button>
            </div>
        </div>
        <!-- End Logo Header -->


        <!-- Navbar Header -->
        <nav class="navbar navbar-header navbar-expand-lg">

            <div class="container-fluid">
                <div class="collapse" id="search-nav" style="width:70%">
                    <a href="salesOrder" style="color: cornsilk">历史销售订单</a>
                </div>
                <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <ul class="navbar-nav topbar-nav ml-md-auto align-items-center">
                    <li class="nav-item dropdown hidden-caret">
                        <a href="/login" style="color: cornsilk">退出</a>
                    </li>
                </ul>
            </div>
        </nav>
        <!-- End Navbar -->
    </div>

    <!-- Sidebar -->
    <div class="sidebar">

        <div class="sidebar-background"></div>
        <div class="sidebar-wrapper scrollbar-inner">
            <div class="sidebar-content">
<#--                侧边栏-->
                <#include "side_navigation.ftl">
            </div>
        </div>
    </div>
    <div class="main-panel">
        <div class="content">
            <div class="page-inner">
                <div class="page-header">
                    <h4 class="page-title">历史销售订单</h4>
                    <ul class="breadcrumbs">
                        <li class="nav-home">
                            <a href="/home">
                                首页
                            </a>
                        </li>
                        <li class="separator">
                            /
                        </li>
                        <li class="nav-item">
                            <a href="#">历史销售订单</a>
                        </li>
                    </ul>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-header">
                                <h4 class="card-title">历史销售订单</h4>
                            </div>
                            <div class="card-body">
                                <#list accessoriesLists as accessoriesList >
                                    <div class="modal fade" id="${accessoriesList.cid}" tabindex="-1" role="dialog" aria-hidden="true">
                                        <div class="modal-dialog" role="document">
                                            <div class="modal-content">
                                                <div class="modal-header no-bd">
                                                    <h5 class="modal-title">
														<span class="fw-mediumbold">
														订单</span>
                                                        <span class="fw-light">
															详情
														</span>
                                                    </h5>
                                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                        <span aria-hidden="true">&times;</span>
                                                    </button>
                                                </div>
                                                <div class="modal-body">
                                                    <p class="small">配置单详细信息</p>
                                                    <form>
                                                        <div id="ConfiguringSingle" class="row">
                                                            <table class="table">
                                                                <caption>基本的表格布局</caption>
                                                                <thead>
                                                                <tr>
                                                                    <th>产品型号</th>
                                                                    <th>产品配件</th>
                                                                    <th>数量</th>
                                                                    <th>套数</th>
                                                                    <th>价格</th>
                                                                </tr>
                                                                </thead>
                                                                <tbody>
                                                                <#assign sum1=0>
                                                                <#list accessoriesList.accessoriesListVoList as acc>
                                                                    <tr>
                                                                        <td>${acc.pnname}</td>
                                                                        <td>${acc.aname}</td>
                                                                        <td>${acc.num}</td>
                                                                        <td>${acc.packageNum}</td>
                                                                        <td>${acc.totalPrice?string('0.00')}</td>
                                                                        <#assign sum1= sum1+acc.totalPrice>
                                                                    </tr>
                                                                </#list>
                                                                <tr>
                                                                    <td colspan="4">总价</td>
                                                                    <td>${sum1?string('0.00')}</td>
                                                                </tr>
                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </form>
                                                </div>
                                                <div class="modal-footer no-bd">
                                                    <button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </#list>
                                <div class="table-responsive">
                                    <table id="basic-datatables" class="display table table-striped table-hover" >
                                        <thead>
                                        <tr>
                                            <th>报价单编号</th>
                                            <th>客户名称</th>
                                            <th>报价日期</th>
                                            <th>操作</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <#list configuringSingles as configuringSingle>
                                            <tr>
                                                <td>${configuringSingle.cid}</td>
                                                <td>${configuringSingle.clientName}</td>
                                                <td>${configuringSingle.saleDate?string('yyyy-MM-dd HH:mm:ss')}</td>
                                                <td>
                                                    <div class="form-button-action">
                                                        <button class="btn btn-primary btn-round ml-auto"  data-toggle="modal" data-target="#${configuringSingle.cid}" data-original-title="查看详细信息">
                                                            <span>查看</span>
                                                        </button>
                                                    </div>
                                                </td>
                                            </tr>
                                        </#list>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>
</div>
<!--   Core JS Files   -->
<script src="../js/core/jquery.3.2.1.min.js"></script>
<script src="../js/core/popper.min.js"></script>
<script src="../js/core/bootstrap.min.js"></script>

<!-- jQuery UI -->
<script src="../js/plugin/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
<script src="../js/plugin/jquery-ui-touch-punch/jquery.ui.touch-punch.min.js"></script>

<!-- jQuery Scrollbar -->
<script src="../js/plugin/jquery-scrollbar/jquery.scrollbar.min.js"></script>

<!-- Moment JS -->
<script src="../js/plugin/moment/moment.min.js"></script>

<!-- Chart JS -->
<script src="../js/plugin/chart.js/chart.min.js"></script>

<!-- jQuery Sparkline -->
<script src="../js/plugin/jquery.sparkline/jquery.sparkline.min.js"></script>

<!-- Chart Circle -->
<script src="../js/plugin/chart-circle/circles.min.js"></script>

<!-- Datatables -->
<script src="../js/plugin/datatables/datatables.min.js"></script>

<!-- Bootstrap Notify -->
<script src="../js/plugin/bootstrap-notify/bootstrap-notify.min.js"></script>

<!-- Bootstrap Toggle -->
<script src="../js/plugin/bootstrap-toggle/bootstrap-toggle.min.js"></script>

<!-- jQuery Vector Maps -->
<script src="../js/plugin/jqvmap/jquery.vmap.min.js"></script>
<script src="../js/plugin/jqvmap/maps/jquery.vmap.world.js"></script>

<!-- Google Maps Plugin -->
<script src="../js/plugin/gmaps/gmaps.js"></script>

<!-- Sweet Alert -->
<script src="../js/plugin/sweetalert/sweetalert.min.js"></script>

<!-- Azzara JS -->

<!-- Azzara DEMO methods, don't include it in your project! -->

<script>
    $(document).ready(function() {
        $('#basic-datatables').DataTable({
            "pageLength": 8,
            "bLengthChange": false, //开关，是否显示每页显示多少条数据的下拉框
            "aLengthMenu": [8],//设置每页显示数据条数的下拉选项
            'bFilter': true,  //是否使用内置的过滤功能（是否去掉搜索框）
            "bInfo": true, //开关，是否显示表格的一些信息(当前显示XX-XX条数据，共XX条)
            "bPaginate": true, //开关，是否显示分页器
            "bSort": false, //是否可排序
            "oLanguage": {
                "sProcessing": "正在加载数据，请稍后...",
                "sLengthMenu": "每页显示 _MENU_ 条记录",
                "sZeroRecords": "没有数据！",
                "sEmptyTable": "表中无数据存在！",
                "sInfo": "当前显示 _START_ 到 _END_ 条，共 _TOTAL_ 条记录",
                "sInfoEmpty": "显示0到0条记录",
                "sInfoFiltered": "共有 _MAX_ 条记录",
                "sSearch": "搜索:",
                "oPaginate": {
                    "sFirst": "首页",
                    "sPrevious": "上一页",
                    "sNext": "下一页",
                    "sLast": "末页"
                }
            },
        });
    });
</script>
</body>
</html>