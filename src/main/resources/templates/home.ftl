<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>进存销系统</title>
    <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
    <link rel="icon" href="/img/icon.ico" type="image/x-icon"/>

    <!-- Fonts and icons -->
    <script src="/js/plugin/webfont/webfont.min.js"></script>

    <!-- CSS Files -->
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/azzara.min.css">  <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link rel="stylesheet" href="/css/demo.css">
    <link rel="stylesheet" type="text/css"
          href="http://cdn.datatables.net/1.10.15/css/jquery.dataTables.css">
    <link rel="stylesheet" type="text/css"
          href="https://cdn.datatables.net/buttons/1.5.6/css/buttons.dataTables.min.css">
    <!-- jQuery -->
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>

    <!-- DataTables -->
    <script type="text/javascript" charset="utf8"
            src="http://cdn.datatables.net/1.10.15/js/jquery.dataTables.js"></script>

    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/jszip-2.5.0/dt-1.10.18/b-1.5.6/b-flash-1.5.6/b-html5-1.5.6/datatables.min.css"/>

    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link href="https://cdn.bootcss.com/bootstrap-select/1.12.1/css/bootstrap-select.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap-select/1.12.1/js/bootstrap-select.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/v/dt/jszip-2.5.0/dt-1.10.18/b-1.5.6/b-flash-1.5.6/b-html5-1.5.6/datatables.min.js"></script>
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
                    <a href="/salesOrder" style="color: cornsilk">历史销售订单</a>
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
    <div class="main-panel">
        <div class="content">
            <div class="page-inner">
                <div class="page-header">
                    <h6 class="page-title">位置导航</h6>
                    <ul class="breadcrumbs">
                        <li class="nav-home">
                            <a href="/home">
                                首页
                            </a>
                        </li>
                        <li class="separator">
                            <i class="flaticon-right-arrow"></i>
                        </li>
                        <#if navigation?? >
                            <li class="nav-item">
                                <a href="#">${(navigation.psname)!}</a>
                            </li>
                        </#if>
                    </ul>
                </div>
            </div>
            <#if navigation?? >
                <div class="col-md-12">
                    <div class="card">
                        <div class="card-header d-flex align-items-center">
                            <h4 class="card-title">配置单信息</h4>
                            <button class="btn btn-primary btn-round ml-auto" id="addRowButton">
                                <i class="fa fa-plus"></i>
                                添加
                            </button>
                        </div>

                        <div class="card-body">
                            <#--编辑模态框-->
                            <div class="modal fade" id="editRowModal" tabindex="-1" role="dialog" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header no-bd">
                                            <h5 class="modal-title">
														<span class="fw-mediumbold">
														编辑</span>
                                                <span class="fw-light">

														</span>
                                            </h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            <p class="small"></p>
                                            <form>
<#--                                                <div class="form-group">-->
<#--                                                    <label for="exampleInputEmail1">名称</label>-->
<#--                                                    <input type="text" class="form-control" id="exampleInputEmail1" />-->

<#--                                                </div>-->
                                                <div class="form-group">
                                                    <label for="exampleInputPassword1">产品代码</label>
                                                    <input type="text" class="form-control" id="exampleInputPassword1" />
                                                </div>
<#--                                                <div class="form-group">-->
<#--                                                    <label for="exampleInputPassword2">描述</label>-->
<#--                                                    <input type="text" class="form-control" id="exampleInputPassword2" />-->
<#--                                                </div>-->
                                                <div class="form-group">
                                                    <label for="exampleInputPassword2">数量</label>
                                                    <input type="text" class="form-control" id="exampleInputPassword2" />
                                                </div>
                                                <div class="form-group">
                                                    <label for="exampleInputPassword2">套数</label>
                                                    <input type="text" class="form-control" id="exampleInputPassword2" />
                                                </div>
                                            </form>
                                        </div>
                                        <div class="modal-footer no-bd">
                                            <button type="button" id="addRowButton" class="btn btn-primary">保存</button>
                                            <button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="table-responsive">
                                <table id="basic-datatables" align="center"  class="display table table-striped table-hover" >
                                    <thead>
                                    <tr valign="middle" >
                                        <th style="width: 5%;text-align: center">序号</th>
                                        <th style="width: 11%;text-align: center">名称</th>
                                        <th style="width: 20%;text-align: center">产品代码</th>
                                        <th style="width: 25%;text-align: center">描述</th>
                                        <th style="width: 5%;text-align: center">数量</th>
                                        <th style="width: 6%;text-align: center">单价</th>
                                        <th style="width: 5%;text-align: center">套数</th>
                                        <th style="width: 10%;text-align: center">总计</th>
                                        <th style="width: 18%;text-align: center">操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr valign="middle" id="1" >
                                        <td style="vertical-align: middle;text-align: center">1</td>
                                        <td style="vertical-align: middle;text-align: center">${(navigation.psname)!}</td>
                                        <td style="vertical-align: middle">
                                            <span>基础配置</span><br/>
                                            <select class="selectpicker" id="basis" onchange="NUMchange(this.value)">
                                                <#list productNumbers as productNumber>
                                                    <option id="${productNumber_index}" value="${productNumber.pnid}" name="pnid">${productNumber.pnname}</option>
                                                </#list>
                                            </select>
                                            <span id="basisV" style="display: none"></span>
                                            <br/>
                                            <span>升级选件</span>
                                            <select class="selectpicker" id="accessories" multiple>
                                                <option value="-1" selected>无</option>
                                                <#list accessories as accessorie>
                                                    <option value="${accessorie.aid}" name="aid">${accessorie.aname}</option>
                                                </#list>
                                            </select>
                                            <span id="accessorieV"></span>
                                        </td>
                                        <td id="description" style="vertical-align: middle">
                                            ${productNumbers[0].description}
                                        </td>
                                        <td style="vertical-align: middle;text-align: center">
                                           <input value="1" style="border: 0px">
                                        </td>
                                        <td id="price" style="vertical-align: middle;text-align: center">
                                            ${productNumbers[0].price?int}
                                        </td>
                                        <td style="vertical-align: middle;text-align: center">
                                            <input value="1" style="border: 0px">
                                        </td>
                                        <td id="total_price" style="vertical-align: middle;text-align: center"></td>
                                        <td style="vertical-align: middle">
