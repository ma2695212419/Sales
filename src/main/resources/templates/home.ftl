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
    <link rel="stylesheet" href="/layui/css/layui.css"  media="all">
    <link rel="stylesheet" type="text/css"
          href="http://cdn.datatables.net/1.10.15/css/jquery.dataTables.css">
    <link rel="stylesheet" type="text/css"
          href="https://cdn.datatables.net/buttons/1.5.6/css/buttons.dataTables.min.css">
    <!-- jQuery -->
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
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
                        </div>

                        <div class="card-body">
                            <#if (productNumbers[0].pnname)??>
                                <div class="table-responsive">
                                <table class="layui-hide" id="test" lay-filter="test"></table>
                                <table lay-filter="demo" id="demo" align="center"  class="display table table-striped table-hover" >
                                    <thead>
                                    <tr valign="middle" >
                                        <th lay-data="{field:'username'}">序号</th>
                                        <th lay-data="{field:'username1'}">名称</th>
                                        <th lay-data="{field:'username2'}">产品代码</th>
                                        <th lay-data="{field:'username3' }">描述</th>
                                        <th lay-data="{field:'num'}">数量</th>
                                        <th lay-data="{field:'price'}">单价</th>
                                        <th lay-data="{field:'package_num'}">套数</th>
                                        <th lay-data="{field:'total_price'}">总计</th>
                                        <th lay-data="{field:'username7',toolbar: '#barDemo'}">操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>${(navigation.psname)!}</td>
                                        <td>
                                            <div>
                                                <span>基础配置</span><br/>
                                                ${productNumbers[0].pnname}
                                                <span>升级选件</span>
                                                    无
                                            </div>
                                        </td>
                                        <td id="description" style="vertical-align: middle">
                                            ${productNumbers[0].description}
                                        </td>
                                        <td>
                                            1
                                        </td>
                                        <td id="price">
                                            ${productNumbers[0].price?int}
                                        </td>
                                        <td>
                                            0
                                        </td>
                                        <td id="total_price">
                                            ${productNumbers[0].price?int}
                                        </td>
                                        <td>

                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                            <#else>
                                <h3>此产品系列下无产品型号</h3>
                            </#if>

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

<div class="layui-row" id="popUpdateTest" style="display:none;">
    <div class="layui-col-md10">
        <form class="layui-form layui-from-pane"  style="margin-top:20px" >
            <div class="layui-form-item">
                <label class="layui-form-label">基础配置</label>
                <div class="layui-input-block">
                    <select class="selectpicker" id="basis">
                        <#list productNumbers as productNumber>
                            <option id="${productNumber_index}" value="${productNumber.pnid}" name="pnid">${productNumber.pnname}</option>
                        </#list>
                    </select>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">升级选件</label>
                <div class="layui-input-block">
                    <select class="selectpicker" id="accessories" multiple>
                        <option value="-1" selected>无</option>
                        <#list accessories as accessorie>
                            <option value="${accessorie.aid}" name="aid">${accessorie.aname}</option>
                        </#list>
                    </select>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">采购数量</label>
                <div class="layui-input-block">
                    <input type="text" id="mnum" name="num"  required  lay-verify="required" autocomplete="off" placeholder="请输入采集数量" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">采购套数</label>
                <div class="layui-input-block">
                    <input type="text" id="mpackage_num" name="neweqptName"  required  lay-verify="required" autocomplete="off" placeholder="请输入采集套数" class="layui-input">
                </div>
            </div>
            <div style="display:none;">
                <span id="price_1"></span>
            </div>

            <div class="layui-form-item" style="margin-top:40px">
                <div class="layui-input-block">
                    <button class="layui-btn  layui-btn-submit " lay-submit="" lay-filter="demo11">确认修改</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
        <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
        <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
    </div>
</script>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script src="/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use('table', function(){
        var table = layui.table;
        //转换静态表格
        table.init('demo', {
            height: 315 //设置高度
            ,limit: 10
            ,toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
            ,defaultToolbar: ['filter', 'exports', 'print']//注意：请务必确保 limit 参数（默认：10）是与你服务端限定的数据条数一致
            //支持所有基础参数
        });
        //头工具栏事件
        table.on('toolbar(demo)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id);
            switch(obj.event){
                case 'getCheckData':
                    var data = checkStatus.data;
                    layer.alert(JSON.stringify(data));
                    break;
                case 'getCheckLength':
                    var data = checkStatus.data;
                    layer.msg('选中了：'+ data.length + ' 个');
                    break;
                case 'isAll':
                    layer.msg(checkStatus.isAll ? '全选': '未全选');
                    break;

                //自定义头工具栏右侧图标 - 提示
                case 'LAYTABLE_TIPS':
                    layer.alert('这是工具栏右侧自定义的一个图标按钮');
                    break;
            };
        });

        //监听行工具事件
        table.on('tool(demo)', function(obj){
            var data = obj.data;
            //console.log(obj)
            if(obj.event === 'del'){
                layer.confirm('真的删除行么', function(index){
                    obj.del();
                    layer.close(index);
                });
            } else if(obj.event === 'edit'){
                console.log(data.price.trim())
                $("#mnum").val(data.num.trim())
                $("#mpackage_num").val(data.package_num.trim())
                $("#price_1").html(data.price.trim())
                layer.open({
                    type: 1 //此处以iframe举例
                    ,content: $("#popUpdateTest")
                });
            }
        });
    });
</script>
</html>