<#--                                            <button class="btn btn-primary btn-round ml-auto" data-toggle="modal" data-target="#editRowModal">-->
<#--                                                <i class="fa fa-plus"></i>-->
<#--                                                编辑-->
<#--                                            </button>-->
                                            <button class="btn btn-primary btn-round ml-auto" onclick="del()">
                                                <i class="fa fa-plus"></i>
                                                删除
                                            </button>
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </#if>
        </div>


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
</div>
</div>
<!--   Core JS Files   -->
<script src="/js/core/jquery.3.2.1.min.js"></script>
<script src="/js/core/popper.min.js"></script>
<script src="/js/core/bootstrap.min.js"></script>

<!-- jQuery UI -->
<script src="/js/plugin/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
<script src="/js/plugin/jquery-ui-touch-punch/jquery.ui.touch-punch.min.js"></script>

<!-- jQuery Scrollbar -->
<script src="/js/plugin/jquery-scrollbar/jquery.scrollbar.min.js"></script>

<!-- Moment JS -->
<script src="/js/plugin/moment/moment.min.js"></script>

<!-- Chart JS -->
<script src="/js/plugin/chart.js/chart.min.js"></script>

<!-- jQuery Sparkline -->
<script src="/js/plugin/jquery.sparkline/jquery.sparkline.min.js"></script>

<!-- Chart Circle -->
<script src="/js/plugin/chart-circle/circles.min.js"></script>

<!-- Datatables -->
<script src="/js/plugin/datatables/datatables.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/vfs_fonts.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/pdfmake.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.4.2/js/dataTables.buttons.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.4.2/js/buttons.flash.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.4.2/js/buttons.html5.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.4.2/js/buttons.print.js"></script>
<script src="/js/plugin/bootstrap-notify/bootstrap-notify.min.js"></script>

<!-- Bootstrap Toggle -->
<script src="/js/plugin/bootstrap-toggle/bootstrap-toggle.min.js"></script>

<!-- jQuery Vector Maps -->
<script src="/js/plugin/jqvmap/jquery.vmap.min.js"></script>
<script src="/js/plugin/jqvmap/maps/jquery.vmap.world.js"></script>

<!-- Google Maps Plugin -->
<script src="/js/plugin/gmaps/gmaps.js"></script>

<!-- Sweet Alert -->
<script src="/js/plugin/sweetalert/sweetalert.min.js"></script>

<!-- Azzara JS -->

<!-- Azzara DEMO methods, don't include it in your project! -->
<script>
    $(document).ready(function() {
        $('#basic-datatables').DataTable({
            dom: 'Bfrtip',
            buttons: [
                {
                    extend: 'excel',//使用 excel扩展
                    text: '导出本页',// 显示文字
                    exportOptions: {
                        //自定义导出选项
                        //如：可自定义导出那些列，那些行
                        //TODO...
                    }
                }
            ],
            "pageLength": 8,
            "bLengthChange": false, //开关，是否显示每页显示多少条数据的下拉框
            "aLengthMenu": [8],//设置每页显示数据条数的下拉选项
            'bFilter': false,  //是否使用内置的过滤功能（是否去掉搜索框）
            "bInfo": false, //开关，是否显示表格的一些信息(当前显示XX-XX条数据，共XX条)
            "bPaginate":false, //开关，是否显示分页器
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
    function numc(t) {
        console.log(t.value)
    }
    function package_numc(t) {
        let p = $("#price").html();
        console.log(p)
    }
    function NUMchange(t) {
        let descriptions = [];
        let prices = [];
        <#list productNumbers as productNumber>
            descriptions.push("${productNumber.description}");
            prices.push("${productNumber.price}");
        </#list>
        $("#description").html("");
        $("#description").html(descriptions[t-1]);
        $("#price").html("");
        $("#price").html(prices[t-1]);

    }
    $('#addRowButton').click(function() {
        $('#basic-datatables').dataTable().fnAddData([
            '<button class="btn btn-primary btn-round ml-auto" data-toggle="modal" data-target="#editRowModal">\n' +
            '                                                <i class="fa fa-plus"></i>\n' +
            '                                                编辑\n' +
            '                                            </button>',
            1
        ]);
    });
</script>

<script>
    function del() {
        $("#1").remove();
    }
</script>

<script>
    $("#basis").change(function(){
        let basisV = $("#basis").val()
        $("#basisV").text(basisV)
    });

    $("#accessorie").change(function(){
        let accessorieV = $("#accessorie").val()
        $("#accessorieV").text(accessorieV)
    });
</script>

</body>
</html>